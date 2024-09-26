package org.example.testNg_restAssured_CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class BDDstyle {

    @Test
    public static void testpost() {
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "           }";

        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON).log()
                .all().body(payload).when()
                .post().then().log()
                .all().statusCode(200);
    }
}
