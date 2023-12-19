package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());


    @CacheLookup
    @FindBy(id = "response")
    WebElement selectNationality;
    @CacheLookup
    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement continueButton;

    public void selectNationalityName(String nationaliytSelection) {
        selectByVisibleTextFromDropDown(selectNationality, nationaliytSelection);
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
    }

    public void checkCountryAvailable(String country2) {
        System.out.println(country2);
        log.info("checkCountryAvailable: " + selectNationality.toString());
        Select selectCountry = new Select(selectNationality);
        List<WebElement> country_list = selectCountry.getOptions();
        for (WebElement country : country_list) {
            if (country.getText().equalsIgnoreCase(country2)) {
                System.out.println("Country is available: " + country.getAttribute("innerHTML"));
            }
        }
    }
}