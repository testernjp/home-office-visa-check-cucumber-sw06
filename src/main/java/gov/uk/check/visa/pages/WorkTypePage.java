package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());


    @CacheLookup
    @FindBy(id = "response-0")
    WebElement planningToWork;
    @CacheLookup
    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continueButtonPlanning;
    @CacheLookup
    @FindBy(css = "body > div:nth-child(6) > div:nth-child(1) > main:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(1)")
    WebElement actualTextVisaToWork;

    @CacheLookup
    @FindBy(css = "body div[id='wrapper'] div[class='smart_answer'] main[id='content'] div[class='govuk-grid-row'] div[id='result-info'] div[data-flow-name='check-uk-visa'] div[class='govuk-!-margin-bottom-6'] h2:nth-child(1)")
    WebElement elementyouMayNeedVisa;

    public void selectPlanningToWork() {
        log.info("selectPlanningToWork: " + planningToWork.toString());
        clickOnElement(planningToWork);
    }

    public void selectContinueButtonOnPlanningToWorkPage() {
        log.info("selectContinueButtonOnPlanningToWorkPage: " + continueButtonPlanning.toString());
        clickOnElement(continueButtonPlanning);
    }

    public void verifyTextVisaToWork(String expectedText) {
        log.info("verifyTextVisaToWork: " + actualTextVisaToWork.toString());
        Assert.assertEquals(getTextFromElement(actualTextVisaToWork), expectedText, "Error");
    }

    public void verifyYouMayNeedVisa() {
        log.info("verifyYouMayNeedVisa: " + elementyouMayNeedVisa.toString());
        Assert.assertEquals(getTextFromElement(elementyouMayNeedVisa), "You may need a visa", "Error");
    }
}