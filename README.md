# Lexical Scanner

**The Lexical Analysis (aka “Scanner”)** is a phase within a compiler that converts an input code into an array of tokens.

Create a simple scanner program that will accept a single line assignment statement written in Java.

**Examples:**

1) int x = 1;

2) String str = “Hello World”;

3) double number;

The Tokenizer program should then identify the lexemes in your statement then categorize them into their respective tokens. Refer to the symbol table below.


<img width="378" alt="image" src="https://github.com/chryzanths/Lexical-Scanner/assets/104879763/470a0430-967e-4baa-88e1-f713830bc5fb">


**Sample input/output:**

Enter Source Language: int num = 2;

Output is: <data_type> <identifier> <assignment_operator> <value> <delimiter>
