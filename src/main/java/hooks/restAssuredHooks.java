package hooks;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public class restAssuredHooks {
    @BeforeEach
    public void before(){
        RestAssured.filters(new AllureRestAssured());
    }
}
