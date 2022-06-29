import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class User extends MainPage {

    @Step
    public ValidatableResponse checkUser() {
        return given()
                .spec(getBaseSpec())
                .when()
                .get()
                .then();
    }

}
