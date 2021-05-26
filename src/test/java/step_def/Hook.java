package step_def;

import utils.ConfigurationReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static io.restassured.RestAssured.*;
import io.cucumber.java.Scenario;

public class Hook {

    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println(scenario.getName());
        System.out.println("BEFORE");
            baseURI= ConfigurationReader.getProperty("baseUri");
    }

    @After
    public void teardown(Scenario scenario){
            reset();
    }
}


