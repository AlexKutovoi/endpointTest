import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MainPage {

    public RequestSpecification getBaseSpec() {
        return new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/api/single_user")
                .setContentType(ContentType.JSON)
                .build();
    }
}
