package org.example.Gson;

import com.google.gson.Gson;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class DeSerialization {
    RequestSpecification r = RestAssured.given();
    Response response;

    @Description("TC#1 - Verify that create booking is working with valid payload")
    @Test
    public void test_Serialization() {
        //Json to String
        Booking booking = new Booking();
        booking.setFirstname("Pragathi");
        booking.setLastname("Rani");
        booking.setTotalprice(123);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("BreakFast");

        Bookingdates createBookingdatePojo = new Bookingdates();
        createBookingdatePojo.setCheckin("2022-01-01");
        createBookingdatePojo.setCheckout("2022-01-10");
        booking.setBookingdates(createBookingdatePojo);

        //Serialization using GSON
        Gson gson = new Gson();
        String jsonStringpayload = gson.toJson(booking);

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";

        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON).log().all();
        r.body(jsonStringpayload);

        response = r.when().log().all().post();
        String responseString = response.asString();

        // Parse - DeSerilization
        BookingRespons bookingResponse = gson.fromJson(responseString, BookingRespons.class);
        System.out.println(bookingResponse.getBookingid());
        System.out.println();

        assertThat(bookingResponse.getBooking().getFirstname()).isEqualTo("Pragathi").isNotEmpty().isNotNull();


    }
}