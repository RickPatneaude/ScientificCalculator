Rick Patneaude
CS 480 Lab 3
10/21/2020

Scientific Calculator

Table of contents

I. How to compile and run in command line
II. How to use
III. Gantt chart/Github information


-------------I. How to compile and run in command------------------------

Compiling and Running Swing Programs
This section explains how to compile and run a Swing application from the command line. For information on compiling and running a Swing application using NetBeans IDE, see Running Tutorial Examples in NetBeans IDE. The compilation instructions work for all Swing programs — applets, as well as applications. Here are the steps you need to follow:

Install the latest release of the Java SE platform, if you haven't already done so.
Create a program that uses Swing components.
Compile the program.
Run the program.
Install the Latest Release of the Java SE Platform
You can download the latest release of the JDK for free from http://www.oracle.com/technetwork/java/javase/downloads/index.html.


Compile the Program
Your next step is to compile the program. To compile the example, from the directory above the ScientificCalculator.java file:

javac scientificcalculator/*.java
If you prefer, you may compile the example from within the start directory:

javac *.java
but you must remember to leave the start directory to execute the program.

If you are unable to compile, make sure you are using the compiler in a recent release of the Java platform. You can verify the version of your compiler or Java Runtime Environment (JRE) using these commands

javac -version
java -version
Once you've updated your JDK, you should be able to use the programs in this trail without changes. Another common mistake is installing the JRE and not the full Java Development Kit (JDK) needed to compile these programs. Refer to the Getting Started trail to help you solve any compiling problems you encounter. Another resource is the Troubleshooting Guide for Java™ SE 6 Desktop Technologies.

Run the Program
After you compile the program successfully, you can run it. From the directory above the start directory:

java start.scientificcalculator
-------------------------------------------------------------------------

-------------------------II. How to use----------------------------------
Menu:

File: Switch between Standard and Scientific Modes. Click Scientific Twice and extend the display

Edit: Not currently used.

Buttons:

Basic:
'0-9':enters number on the display
'<--': backspace
'C'  : clears the screen
'Neg': places negative sign for entering a negative number on screen
'-'  : subtraction operator. places operator followed by a space
'+'  : addition operator. places operator followed by a space
'*'  : multiplication operator. places operator followed by a space
'/'  : division operator. places operator followed by a space
'+-' : returns result of value currently on display * -1
'.'  : decimal entry
'='  : calculates value of expression and displays it on the screen

'Log': places 'L(' on screen. enter the expression you would like to take the log(base 10) of, and then use ')' to close the expression. you can then continue on entering the rest of your expression if there is more to input.

'Sin': places 'S(' on screen. enter the expression you would like to take the Sin of, and then use ')' to close the expression. you can then continue on entering the rest of your expression if there is more to input.

'ln': places 'l(' on screen. enter the expression you would like to take the log natural of, and then use ')' to close the expression. you can then continue on entering the rest of your expression if there is more to input.

'Cos': places 'C(' on screen. enter the expression you would like to take the Cosine of, and then use ')' to close the expression. you can then continue on entering the rest of your expression if there is more to input.

'Tan': places 'T(' on screen. enter the expression you would like to take the Tangent of, and then use ')' to close the expression. you can then continue on entering the rest of your expression if there is more to input.

'Cot': places 'c(' on screen. enter the expression you would like to take the Cotangent of, and then use ')' to close the expression. you can then continue on entering the rest of your expression if there is more to input.

'Mem'    : stores current value or expression on display into memory
'Recall' : displays value or expression stored in memory

'x^y': exponent tool. places 'x' on the screen. enter the power using 0-9 on the keypad, then use '(' and ')' to create an expression you want evaluated. example: x2(3 + L(3)) gives you (3 + Log10(3))^2. IMPORTANT: omitting parentheses for the expression following this instruction will result in an error.

'x^2': squaring tool. same instructions as above, but the power is already entered. omitting the right parentheses ')' for the expression following this instruction will result in an error.

Note: currently, multiplication requires use of the '*' operator. Using parentheses to indicate multiplication can result in 'error' or incorrect results.
-------------------------------------------------------------------------
-------------------------III Gantt Chart/Github information--------------

i. Gantt Chart - The Gantt chart was created using an Excel template. both the PDF and Excel versions are available at your convenience

ii. Git hub - Version control was implemented using Github. All provided documents and files are also available here: https://github.com/RickPatneaude/ScientificCalculator