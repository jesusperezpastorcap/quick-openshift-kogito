package com.ibm.sample;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class PricingTest {

    @Test
    public void testBasePrice() {
        given()
          .body("{ \"Age\": 47, \"Previous incidents?\": false }")
          .contentType(ContentType.JSON)
          .when()
            .post("/pricing")
          .then()
            .statusCode(200)
           ;
    }
}
