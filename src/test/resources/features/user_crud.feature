Feature: User CRUD operations

  Scenario: Create a new user
    Given a new user with id 1, name "John Doe", and email "john.doe@example.com"
    When the user is added to the system
    Then the system should contain the user with id 1

  Scenario: Update an existing user
    Given an existing user with id 1, name "John Doe", and email "john.doe@example.com"
    When the user's name is changed to "Jane Doe"
    Then the system should contain the user with id 1 and name "Jane Doe"

  Scenario: Delete an existing user
    Given an existing user with id 1, name "Jane Doe", and email "john.doe@example.com"
    When the user is removed from the system
    Then the system should not contain the user with id 1
