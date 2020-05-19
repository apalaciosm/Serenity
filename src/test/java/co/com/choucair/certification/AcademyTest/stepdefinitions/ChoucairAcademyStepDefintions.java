package co.com.choucair.certification.AcademyTest.stepdefinitions;

import co.com.choucair.certifitation.AcademyTest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Andres wants to learn automation at the academy Choucair$")
    public void thanAndresWantsToLearnAutomationAtTheAcademyChoucair()  {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage());

    }


    @When("^he search for the course Recursos Automatizacion Bancolombia on the choucair Academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform()  {

    }

    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia()  {

    }


}
