package org.example.POJO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class Post_Hashmap {
    // Hashmap Payload

    @Test
    public void test_post_with_hashmap() {

        Map<String, Object> jsonBodyUsingMap = new LinkedHashMap<>();
        jsonBodyUsingMap.put("username", "admin");
        jsonBodyUsingMap.put("password", "password123");


        System.out.println(jsonBodyUsingMap);


        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON).log()
                .all().body(jsonBodyUsingMap).when()
                .post().then().log()
                .all().statusCode(200);


    }

}
