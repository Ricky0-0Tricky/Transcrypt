# 🔐 Transcrypt

![Java](https://img.shields.io/badge/Java-19%2B-blue) 
![License: MIT](https://img.shields.io/badge/License-MIT-green) 
![Status](https://img.shields.io/badge/Status-Active%20Development-orange)

**Transcrypt** is a **Java-based Morse code translator** with natural language support.  
It lets you convert text ↔ Morse, play messages as **audible beeps**, and switch between **Day/Night modes** for accessibility.  
Built with **Java Swing**, it combines simplicity, interactivity, and fun.  

---

## ✨ Features

- 🔤 **Text ↔ Morse translation**  
- 🔊 **Audible beep transmission** (SOS anyone?)  
- 🌗 **Day/Night mode toggle** for a comfortable UI  
- 🧠 **Natural language support** (full sentences, not just words)  
- 💻 **Java Swing interface** with responsive controls  

---

## 📖 Getting Started

### Prerequisites
- Java **19 or higher**  
- A build tool (**Maven** or **Gradle**)  

### Build and Run

With **Maven**:
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.transcrypt.Main"
```

With **Gradle**:
```bash
gradle build
gradle run
```

**Manually** (no build tool):
```bash
javac -d out src/com/transcrypt/*.java
java -cp out com.transcrypt.Main
```

### 🧪 Usage Examples
Translate Text → Morse
Input:  "HELLO WORLD"
Output: ".... . .-.. .-.. --- / .-- --- .-. .-.. -.."

Translate Morse → Text
Input:  ".... . .-.. .-.. ---"
Output: "HELLO"

Transmit as Beeps
Input:  "SOS"
Output: Beeps in Morse (··· --- ···)

### 📜 License
This project is licensed under the MIT License.

### 🌟 About
Transcrypt is both educational and practical:

Great for learning Morse code

Useful for fun projects and demonstrations

Designed with clean, modular Java code

### 🔭 Future Ideas
Export Morse messages as audio files

Adjustable beep frequency & playback speed

Practice mode for Morse learners

Multiplayer “Morse chat” over sockets

### 🌐 Project Description
**Transcrypt** is a **Java-based Morse** code translator with natural language support. It converts Text ↔ Morse, transmits messages as **beeps**, and includes a **day/night mode** for accessibility. Designed as an educational and practical tool, it makes learning and using Morse code simple and interactive.
