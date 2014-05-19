# OCPJP Exercises
These exercises were aggregated from "http://docs.oracle.com/javase/tutorial/reallybigindex.html" which is a one-page index into "http://docs.oracle.com/javase/tutorial/index.html".

They are copyright Oracle, and are cited here only for ease of access.

If I felt that the exercises were adding little value or were too dependent on the context of the tutorial, I left them out and provided a link instead.

## OO Concepts
http://docs.oracle.com/javase/tutorial/java/concepts/QandE/questions.html
 
## Language Basics

### Variables
http://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_variables.html

### Operators
http://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_operators.html

### Expressions, Statements, Blocks
http://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_expressions.html

### Control Flow
http://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/questions_flow.html

## Classes and Objects

### Classes
* Write a class whose instances represent a single playing card from a deck of cards. Playing cards have two distinguishing properties: rank and suit. Be sure to keep your solution as you will be asked to rewrite it in Enum Types.
* Write a class whose instances represent a full deck of cards. You should also keep this solution.
* Write a small program to test your deck and card classes. The program can be as simple as creating a deck of cards and displaying its cards.

### Objects
http://docs.oracle.com/javase/tutorial/java/javaOO/QandE/objects-questions.html

### Nested Classes
* start from file http://docs.oracle.com/javase/tutorial/java/javaOO/examples/DataStructure.java
* please note that you need Java 1.8 for most of the following
* Define a method named print(DataStructureIterator iterator). Invoke this method with an instance of the class EvenIterator so that it performs the same function as the method printEven.
* Invoke the method print(DataStructureIterator iterator) so that it prints elements that have an odd index value. Use an anonymous class as the method's argument instead of an instance of the interface DataStructureIterator.
* Define a method named print(java.util.Function<Integer, Boolean> iterator) that performs the same function as print(DataStructureIterator iterator). Invoke this method with a lambda expression to print elements that have an even index value. Invoke this method again with a lambda expression to print elements that have an odd index value.
* Define two methods so that the following two statements print elements that have an even index value and elements that have an odd index value:

    DataStructure ds = new DataStructure()
    // ...
    ds.print(DataStructure::isEvenIndex);
    ds.print(DataStructure::isOddIndex);

### Enum
http://docs.oracle.com/javase/tutorial/java/javaOO/QandE/enum-answers.html

## Annotations
* Define an annotation type for an enhancement request with elements id, synopsis, engineer, and date. Specify the default value as unassigned for engineer and unknown for date.

## Numbers and Strings

### Numbers


## Rest of chapters/links
http://docs.oracle.com/javase/tutorial/java/data/QandE/numbers-questions.html
http://docs.oracle.com/javase/tutorial/java/package/QandE/packages-questions.html
http://docs.oracle.com/javase/tutorial/essential/environment/QandE/questions.html
http://docs.oracle.com/javase/tutorial/collections/streams/QandE/questions.html
http://docs.oracle.com/javase/tutorial/java/IandI/QandE/interfaces-questions.html
http://docs.oracle.com/javase/tutorial/java/IandI/QandE/inherit-questions.html
http://docs.oracle.com/javase/tutorial/java/data/QandE/characters-questions.html
http://docs.oracle.com/javase/tutorial/java/generics/QandE/generics-questions.html
http://docs.oracle.com/javase/tutorial/essential/exceptions/QandE/questions.html
http://docs.oracle.com/javase/tutorial/essential/io/QandE/questions.html
http://docs.oracle.com/javase/tutorial/essential/concurrency/QandE/questions.html
http://docs.oracle.com/javase/tutorial/essential/regex/QandE/questions.html
http://docs.oracle.com/javase/tutorial/collections/interfaces/QandE/questions.html
http://docs.oracle.com/javase/tutorial/collections/implementations/QandE/questions.html
http://docs.oracle.com/javase/tutorial/datetime/iso/QandE/questions.html


# Further Resources
http://www.freejavaguide.com/java-scjp-part1.pdf


