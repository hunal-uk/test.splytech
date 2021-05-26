@API_Test

  Feature: SPLYTECH API Test

    @positiveTest1
    Scenario: User should be able to Post request with valid information
      When User send request with valid information
      Then Response status code should be 201 created


    @positiveTest2
    Scenario: User should be able to Post request with require valid information without surname
      When User send request with only require valid information
      Then Response status code should be 201 created

    @positiveTest3
    Scenario: User should be able to Get request with valid_id
      When User send request with valid journeys_id
      Then Response status code should be 200 OK

    @negativeTest1
    Scenario: User should not be able to Post request with valid information without phone_number
      When User send request with require information without phone_number
      Then Response status code should be 400 Bad Request

    @negativeTest2
    Scenario: User should not be able to Post request with invalid date
      When User send request with invalid date
      Then Response status code should be 400 Bad Request

    @negativeTest3
    Scenario: User should not be able to Post request with invalid latitude
      When User send request with invalid latitude
      Then Response status code should be 400 Bad Request

    @negativeTest4
    Scenario: User should not be able to Post request with invalid longitude
      When User send request with invalid longitude
      Then Response status code should be 400 Bad Request


    @negativeTest5
    Scenario: User should not be able to Post request with invalid name
      When User send request with invalid name
      Then Response status code should be 400 Bad Request

    @negativeTest6
    Scenario: User should not be able to Post request with invalid phone_number
      When User send request with invalid phone_number
      Then Response status code should be 400 Bad Request


    @negativeTest7
    Scenario: User should not be able to Post request with invalid surname
      When User send request with invalid surname
      Then Response status code should be 400 Bad Request

    @negativeTest8
    Scenario: User should not be able to Post request with valid information without latitude
      When User send request with require information without latitude
      Then Response status code should be 400 Bad Request

    @negativeTest9
    Scenario: User should not be able to Post request with valid information without longitude
      When User send request with require information without longitude
      Then Response status code should be 400 Bad Request

    @negativeTest10
    Scenario: User should not be able to Post request with valid information without pickup
      When User send request with require information without pickup
      Then Response status code should be 400 Bad Request

    @negativeTest11
    Scenario: User should not be able to Post request with valid information without name
      When User send request with require information without name
      Then Response status code should be 400 Bad Request

    @negativeTest12
    Scenario: User should not be able to Post request with valid information without departure_date
      When User send request with require information without departure_date
      Then Response status code should be 400 Bad Request

      @negativeTest13
      Scenario: User should not be able to Get request with invalid journey_id
        When User send request with invalid id
        Then Response status code should be 400 Bad Request
