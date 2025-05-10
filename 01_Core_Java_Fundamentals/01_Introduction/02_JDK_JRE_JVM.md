# JDK, JRE, and JVM: Understanding Java’s Platform Components

Java programs are compiled to platform-neutral *bytecode* and executed by the Java Virtual Machine (JVM), which provides **“Write Once, Run Anywhere”** portability. The **Java Runtime Environment (JRE)** supplies the JVM and standard class libraries needed to *run* Java applications. The **Java Development Kit (JDK)** is a superset of the JRE: it includes everything in the JRE (and thus the JVM) **plus** developer tools like compilers, debuggers, and packagers. In practice, a developer installs the JDK to *write, compile, and debug* Java code, while end users can install just the JRE (or the JDK’s embedded runtime) to *execute* Java programs. This layered architecture ensures that a Java program compiled on one machine can run on any other machine with a compatible JVM.

## Java Virtual Machine (JVM)

&#x20;The **Java Virtual Machine (JVM)** is the core execution engine of Java. It *loads, verifies, and runs* Java bytecode (the `.class` files produced by the Java compiler). The JVM is platform-specific (there are different JVM builds for Windows, Linux, macOS, etc.), but it ensures that Java bytecode runs unchanged on any platform. Internally, the JVM has three main subsystems:

* **Class Loader:** Dynamically loads Java `.class` files at runtime, and performs linking/verification (checking bytecode correctness and security).
* **Runtime Data Areas (Memory):** Allocates memory for classes and objects. Key areas include the *Method Area* (for class definitions), *Heap* (for objects), *Stack* (for executing methods), *Program Counter register*, and *Native Method Area*.
* **Execution Engine:** Interprets or just-in-time (JIT) compiles bytecode into native machine code, and runs it. The execution engine contains an **interpreter**, a **JIT compiler** (for performance optimization), and a **garbage collector** that manages memory.

Because the JVM interprets and JIT-compiles bytecode on the fly, it provides Java’s cross-platform behavior. It also enforces runtime checks (for example, array bounds and security) and automatic memory management (garbage collection). For example, the *Just-In-Time compiler* inside the JVM dynamically converts bytecode to optimized machine code during execution, improving performance.

## Java Runtime Environment (JRE)

&#x20;The **Java Runtime Environment (JRE)** is the software layer that provides the **JVM and the standard Java class libraries** needed to run Java applications. In other words, the JRE = JVM + Java class libraries + supporting files. The class libraries include core packages such as `java.lang`, `java.util`, and `java.io` (for basic language features and utilities), as well as *GUI toolkits* (AWT, Swing, Java2D) and *deployment tools* (Java Web Start, browser plug-in). The JRE also manages memory allocation (using a heap for objects) and other runtime services. Importantly, the JRE **does not include development tools**: it has no compiler (`javac`), debugger, or documentation tools.

If you only need to **run** Java programs and not develop them, installing the JRE is sufficient. For example, one can invoke the JRE’s `java` command to launch applications. As IBM notes, “If a programmer would like to run a Java program by using the Java command, they should install JRE. If they are only installing (and not developing or compiling code), then only JRE is needed”. In practice, modern JDK distributions bundle the JRE internally; that is, the JDK installer includes a private JRE. (Notably, from Java 11 onward Oracle/ OpenJDK **no longer distribute a separate JRE installer**—only the full JDK is offered, though one can create a custom runtime with `jlink`.)

## Java Development Kit (JDK)

&#x20;The **Java Development Kit (JDK)** is the complete Java SDK (Software Development Kit) for creating Java applications. The JDK *includes* a private JRE (and thus the JVM) plus **all the developer tools** needed to write, compile, debug, and package Java programs. This means the JDK provides commands such as:

* **`javac`** – the Java compiler, which converts `.java` source files into `.class` bytecode (Java Virtual Machine instructions).
* **`java`** – the application launcher, which starts the JVM and runs a Java program.
* **`jar`** – the archiver tool to bundle class files and resources into a JAR file.
* **`javadoc`** – the documentation generator that produces API docs from source comments.
* **`jdb`** – the Java debugger (for command-line debugging of Java programs).
* And other utilities (e.g. `javap` disassembler, `javah`/`javac` for JNI, etc.).

These tools live in the JDK’s `bin` directory. When you install the JDK on a system, you typically set the `PATH` (or `JAVA_HOME`) environment variable to point to the JDK’s `bin` so that you can invoke `javac`, `java`, and other tools from the command line. In summary, the **JDK is used for development (compile/run)** while the **JRE is used purely for execution**. In fact, Oracle states: “The JDK is a superset of the JRE, and contains everything that is in the JRE, plus tools such as the compilers and debuggers necessary for developing applets and applications”. (All Java platforms – Oracle’s JDK or OpenJDK – package these components in a platform-specific installer.)

### Example: Compiling and Running a Java Program

To illustrate, consider a simple Java class `HelloWorld.java`:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

Using the JDK’s tools, we compile and run it on the command line:

```bash
$ javac HelloWorld.java       # compile with javac (JDK)
$ java HelloWorld            # run with java (JRE/JVM)
Hello, world!                # program output
```

Here, `javac` (from the JDK) produces `HelloWorld.class` (bytecode). Then `java` (from the JRE) launches the JVM, which loads `HelloWorld.class`, verifies and JIT-compiles the bytecode, and executes the `main` method to produce the output. This example shows the classic Java lifecycle: source code → bytecode (via `javac`) → execution (via `java`/JVM). If only runtime were needed, one could omit installing `javac` and use only a JRE (or a JDK’s runtime) to run the program.

## How JDK, JRE, and JVM Work Together

1. **Writing Code:** A developer writes Java source code (`.java` files) in an editor or IDE, using Java language syntax.
2. **Compilation:** The `javac` tool (part of the JDK) compiles the source to bytecode (`.class` files). This bytecode is *platform-independent*.
3. **Loading:** To run the code, the `java` command (part of the JRE) is invoked. This starts the JVM, whose Class Loader subsystem locates and loads the required `.class` files from the file system or JARs.
4. **Execution:** The JVM’s Execution Engine interprets (and/or JIT-compiles) the bytecode into native machine instructions, executes the program, and manages memory (heap, stack) during runtime.

In practice, developers use the JDK to build and package applications, while end users or servers use the JRE/JVM to run them. For example, in production one might deploy only a Java application archive (`.jar` or WAR) and use a JRE-installed JVM (or a container image with OpenJDK) to execute it.

## OpenJDK vs. Oracle JDK: Key Differences

OpenJDK and Oracle JDK are two major builds of the Java Development Kit. They share the same codebase, but differ mainly in **licensing and support**:

* **License:** *OpenJDK* is fully open-source, released under the GNU GPLv2 with Classpath Exception. It is free to use, modify, and distribute. *Oracle JDK* is Oracle’s proprietary build. Historically (before Java 11), Oracle JDK was free for personal and development use, but required a paid commercial license for production updates. (Since Java 17/21 Oracle offers its own builds under a “no-fee” license for all users, but commercial support still costs extra.) In summary, **OpenJDK is “free and open”** by design, whereas **Oracle JDK was tied to Oracle’s licensing terms** (free only under limited conditions).

* **Support and Updates:** Oracle provides LTS (Long-Term Support) releases of its JDK, but extended updates beyond the initial release require a paid Oracle subscription. OpenJDK updates (security fixes and new features) are delivered by the open-source community and various vendors (Red Hat, Azul, Eclipse Temurin, Amazon Corretto, etc.) under open-source terms. Many Linux distributions ship OpenJDK by default. Thus, enterprises often choose a supported OpenJDK build (e.g. Red Hat’s build with support contract) or purchase Oracle’s support for Oracle JDK.

* **Feature Differences:** Since Java 11 most proprietary Oracle features have been open-sourced, so OpenJDK and Oracle JDK are functionally very similar. In older versions (e.g. JDK 8), Oracle JDK included some additional tools (Java Flight Recorder, Mission Control, etc.) that were not in OpenJDK. Today, those features have been merged into OpenJDK or removed from Oracle’s premium features. The practical difference now is mainly about **packaging and updates**, rather than core functionality.

In short, OpenJDK is the open-source reference implementation of Java, while Oracle JDK is Oracle’s distribution of that implementation with its own licensing. Choosing between them depends on licensing needs and support preferences, but for most purposes (especially with Java 11+), they are interchangeable in terms of language features.

## Summary

* **JVM:** The execution engine that runs Java bytecode (handles class loading, memory management, JIT compilation, etc.). It is included in both the JRE and JDK.
* **JRE:** The runtime environment containing the JVM and standard Java libraries. It is used to *run* Java applications but contains no compiler.
* **JDK:** The full development kit, a superset of the JRE. It provides everything in the JRE plus development tools (compiler, debugger, etc.).

Together, these components form the Java platform: the JDK for **developing** Java applications, the JRE/JVM for **running** them, and the JVM itself for ensuring cross-platform portability. Modern Java applications rely on this architecture at every stage—from writing source code to executing the final program on any target machine without recompilation.

**Sources:** Authoritative Oracle and IBM documentation and Java guides have been used to explain and verify these points.
