package apiMethods;

import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class ApiMethods {

    public Response postMethod(JSONObject body, String baseUrl, String postUrl, int statusCode, String contentType, String charset){
        return given()
                .header("Content-type",contentType)
                .header("charset",charset)
                .baseUri(baseUrl)
                .body(body.toString())
                .when()
                .post(postUrl)
                .then()
                .log().body()
                .statusCode(statusCode)
                .extract().response();
    }

    public Response getMethod(String baseUrl, String getUrl, int statusCode, String contentType, String charset){
        return given()
                .header("Content-type",contentType)
                .header("charset",charset)
                .baseUri(baseUrl)
                .when()
                .get(getUrl)
                .then()
                .log().body()
                .statusCode(statusCode)
                .extract().response();
    }
}