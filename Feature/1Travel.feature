Feature: Travel Insurance

  Scenario: Display the three lowest travel Insurance Plans for Students
    
    Given: User navigate to Home Page

    When User selects travel insurance
    And User selects Destination
    And User selects Date
    And User selects Number of travellers
    And User selects the medical condition
    And User Enters the mobile number
    And User selects the student plan
    And User sort the plans
    Then Display the Results
