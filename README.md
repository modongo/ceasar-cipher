## Project Name: _Ceaser Cipher_

#### Author: Michael Odongo

## Project Description

This is a java application that implements the Caeser cipher encryption.

## Specs
 
| Behaviour     |  User Input | Expected Output  |
| ------------- | ------------- | ------------- |
| Single letters shift forward by steps of the shift key   | "Q",4  | "U"  |
| Each letter in a word  shift forward by the number of the shift key  | "raven",4  | "vezir"  |
| Numbers are not encrypted  | "1",1 | "No Encryption done"  |
| The key is numerical  | "L","z"  | Gets an Exception |
| The key must be in range 1-25  | "V",50  | Asks for input again  |
| Blank input not encrypted  | "", | "No Encryption done"  |

## To Setup/Installation

* Clone this repository
* move to src/main/java directory
* At the console type "java App"
* You will be prompted by the app to enter message to be encrypted

##  Tests
* Note that tests were done using JUNIT4 
* The test template is available on the src/test/java directory
* Use your IDE to perform the JUNIT test

## Technologies Used

* _Java_
* _JUnit_

### License

*This software is licensed under the MIT license.*

Copyright (c) 2019 **_Michael Odongo_**

