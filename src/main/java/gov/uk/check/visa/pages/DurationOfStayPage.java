package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement longerThanSixMonths;
    @CacheLookup
    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continueButtonOnDuration;

    public void selectIntentionToStay() {
        log.info("selectIntentionToStay " + longerThanSixMonths.toString());
        clickOnElement(longerThanSixMonths);
    }

    public void selectContinueButtonOnDurationPage() {
        clickOnElement(continueButtonOnDuration);
        log.info("selectContinueButtonOnDurationPage " + continueButtonOnDuration.toString());
    }

}