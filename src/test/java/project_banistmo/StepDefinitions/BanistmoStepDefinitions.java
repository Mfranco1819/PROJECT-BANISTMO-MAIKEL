package project_banistmo.StepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import project_banistmo.interations.SwitchPage;
import project_banistmo.model.PDFdata;
import project_banistmo.questions.Answer;
import project_banistmo.tasks.OpenUp;
import project_banistmo.tasks.Search;

import java.util.List;

public class BanistmoStepDefinitions {

@Before
public void setStage(){
    OnStage.setTheStage(new OnlineCast());

}


    @Given("^the user wants to download pdf file from the page banistmo$")
    public void theUserWantsToDownloadPdfFileFromThePageBanistmo() {
    OnStage.theActorCalled("Maikel").wasAbleTo(OpenUp.thePage());

    }

    @When("^the user search the document$")
    public void theUserSearchTheDocument() {
    OnStage.theActorInTheSpotlight().attemptsTo(Search.PDFfile(), SwitchPage.website());

    }

    @Then("^PDF validation is successful$")
    public void pdfValidationIsSuccessful(List<PDFdata> data) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.compare(data)));


    }


}
