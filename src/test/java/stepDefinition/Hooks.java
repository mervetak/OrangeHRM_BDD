package stepDefinition;

import com.OrangeHRM.base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        BasePage.initializeDriver();
    }

    @After
    public void teardown(){
        BasePage.tearDown();
    }

}
