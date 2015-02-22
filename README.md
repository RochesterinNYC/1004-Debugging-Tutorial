[Debugging Tutorial](https://github.com/RochesterinNYC/1004-Debugging-Tutorial)
---
####1004 - Intro to Computer Science and Programming in Java
-------

This is a tutorial on debugging, from both a theoretical perspective and a practical perspective with the Eclipse debugging tool. Written by James Wen.

-------

###Table of Contents

- [Terms and Definitions](#terms)
- [Theory](#theory)
- [Print Statement Debugging](#print)
- [Eclipse Debugger Setup/Start](#setup)
- [Breakpoints](#breakpoints)
- [Other Notes](#other)
- [More Resources/Documentation](#docs)

-------

<a name="terms"></a>

###Terms and Definitions:

####Debugger 

- A type of program or plugin into IDEs serves as a tool that helps programmers find errors in their code

####Eclipse 

- One of the most widely used IDEs for Java and also the IDE that we will be supporting for 1004
- Also allows for installation of plugins that add extra features and support for a large variety of other programming languages 

####Eclipse Debugger

- Definition 

####Print Statement

- Definition

####Control Flow

- Definition

####Breakpoint

- Definition

####Watchpoint

- Definition

------

<a name="theory"></a>

###Theory:

Important to note that debugging and fixing bugs when your program does not work as expected is **not** an exercise in randomly or semi-randomly changing parts of your code and rerunning your program to see if it works. Even if one of the changes you make might make the program work as expected, you may have not actually fixed the bug/mistake and only applied a temporary solution. After implementing more code, the original bug may resurface and you will have not really fixed it as you didn't determine the core logic behind the issue.

Debugging is the practice of trying to fix a bug through two primary steps.

1. Collect enough information for a hypothesis.

Find out what information (which classes, variables, methods, etc.) is relevant to the bug or unexpected behavior. Check this information/statuses of these things with print statements or in the debugger.

2. Make a hypothesis.

The problem is caused by how this variable should be 'x' at this point in program execution but I don't think it is that value.

3. Test it.

Use print statements or the debugger and breakpoints to check the veracity of your hypothesis. 

4. Repeat!

Now that you know that this variable is the cause of the issue and that its value is not what it should be, make a hypothesis as to what/where it's being changed and test it. This should give you enough information to both realize the root cause of the bug and how to fix it.

4. You now have enough information to fix the problem.

------

<a name="print"></a>

###Print Statement Debugging:

Print statement debugging involves printing to the console values or general statements to get an idea of respectively the status of variables and program execution flow.

Example Use Cases:

Printing out the control variable (i or index or etc.) within each iteration of a loop.

Printing out the value of a variable to be returned at the end of a method.

Printing out a test statement ("test") within a series of if-else statements to determine which if is executed.

toString method:

It's important to note that when you pass any object into the System.out.println or System.out.print method calls, it will invoke the toString() method of that object. If there is no toString() method, then it will print a memory location (which isn't usually useful). 

This is a bit of motivation to add meaningful toString methods to the classes you write to assist with debugging, logging, etc.

System.out.println
System.out.print
(Debug printing)
(Log printing)

------

<a name="setup"></a>

###Eclipse Debugger Setup/Start:

How to switch perspectives.

------

<a name="breakpoints"></a>

###Breakpoints:

General concept explanation.

Types of breakpoints/where you can set them.

------

<a name="other"></a>

###Other Notes:

------

<a name="docs"></a>

###More Resources/Documentation:

- <a href="http://www.vogella.com/tutorials/EclipseDebugging/article.html"> Vogella Eclipse Debugging Tutorial</a> 
