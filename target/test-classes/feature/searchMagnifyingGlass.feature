Feature: Search Magnifying Glass

  @MagnifyingGlass
    Scenario: Validate Search Magnifying Glass
    Given that I am a user and I want to do a search
    When I look for the magnifying glass and click on it
    Then I validate that the type field and the search button are displayed on the screen

