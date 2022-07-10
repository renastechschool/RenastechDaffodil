Feature: Using External files in Data Driven Testing

  #BDD >>> Behavioural Driven Development - Cucumber
  #TDD >>> Test Driven Development - TestNG / JUnit
  #DDT >>> Data Driven Testing - External files or data such as Excel files
  #Hybrid >> Using more than one of these testing approaches - our framework is a Hybrid Framework

  @excel
  Scenario: User wants to login OrangeHRM with Excel File(External File)
    Given The user wants to login OrangeHRM using Excel file