package testRunner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import util.DriverUtil;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber","json:target/cucumber-report.json", "com.cucumber.listener.ExtentCucumberFormatter:resources/report.html"},
        features = {"./src/test/resources"},
        tags = {"~@Test","@SignIn"},
        glue = {"steps"},
        monochrome = true
)

public class RunnerClass {

    @BeforeClass
    public static void startSession(){
        DriverUtil driverUtil = new DriverUtil();
        driverUtil.setDriver("firefox");
    }

    @AfterClass

    public static void endSession(){
       /* DriverUtil driverUtil = new DriverUtil();
        driverUtil.closeDriver();*/

        Reporter.loadXMLConfig(new File("C:\\Users\\efost\\IdeaProjects\\SeleniumAccessElearn\\src\\test\\resources\\Extent - config.xml"));
        Reporter.setSystemInfo("User Name", "AccessElearn");
        Reporter.setSystemInfo("Application Name", "AccesseLEARN AUTOMATION");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name"));
        Reporter.setSystemInfo("Environment", "Training");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");

    }


}
