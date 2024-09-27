package org.example.Gson;

import com.google.gson.Gson;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Serialization {

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

        Bookingdates createBookingdatePojo=new Bookingdates();
        createBookingdatePojo.setCheckin("2022-01-01");
        createBookingdatePojo.setCheckout("2022-01-10");
        booking.setBookingdates(createBookingdatePojo);

        //Serialization using GSON
        Gson gson=new Gson();
        String bookingStringPayload = gson.toJson(booking);
        System.out.println(bookingStringPayload);
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .contentType(ContentType.JSON)
                .when().body(bookingStringPayload).post()
                .then().log().all().statusCode(200);
    }
}
