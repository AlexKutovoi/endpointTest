import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class UserTest {

    @Test
    @DisplayName("valid status test")
    public void validUserTest() {
    ValidatableResponse response = new User().checkUser();
    int statusCode = response.extract().statusCode();
    Assert.assertEquals("invalid code", 200, statusCode);
    }

}
