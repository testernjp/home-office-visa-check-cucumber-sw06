package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement reasonForTravelCheckBox;
    @CacheLookup
    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continueButtonOnReason;
    @CacheLookup
    @FindBy(id="response-0")
    WebElement reasonForTravelCheckBox1;

    @CacheLookup
    @FindBy(id ="response-1")
    WebElement reasonForTravelCheckBox2;
    @CacheLookup
    @FindBy(id ="response-4")
    WebElement reasonForTravelCheckBox4;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement verifyreason1;
    public void selectReason(String reason) throws InterruptedException {
        Thread.sleep(2000);
        log.info("selectReason " + reasonForTravelCheckBox2.toString());
        if (reason.contains("Tourism")){
            clickOnElement(reasonForTravelCheckBox1);
        } else if(reason.contains("Work")){
            clickOnElement(reasonForTravelCheckBox2);
        } else {
            clickOnElement(reasonForTravelCheckBox4);
        }}
    public void selectReasonForTravel1(String reason1){
        log.info("selectReasonForTravel1 " + reasonForTravelCheckBox1.toString());
        clickOnElement(reasonForTravelCheckBox1);
    }
    public void selectReasonForTravel4(String reason1){
        log.info("selectReasonForTravel4 " + reasonForTravelCheckBox4.toString());
        clickOnElement(reasonForTravelCheckBox4);
    }
    public void selectContinueButtonOnReasonPage(){
        log.info("selectContinueButtonOnReasonPage " + continueButtonOnReason.toString());
        clickOnElement(continueButtonOnReason);
    }
    public void verifyText(){
        log.info("verifyText " + verifyreason1.toString());
        Assert.assertEquals(getTextFromElement(verifyreason1),"You will not need a visa to come to the UK", "Error");
}
}