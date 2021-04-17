CSC 172 Project 2
This project was challenging yet fun at the same time. It took me a while to understand and figure out how to go about it. I had to read a little about poker and Yahtzee rules to understand which specific instances to was considered a smallStraight.
Part 1. Classify
I realized the entire project relied heavily on this first part because the second was just a build-up on the first. For this class, I start by getting the user input as a string then I convert the string into integers then storing it into an array. I assumed the user will enter five numbers from 1 to 6 representing the dice separated by a space. To make my work easier, I sorted the array using the parallel sort method in ascending order. This made writing the conditions for each circumstance of the particularly easy because I wouldn’t have to be concerned about every scenario were the array not sorted. I tested each condition gradually and made sure to instantiate a score and bestScore variable in which the bestScore variable is updated whenever the current score of a occurrence was higher than the previous occurence. 
Part 2. Simulate
This part was just a build-up from the first part because I only recycled the code and got the user input for the number of simulations. I had to create a lot of variables to keep track of all the frequencies and scores for each occurrence since each one of them was going to be analyzed. I generated five random dice and generated them per number of rolls/simulation the user wanted. I stored them and used them for the print methods.
Other Classes
ScreenClear
 I got this code from stack overflow to help clean the console. I use a PC and do not know if it works on a Mac OS. I do not know if this admission constitutes academic dishonesty, but it was the only way I found out how to clear the command line console and print the results as the assignment specified.
Throwback
This class file just houses the initial instructions to ask the user to either classify or run a simulation and gets the number of times to run the simulation.
