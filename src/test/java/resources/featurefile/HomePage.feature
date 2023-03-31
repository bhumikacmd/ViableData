
Feature: Test the functionality of viabledata

  As a user I should navigate to Careers Page

  Scenario: User to navigate to Careers Page
    Given User is on HomePage
    When User to click on main tab
    And User to click on any of the lists
    Then User to verify "CAREERS" page
