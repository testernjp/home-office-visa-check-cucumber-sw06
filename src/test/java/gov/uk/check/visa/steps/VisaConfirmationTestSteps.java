package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConfirmationTestSteps {
    @Given("I am on Home Page")
    public void iAmOnHomePage() {
    }

    @When("Click on start button")
    public void clickOnStartButton() {
        new StartPage().clickOnStart();
    }

    @And("Select a Nationality {string}")
    public void selectANationality(String nationality) {
        new SelectNationalityPage().selectNationalityName(nationality);
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        new SelectNationalityPage().clickOnContinue();
    }

    @And("Select reason {string}")
    public void selectReasonTourism(String reason) throws InterruptedException {
        new ReasonForTravelPage().selectReason(reason);
    }

    @Then("verify result You will not need a visa to come to the UK")
    public void verifyResultYouWillNotNeedAVisaToComeToTheUK() {
        new ReasonForTravelPage().verifyText();
    }

    @And("Select intendent to stay for longer than six months")
    public void selectIntendentToStayForLongerThanSixMonths() {
        new DurationOfStayPage().selectIntentionToStay();

    }

    @And("Select have planning to work for {string}")
    public void selectHavePlanningToWorkFor(String workFor) {
        new WorkTypePage().selectPlanningToWork();
    }

    @Then("verify result You need a visa to work in health and care")
    public void verifyResultYouNeedAVisaToWorkInHealthAndCare() {
        new WorkTypePage().verifyTextVisaToWork("You do not need a visa for some business and academic activities, but you must get a visa if you plan to work in the UK");
    }

    @Then("verify result You’ll need a visa to join your family or partner in the UK")
    public void verifyResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK() {
        new WorkTypePage().verifyYouMayNeedVisa();
    }
}