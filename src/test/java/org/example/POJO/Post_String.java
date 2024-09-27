package org.example.POJO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Post_String {
    // String Payload

    @Test
    public void test_post_with_string(){
        String payload = "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";

        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON).log()
                .all().body(payload).when()
                .post().then().log()
                .all().statusCode(200);
    }
}
