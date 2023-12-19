package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());


    @CacheLookup
    @FindBy(css = "body div[id='wrapper'] div[class='smart_answer'] main[id='content'] div[class='govuk-grid-row'] div[id='result-info'] div[data-flow-name='check-uk-visa'] div[class='govuk-!-margin-bottom-6'] h2:nth-child(1)")
    WebElement elementVerifyText;

    public void verifyFamilyImmigrationStatus(String verifyText2) {
        log.info("verifyFamilyImmigrationStatus " + elementVerifyText.toString());
        Assert.assertEquals(getTextFromElement(elementVerifyText), verifyText2, "Error");


    }
}