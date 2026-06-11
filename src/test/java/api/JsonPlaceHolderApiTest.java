package api;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.Matchers.*;
@Epic("API Automation")
@Feature("JsonPlaceHolder API")
public class JsonPlaceHolderApiTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = ConfigReader.getProperty("apiBaseUrl");
    }

    /*
     * TC01
     * Objective:
     * Validate GET /posts endpoint.
     *
     * Validation:
     * 1. Status code should be 200
     */
    @Test
    public void getPostsShouldReturnStatus200() {

        given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200);
    }

    /*
     * TC02
     * Objective:
     * Validate GET /posts/1 endpoint.
     *
     * Validation:
     * 1. Status code should be 200
     * 2. ID should be 1
     * 3. userId should be 1
     * 4. title should not be null
     * 5. body should not be null
     */
    @Test
    public void getPostByIdShouldValidateFields() {

        given()
                .when()
                .get("/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("userId", equalTo(1))
                .body("title", notNullValue())
                .body("body", notNullValue());
    }

    /*
     * TC03
     * Objective:
     * Validate GET /users endpoint.
     *
     * Validation:
     * 1. Status code should be 200
     * 2. Total user count should be 10
     */
    @Test
    public void getUsersShouldReturnCount10() {

        given()
                .when()
                .get("/users")
                .then()
                .statusCode(200)
                .body("size()", equalTo(10));
    }

    /*
     * TC04
     * Objective:
     * Validate POST /posts endpoint.
     *
     * Validation:
     * 1. Resource should be created
     * 2. Status code should be 201
     */
    @Test
    public void createPostShouldReturnStatus201() {

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("title", "My Test Title");
        requestBody.put("body", "My Test Body");
        requestBody.put("userId", 1);

        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201);
    }

    /*
     * TC05
     * Objective:
     * Validate POST response data.
     *
     * Validation:
     * 1. title should match request
     * 2. body should match request
     * 3. userId should match request
     */
    @Test
    public void createPostShouldValidateResponseBody() {

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("title", "My Test Title");
        requestBody.put("body", "My Test Body");
        requestBody.put("userId", 1);

        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .body("title", equalTo("My Test Title"))
                .body("body", equalTo("My Test Body"))
                .body("userId", equalTo(1));
    }

    /*
     * TC06
     * Objective:
     * Validate PUT /posts/1 endpoint.
     *
     * Validation:
     * 1. Full record update
     * 2. Status code should be 200
     * 3. Updated values should be returned
     */
    @Test
    public void updatePostUsingPutShouldValidateFullUpdate() {

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("id", 1);
        requestBody.put("title", "Updated Title");
        requestBody.put("body", "Updated Body");
        requestBody.put("userId", 1);

        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/posts/1")
                .then()
                .statusCode(200)
                .body("title", equalTo("Updated Title"))
                .body("body", equalTo("Updated Body"));
    }

    /*
     * TC07
     * Objective:
     * Validate PATCH /posts/1 endpoint.
     *
     * Validation:
     * 1. Partial update should work
     * 2. Status code should be 200
     * 3. Updated title should be returned
     */
    @Test
    public void updatePostUsingPatchShouldValidatePartialUpdate() {

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("title", "Patched Title");

        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .patch("/posts/1")
                .then()
                .statusCode(200)
                .body("title", equalTo("Patched Title"));
    }

    /*
     * TC08
     * Objective:
     * Validate DELETE /posts/1 endpoint.
     *
     * Validation:
     * 1. Delete request should succeed
     * 2. Status code should be 200
     */
    @Test
    public void deletePostShouldReturnSuccessfulResponse() {

        given()
                .when()
                .delete("/posts/1")
                .then()
                .statusCode(anyOf(equalTo(200), equalTo(204)));
    }

    /*
     * TC09
     * Objective:
     * Validate filtered GET request.
     *
     * Validation:
     * 1. userId filter should work
     * 2. All records should belong to userId=1
     */
    @Test
    public void getPostsByUserIdShouldReturnOnlyUserId1() {

        given()
                .queryParam("userId", 1)
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .body("userId", everyItem(equalTo(1)));
    }

    /*
     * TC10
     * Objective:
     * Validate API performance.
     *
     * Validation:
     * 1. Response time should be less than 2000 ms
     */
    @Test
    public void getPostsShouldReturnResponseWithin2000Ms() {

        given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .time(lessThan(2000L));
    }
}