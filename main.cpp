// Copyright (c) 2025 St. Mother Teresa HS All rights reserved.

// Created by: D. Jeffrey
// Created on: Dec 2025
// The Recursion program that prints tribonacci sequence numbers

#include <iostream>
#include <string>
using std::cout;
using std::cin;
using std::string;


/**
* This method uses recursion to calculate the following tribonacci term.
*
* @param counter counter of how many tribonacci terms to calculate
* @param termNumberMinusThree represents T(n-3)
* @param termNumberMinusTwo represents T(n-2)
* @param termNumberMinusOne represents T(n-1)
*/
void tribonacciCalc(int counter, int termNumberMinusThree, int termNumberMinusTwo, int termNumberMinusOne) {
    // if statement to only generate terms when counter is still greater than 0
    if (counter > 0) {
            // calculate the next tribonacci number, and then use that number and two before it to calculate the tribonacci number after that
            int nextTerm = termNumberMinusOne
            + termNumberMinusTwo
            + termNumberMinusThree;
            cout << nextTerm << " ";

            tribonacciCalc(counter - 1, termNumberMinusTwo,
            termNumberMinusOne, nextTerm);
        }
}

/**
* This is the main function to get user input of number of terms to generate,
* print out base cases and call tribonacciCalc() to generate terms.
*
* @param args no args will be used
*/
int main() {
    string counterAsString;
    while (true) {
        try {
            // input
               cout << "Enter a positive integer: ";
               cin >> counterAsString;
               int counter = stoi(counterAsString);
               if (counter <= 0) {
                   cout << "That was not a positive integer.";
               } else {
                    // print base cases
                   if (counter == 1) {
                       cout << "Tribonacci Sequence for " << counter << " terms:\n";
                       cout << 0;
                   } else if (counter == 2) {
                       cout << "Tribonacci Sequence for " << counter << " terms:\n";
                       cout << 0 << " " << 0;
                   } else if (counter == 3) {
                       cout << "Tribonacci Sequence for " << counter << " terms:\n";
                       cout << 0 << " " << 0 << " " << 1;
                   } else {
                       // call for tribonacciCalc() if counter > 3
                       cout << "Tribonacci Sequence for " << counter << " terms:\n";
                       cout << 0 << " " << 0 << " " << 1 << " ";
                       tribonacciCalc(counter - 3, 0, 0, 1);
                   }
               }

        } catch (const std::invalid_argument &err) {
            std::cout << "The error was: " << err.what() << ".";
   }

   cout << "\n\nDone.\n\n";
}
}

