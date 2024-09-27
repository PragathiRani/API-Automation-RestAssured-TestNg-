package org.example.POJO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Post_PojoClass {
    @Test
    public void test_post_with_class(){
        Auth auth = new Auth();
        auth.setUsername("admin");
        auth.setPassword("password123");

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .when().body(auth).post().then().log().all().statusCode(200);

    }
}
