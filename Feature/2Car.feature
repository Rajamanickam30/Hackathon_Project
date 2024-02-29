Feature: Car Insurance

  Scenario: Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message
  
  Given: User navigate to Home page
  
  When User selects Car insurance
  And User selects Car insurance quote
  And user selects City and Rto
  And user selects the car brand
  And user selects the car model
  And user selects the fuel type of the selected car
  And user selects the car Variant
  And user fill the details
  Then display the captured error message
