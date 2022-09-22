package co.com.choucair.certification.proyectobase.stepdefinitions.Choucair;

import co.com.choucair.certification.proyectobase.model.UTestData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class certificationStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^we want to optimize how we register new users into the web page$")
    public void we_want_to_optimize_how_we_register_new_users_into_the_web_page() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }


    @When("^The user clicks on the option to register and proceeds to complete the form$")
    public void The_user_clicks_on_the_option_to_register_and_proceeds_to_complete_the_form(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.SingIn(uTestData.get(0).getStr_First_Name(), uTestData.get(0).getStr_Last_Name(),uTestData.get(0).getStr_Email()),
                (Register2.SignIn(uTestData.get(0).getStr_City(),uTestData.get(0).getStr_Zip(),uTestData.get(0).getStr_Country())),
                (Register3.SignUp(uTestData.get(0).getStr_Computer(),uTestData.get(0).getStr_Version(), uTestData.get(0).getStr_Language(), uTestData.get(0).getStr_MobilDev(),uTestData.get(0).getStr_Model(), uTestData.get(0).getStr_OS())),
                (Register4.SignUp(uTestData.get(0).getStr_Pass())));
    }


    @Then("^The form was completed successfully$")
    public void The_form_was_completed_successfully(List<UTestData> uTestData) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStr_Platform_Text())));
    }

}


