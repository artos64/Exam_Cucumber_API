package tests;

import hooks.restAssuredHooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.Epic;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/test.feature",
        glue = {"apiSteps","hooks"},
        tags = "@Test",
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "json:target/cucumber.json"}
)


@Epic("Тесты по API")
public class RunTest extends restAssuredHooks {

}
