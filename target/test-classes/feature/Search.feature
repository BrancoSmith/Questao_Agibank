Feature: Search

  @Search
  Scenario: Validate Search
    Given that I am a user and I want to do a search
    When I look for the magnifying glass and click on it
    When I type in the agi search field and click search
    Then I validate the message that the system presents on the screen "Resultados da busca por: agi"