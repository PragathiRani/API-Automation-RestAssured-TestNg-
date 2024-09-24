package org.example.testNG_restAssured_CRUD.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class BDDStyleGET {
//    public static void main(String[] args) {
        // GET Request - https://api.zippopotam.us/IN/560037
        // URL
        // HEADER ?
        // GET Method
        // base url = https://api.zippopotam.us
        // basePath = /IN/560037
        // PaYLOAD - ? NO
        // Auth - Basic, Digest, JWT, Bearer Token, OAuth 2.0 ? = No

        // Verification
        // Status Code
        // Response Body
        // Time, Headers ,Cookies

        // Gherkin -> Given, When, then -> Style ->

        // BDD - Framework different - Gherkin Syntax - (given, when, then)
        // Non BDD and still Gherkin syntax (using classes)


        // given ->
        // URL
        // HEADER ?, Cookies
        // base url = https://api.zippopotam.us
        // basePath = /IN/560037
        // Auth - Basic, Digest, JWT, Bearer Token, OAuth 2.0 ? = No


        // When  ->
        // PaYLOAD - ? NO/yES - JSON. XML  -> String, Hashmap, Object class
        // GET Method



        // Then()
        // Response Validation
        //  Status Code
        //  Response Body
        //  Time, Headers ,Cookies

//        test1();
//        test2();

    @Test
    private static void test1() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .when()
                .log().all().get().
                then()
                .log().all().statusCode(200);
    }

//    @Test
//    private static void test2() {
//        RestAssured.giv
//        en().baseUri("https://restful-booker.herokuapp.com")
//                .basePath("/booking")
//                .when()
//                .log().all().get()
//                .then()
//                .log().all().statusCode(404);
//    }
}
