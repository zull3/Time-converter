# IO and Strings - Time converter

## Instructions  
Write a Java program that asks for the number of hours, minutes and seconds, use the Scanner class with the colon sign ':' as delimilter (see below). The program will then calculate and print how many seconds it was in total.

Example (02:40:15 below is what the user enters)
```
Enter hour, min and seconds in the format (hh:mm:ss): 02:40:15
It will be 9615 seconds
```

### Note on using delimilter

To notify the Scanner class that we want to use the colon character as a delimilter, we use the code below to set the Scanner:

```java
Scanner userInput =  new  Scanner (System.in); 
userInput.useDelimiter (":"); 
```

The scanner will read from the keyboard until it sees a colon. Normally it reads until it sees a whitespace character (usually spaces and line breaks). Now we specify instead that a colon should break the read. Then you can read the numbers, one at a time, with:

```java
int hour = userInput.nextInt (); 
```

Test this, how does it work? You may notice that you need to end the entry with a colon. Why? and how do we get out of it?

Why this happens is not so strange really, we have decided that nextInt will read characters until it reaches a colon. If it does not see a colon, it never breaks the read. We must therefore add that we want to break when we see a colon OR a whitespace character. Change the code above so that the line of code looks like this instead:

```java
userInput.useDelimiter (":|\\s+"); 
```

|  Charaters | Meaning   |
|---|---|
| : | Colon |
| \| | OR |
| \\s | Whitespace  |
 +  | 1 or more  |

**NOTE!** You need to enter a + sign after \\s because on a Windows computer newline consists of two characters (\r\n).
Feel free to try changing the colon to any character. Can you figure out how to use the vertical bar sign | as a separator?