# 🧠 Installing Java & Setting PATH – A Step-by-Step Guide for All Levels

Whether you're just starting out or returning to Java after years, the first thing you must get right is: **Java installation and environment setup**. Without it, `javac` and `java` won’t work, and neither will your awesome ideas.

This blog will walk you through the *what*, *why*, and *how* of installing Java and configuring `JAVA_HOME` and `PATH`—across **Windows, macOS, and Linux**.

---

## 🧐 What Exactly Are You Installing?

Java has three key components:

* **JDK (Java Development Kit):** For developers. Contains `javac`, `java`, and more.
* **JRE (Java Runtime Environment):** For running Java applications (included in JDK).
* **JVM (Java Virtual Machine):** The engine that runs Java bytecode.

So when we install Java, we mostly mean: **JDK**, which already includes JRE and JVM.

---

## 🎯 Step 1: Choose the Right Java Version & Vendor

### 📦 Common Options:

* **Oracle JDK** – Official but often requires a license for commercial use.
* **OpenJDK** – Free and open-source. Recommended for most developers.
* **Popular Vendors:** Adoptium (Temurin), Amazon Corretto, Eclipse Temurin, RedHat

### ✅ Recommended Versions (as of 2025):

* Java 17 (LTS)
* Java 21 (LTS)

> LTS = Long-Term Support → Stability + Security Updates

---

## 💻 Step 2: Installing Java

### 🔹 Windows:

1. Go to [https://adoptium.net](https://adoptium.net)
2. Download the latest JDK `.msi` file.
3. Run installer → Accept terms → Complete installation.

### 🔹 macOS:

* Option 1: Download `.pkg` installer from Adoptium.
* Option 2: Use Homebrew:

  ```bash
  brew install openjdk@17
  ```

### 🔹 Linux (Ubuntu/Debian):

```bash
sudo apt update
sudo apt install openjdk-17-jdk
```

---

## ✅ Step 3: Verify Java Installation

Open a terminal or command prompt:

```bash
java -version
javac -version
```

You should see output like:

```
java version "17.0.2"
javac 17.0.2
```

If yes — Java is installed. 🎉

---

## 🔧 Step 4: Set JAVA\_HOME and Update PATH

Why? So that your OS and tools like Maven, Gradle, IDEs, and terminal can locate your Java installation globally.

---

### 🔹 For Windows:

1. **Search**: Environment Variables → Edit System Environment Variables → Click on *Environment Variables*
2. **Add New System Variable**:

   * **Name**: `JAVA_HOME`
   * **Value**: `C:\Program Files\Java\jdk-17` (based on where you installed it)
3. **Edit `Path` Variable**:

   * Add: `%JAVA_HOME%\bin`

---

### 🔹 For macOS/Linux:

Open terminal and edit your shell profile:

* For bash: `~/.bashrc`
* For zsh: `~/.zshrc`
* For others: `~/.profile`

Add the following:

```bash
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
```

Then apply the changes:

```bash
source ~/.bashrc  # or ~/.zshrc
```

---

## 🧪 Step 5: Test It With a Sample Program

Let’s run a quick Java file!

```java
// HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Java is set up correctly!");
    }
}
```

Compile & Run:

```bash
javac HelloWorld.java
java HelloWorld
```

Expected Output:

```
Java is set up correctly!
```

---

## 🏁 You’re Ready!

Your system is now Java-enabled. You’ve got:

✅ Java installed
✅ JAVA\_HOME & PATH configured
✅ Verified with a test program

Now you can start coding, compiling, and running Java anywhere—from terminal to IntelliJ or VS Code.


