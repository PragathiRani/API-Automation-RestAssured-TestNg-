package org.example.testNg_restAssured_CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDPUTStyle {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    // 6118
    // Token -  Token?
    // Payload - {
    //    "firstname" : "Pramod",
    //    "lastname" : "Brown",
    //    "totalprice" : 111,
    //    "depositpaid" : true,
    //    "bookingdates" : {
    //        "checkin" : "2018-01-01",
    //        "checkout" : "2019-01-01"
    //    },
    //    "additionalneeds" : "Breakfast"
    //}


    // POST - Auth - token
    // POST - Booking ID
    // PUT - token and BookingID


//    public void get_token(){
//
//    }
//
//    public void get_booking_id(){
//        return bookingid;
//    }

//    public void get_token(){
//
//    }
//
//    public void get_bookingid(){
//        return get_bookingid();
//    }

    @Test
    public void test_put_positive_tc(){
        // POST - Auth - token

        String token  = "4ae67e3817321bd";
        String bookingid = "2529";

        String payloadPUT= "{\n" +
                "    \"firstname\" : \"Praveen\",\n" +
                "    \"lastname\" : \"Iyli\",\n" +
                "    \"totalprice\" : 9972,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-09-20\",\n" +
                "        \"checkout\" : \"2024-09-20\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);
        requestSpecification.body(payloadPUT).log().all();

        Response response = requestSpecification.when().put();


        // Get Validatable response to perform validation
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

    }
}
