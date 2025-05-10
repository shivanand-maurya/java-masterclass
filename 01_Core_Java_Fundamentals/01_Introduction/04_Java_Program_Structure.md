# Java Program Structure & Your First Java Program 

You've installed Java. You've set the path. You typed `java -version` and got a version number. Victory!

Now it's time to **write your first Java program**. But what do those magical keywords like `public`, `static`, `void`, and `main` really mean?

Let’s break it down — in plain English, with engineer-level precision.

---

## First, the Classic “Hello, World!” in Java

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

You’ve seen this before. But what’s going on line by line?

---

## The Structure of Every Java Program

Java is a **class-based** language. Every bit of executable code lives **inside a class**.

Let’s break the code structure down like a layered cake:

### Layer 1: The Class Declaration

```java
public class HelloWorld {
    // code inside class
}
```

* `public`: Access modifier – this class can be used anywhere.
* `class`: The keyword that defines a class.
* `HelloWorld`: The name of the class (must match filename: `HelloWorld.java`).

Think of this as creating a **blueprint** or **container** for your code.

---

### Layer 2: The Main Method

```java
public static void main(String[] args) {
    // program starts here
}
```

This is the **entry point** of your program — where execution starts when you type `java HelloWorld`.

Let’s break the signature down:

| Part            | Meaning                                        |
| --------------- | ---------------------------------------------- |
| `public`        | JVM must access this method from anywhere.     |
| `static`        | No need to create an object to run it.         |
| `void`          | It returns nothing.                            |
| `main`          | The method name – called by JVM                |
| `String[] args` | An array of strings for command-line arguments |

> If this method is missing or wrongly written, the JVM will say:
> `Error: Main method not found in class HelloWorld`

---

### Layer 3: The Print Statement

```java
System.out.println("Hello, World!");
```

Let’s dissect it:

* `System`: A built-in class in the `java.lang` package.
* `out`: A static object (of type PrintStream) — the standard output.
* `println()`: A method to print with a newline.

> This prints to your console. Replace `"Hello, World!"` with any string.

---

## 🧪 Let’s Run It Step-by-Step

1. Save file as `HelloWorld.java`
2. Compile:

   ```bash
   javac HelloWorld.java
   ```

   ➜ Generates: `HelloWorld.class` (bytecode)
3. Run:

   ```bash
   java HelloWorld
   ```

   ➜ Output:

   ```
   Hello, World!
   ```

---

## 💡 Real-Life Analogy

> Think of Java class as a **TV Show (Class)**
> `main()` is the **pilot episode** — the first one aired.
> JVM is like **Netflix** — it always starts from that episode when playing.

---

## ✅ Quick Recap

| Keyword         | Meaning            |
| --------------- | ------------------ |
| `public`        | Accessible by JVM  |
| `class`         | Blueprint for code |
| `static`        | No need for object |
| `void`          | No return value    |
| `main`          | Entry point        |
| `String[] args` | CLI arguments      |

---

## 🛠️ What Happens Behind the Scenes?

* `javac` turns your `.java` source file into `.class` bytecode.
* `java` uses the JVM to read the bytecode.
* JVM loads `HelloWorld.class`, looks for the `main` method, and starts executing.

---

## 📦 Bonus: Full Skeleton of a Java Program

```java
// Single-line comment

/*
 Multi-line comment
 Can span multiple lines
*/

package myprograms; // optional

import java.util.Scanner; // optional

public class MyProgram {
    public static void main(String[] args) {
        // Your logic here
    }
}
```

---

## 🧵 Closing Thoughts

Your first Java program is more than “Hello, World!”. It introduces key ideas like **class structure, access modifiers, static methods, and execution flow**.

Once you understand this foundation, you’re ready to start writing **real-world Java applications** — from console-based tools to Spring Boot web apps.



