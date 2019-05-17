## Project Name: _Ceaser Cipher_

#### Author: Michael Odongo

## Project Description

This java application allows a user to enter a string and a key to apply on the string. The application encrypts the text using Ceaser Cipher encryption technique. It gives the user their original text, their encrypted text and finally the text decrypted again.

## Specs
 
| Behaviour     | Example Input | Example Output  |
| ------------- | ------------- | ------------- |
| A single character should shift forward by the number of the shift key   | "C",4  | "g"  |
| Each character in a word should shift forward by the number of the shift key  | "cat",2  | "ecv"  |
| Numerical Inputs fail  | "1",1 | "Error invalid message"  |
| Spaces and punctuation marks should not be encrypted  | "?",2  | "?"  |
| Each character in a sentence should shift forward by the number of the shift key  | "I am happy",2  | "K co jcrra"  |
| Shift key must be numerical  | "A","f"  | Throws error and starts program  |
| Shift key must be in range 1-25  | "A",50  | Asks for input again  |
| Return nothing when empty string is submitted  | "",2  | ""  |
| Encrypt lower and uppercase letters appropriately  | "A caT",1  | "B dbU"  |
| Ensure looping through the alphabet shift  | "Z",1  | "A"  |

## Setup/Installation Requirements

* Clone this repository
* Open it on your IDE
* Compile the App.java file found in the src/main/java folder. If you're using the terminal, navigate to this folder and run 'javac App.java'
* Run the application on the terminal. Run using the command 'java App' and use the application

## Running tests
* Navigate to any of the files in src/test/java
* Open the file
* On the display tab in the IDE, right click the file and run it

## Technologies Used

* _Java_
* _JUnit_

### License

*This software is licensed under the MIT license.*

Copyright (c) 2019 **_Michael Odongo_**

