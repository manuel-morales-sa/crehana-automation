Feature: I as user of the crehana platform
  i want to login into application
  to access my content

  Scenario Outline: Login successful
    Given user in the home page
    When user enter the <email> and <password>
    Then user sees the content

    Examples:
      | email              | password   |
      | b2b@mailinator.com | 1234567890 |