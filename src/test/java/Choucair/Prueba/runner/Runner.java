package Choucair.Prueba.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Test.feature", glue="Choucair.Prueba.definitions", tags= "@tag12")
//
public class Runner {

}
