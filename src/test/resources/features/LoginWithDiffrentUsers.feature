Feature: Login With Different Users

  User Story:
  As a user, I should be able to login with correct
  credentials to different accounts

  Scenario Outline:
    Given user is on login page
    When user enters "<username>" and "<password>"
    Then user should see his "<name>" on the top right of the page

    Examples:
      | username          | password | name            |
      | student1@library  | d5fv9BtX | Test Student 1  |
      | student2@library  | zyxa10vg | Test Student 2  |
      | student3@library  | rPjgZ86a | Test Student 3  |
      | student4@library  | pG3V6qaL | Test Student 4  |
      | student5@library  | i1oDgf2d | Test Student 5  |
      | student6@library  | NXhpXJdC | Test Student 6  |
      | student7@library  | QfYjDNXj | Test Student 7  |
      | student8@library  | 1DaJSz1z | Test Student 8  |
      | student9@library  | DFDYll1P | Test Student 9  |
      | student10@library | F8u6OrI2 | Test Student 10 |
      | student11@library | 4VRMTsAB | Test Student 11 |
      | student12@library | 8ENtWqOe | Test Student 12 |
      | student13@library | Y0kaXNMa | Test Student 13 |
      | student14@library | bL1twuqT | Test Student 14 |
      | student15@library | 9WB9sVtF | Test Student 15 |
      | student16@library | 2Ziw6vOx | Test Student 16 |
      | student17@library | FmmXHzpF | Test Student 17 |
      | student18@library | qxt5XZgZ | Test Student 18 |
      | student19@library | xDxywYeJ | Test Student 19 |
      | student20@library | nGdNzH1e | Test Student 20 |
      | student21@library | y5pYTlqY | Test Student 21 |
      | student22@library | 2eMI9Uyk | Test Student 22 |
      | student23@library | zzTYIurO | Test Student 23 |
      | student24@library | OwsiR4u5 | Test Student 24 |
      | student25@library | gb6SmZjb | Test Student 25 |
      | student26@library | zC7BUYHs | Test Student 26 |
      | student27@library | E1uZrsAu | Test Student 27 |
      | student28@library | tJ93UQS3 | Test Student 28 |
      | student29@library | g8EyNm9B | Test Student 29 |
      | student30@library | QX6FWzj6 | Test Student 30 |
      | student31@library | yEKjyg5T | Test Student 31 |
      | student32@library | RqJkWmUu | Test Student 32 |
      | student33@library | 4V3Kd1YG | Test Student 33 |
      | student34@library | JySGHP8G | Test Student 34 |
      | student35@library | r2oOkz9m | Test Student 35 |
      | student36@library | WV2WrNrk | Test Student 36 |
      | student37@library | sqs9B1TY | Test Student 37 |
      | student38@library | nca2fAGL | Test Student 38 |
      | student39@library | kCrQEt6X | Test Student 39 |
      | student40@library | ZkFJCgOd | Test Student 40 |
      | student41@library | FsOQE0Xq | Test Student 41 |
      | student42@library | 1oXkp7l2 | Test Student 42 |
      | student43@library | AKDv7j74 | Test Student 43 |
      | student44@library | GaPt5us4 | Test Student 44 |
      | student45@library | c4GeJZ54 | Test Student 45 |
      | student46@library | pZg19ua5 | Test Student 46 |
      | student47@library | yabV3kwK | Test Student 47 |
      | student48@library | 1i33g2PC | Test Student 48 |
      | student49@library | l1Wj8WGv | Test Student 49 |
      | student50@library | TqKXmAC4 | Test Student 50 |
      | student51@library | 49iP65vD | Test Student 51 |
      | student52@library | E5idT5e8 | Test Student 52 |
      | student53@library | o8hqDkKg | Test Student 53 |
      | student54@library | vlrGqQPI | Test Student 54 |
      | student55@library | xBLy3ufr | Test Student 55 |
      | student56@library | 3JgJAhsi | Test Student 56 |
      | student57@library | O76CUuPE | Test Student 57 |
      | student58@library | WS3rm9xG | Test Student 58 |
      | student59@library | cJaTyCRJ | Test Student 59 |
      | student60@library | AoSFw44Y | Test Student 60 |

    @librarian
    Examples:
      | username            | password | name              |
      | librarian1@library  | qU9mrvur | Test Librarian 1  |
      | librarian2@library  | uYrhHmmj | Test Librarian 2  |
      | librarian3@library  | DFvU4b1i | Test Librarian 3  |
      | librarian4@library  | 3lwxJ1Kk | Test Librarian 4  |
      | librarian5@library  | hj65YBiE | Test Librarian 5  |
      | librarian6@library  | QaG7mkXA | Test Librarian 6  |
      | librarian7@library  | C5WUiPUP | Test Librarian 7  |
      | librarian8@library  | UECJkTnl | Test Librarian 8  |
      | librarian9@library  | MSx8u9n4 | Test Librarian 9  |
      | librarian10@library | ZIkOcbCa | Test Librarian 10 |
      | librarian11@library | fsRRgXxB | Test Librarian 11 |
      | librarian12@library | wHhJQDSK | Test Librarian 12 |
      | librarian13@library | YCJCbmU3 | Test Librarian 13 |
      | librarian14@library | bWN7YaaB | Test Librarian 14 |
      | librarian15@library | YLu0ZIMj | Test Librarian 15 |
      | librarian16@library | MnG7Xy72 | Test Librarian 16 |
      | librarian17@library | adE5UAha | Test Librarian 17 |
      | librarian18@library | FZLa1m9D | Test Librarian 18 |
      | librarian19@library | f7q2SyVX | Test Librarian 19 |
      | librarian20@library | MVI4SRzg | Test Librarian 20 |
      | librarian21@library | ZxlVsgKX | Test Librarian 21 |
      | librarian22@library | JUXl6dnx | Test Librarian 22 |
      | librarian23@library | 6PQrr2Ok | Test Librarian 23 |
      | librarian24@library | 8v8ZByKA | Test Librarian 24 |
      | librarian25@library | Uplz5iPS | Test Librarian 25 |
      | librarian26@library | g2X4lxZz | Test Librarian 26 |
      | librarian27@library | la4sfpjs | Test Librarian 27 |
      | librarian28@library | x3AVlP4e | Test Librarian 28 |
      | librarian29@library | m0cvGNnH | Test Librarian 29 |
      | librarian30@library | oZzv4ePp | Test Librarian 30 |
      | librarian31@library | rVPrG4uI | Test Librarian 31 |
      | librarian32@library | 72kOI6Zl | Test Librarian 32 |
      | librarian33@library | RLYB9ZPA | Test Librarian 33 |
      | librarian34@library | n3jnk5Rd | Test Librarian 34 |
      | librarian35@library | H11DHnKj | Test Librarian 35 |
      | librarian36@library | tXH2IlVj | Test Librarian 36 |
      | librarian37@library | bkO2Kl4d | Test Librarian 37 |
      | librarian38@library | 6TN8WpcY | Test Librarian 38 |
      | librarian39@library | snPPHvLX | Test Librarian 39 |
      | librarian40@library | 5NRVIgK3 | Test Librarian 40 |
      | librarian41@library | gDSgcjYr | Test Librarian 41 |
      | librarian42@library | EDpvlxKt | Test Librarian 42 |
      | librarian43@library | 9Wa02cAu | Test Librarian 43 |
      | librarian44@library | Jn82fRUp | Test Librarian 44 |
      | librarian45@library | ShIqQpOy | Test Librarian 45 |
      | librarian46@library | BEHjX7WP | Test Librarian 46 |
      | librarian47@library | qPL9cVwm | Test Librarian 47 |
      | librarian48@library | h0lqSR63 | Test Librarian 48 |
      | librarian49@library | 8l9bsLAN | Test Librarian 49 |
      | librarian50@library | LXHU2DkJ | Test Librarian 50 |
      | librarian51@library | vGTWHXgx | Test Librarian 51 |
      | librarian52@library | p3c33VSf | Test Librarian 52 |
      | librarian53@library | whtQ6kpH | Test Librarian 53 |
      | librarian54@library | a6aZeunQ | Test Librarian 54 |
      | librarian55@library | 67UQi3Ol | Test Librarian 55 |
      | librarian56@library | pBQnq0NN | Test Librarian 56 |
      | librarian57@library | SHzFWv8X | Test Librarian 57 |
      | librarian58@library | gxiYGKjy | Test Librarian 58 |
      | librarian59@library | DmSqxDEJ | Test Librarian 59 |
      | librarian60@library | Lj5VU4Tq | Test Librarian 60 |