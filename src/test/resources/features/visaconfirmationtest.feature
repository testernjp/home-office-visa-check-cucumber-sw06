@regression
Feature: Visa Confirmation
  As a user I would like to use Visa Confirmation page

  @author_SP @regression @smoke @sanity
  Scenario:AnAustralianComingToUKForTourism
    Given I am on Home Page
    When  Click on start button
    And   Select a Nationality "Australia"
    And   Click on Continue button
    And   Select reason "Tourism"
    And   Click on Continue button
    Then  verify result You will not need a visa to come to the UK

  @author_SP @regression
  Scenario: aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths
    Given I am on Home Page
    When  Click on start button
    And   Select a Nationality "Chile"
    And   Click on Continue button
    And   Select reason "Work, academic visit or business"
    And   Select intendent to stay for longer than six months
    And   Click on Continue button
    And   Select have planning to work for "Health and care professional"
    And   Click on Continue button
    Then  verify result You need a visa to work in health and care

  @regression
  Scenario: aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card
    Given I am on Home Page
    When  Click on start button
    And   Select a Nationality "Colombia"
    And   Click on Continue button
    And   Select reason "Join partner or family for a long stay"
    And   Click on Continue button
    Then  verify result You’ll need a visa to join your family or partner in the UK