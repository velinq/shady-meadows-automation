package api.client;

import api.models.request.AuthCredentials;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthApi extends BaseApiClient {
    private static final String AUTH_ENDPOINT = "/auth/login";

    public Response login(AuthCredentials credentials) {
        return given()
                .spec(getBaseSpec())
                .body(credentials)
                .when()
                .post(AUTH_ENDPOINT)
                .then()
                .extract()
                .response();
    }
}
