package tests;

import hooks.restAssuredHooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.Epic;
import org.junit.runner.RunWith;

@Epic("Тесты по API")
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"apiSteps","hooks"},
        tags = "@Reg or @RickAndMorty",
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "json:target/cucumber.json"}
)
public class RunTest extends restAssuredHooks {

}
