Feature: Test Bucket endpoints

  Scenario: create Bucket
    * def bucket =
      """
      {
        "id": "c86e2bc7-b777-4e72-a995-b62983018a85",
        "pos": 1,
        "name": "TODO"
      }
      """

    Given url 'https://localhost:8080'
    And request v1/buckets
    When method post
    Then status 204
