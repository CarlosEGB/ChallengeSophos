Feature: POST request to an API

  @PostUser
  Scenario Outline: rest api post request
    Given The service rest of users the gorest
      | first_name   | last_name   | gender   | dob   | email   | phone   |
      | <first_name> | <last_name> | <gender> | <dob> | <email> | <phone> |
    When sent a post request with the data
    Then Verify that the user has been added
      | first_name   | last_name   | gender   | dob   | email   | phone   |
      | <first_name> | <last_name> | <gender> | <dob> | <email> | <phone> |

    Examples:
      | first_name | last_name | gender | dob        | email                | phone     |
      | usuario1   | Test      | male   | 1960-07-16 | usuario7@example.com | 300002133 |


