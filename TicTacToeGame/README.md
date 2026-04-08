# ❌⭕Tic Tac Toe

A Java console-based Tic Tac Toe game for two players, featuring position-based input (1–9), robust input validation, and replay functionality. 
The project is implemented in both procedural and object-oriented styles to demonstrate the transition from basic logic design to structured, modular programming.

---

## 🎮 How to Play

The game is played on a 3×3 grid.

Players take turns:

Player X
Player O
Instead of row/column input, players select positions from 1 to 9:

```
 1 | 2 | 3
---|---|---
 4 | 5 | 6
---|---|---
 7 | 8 | 9
```

### Rules

- Players choose positions from 1 to 9.
- The first player to align three marks (row, column, or diagonal) wins.
- If all positions are filled without a winner → Draw.
- Players can choose to play multiple rounds.

---

## 📁 Project Structure

### Procedural Version
   - Single-file implementation using static methods.
   - Focuses on core logic, control flow, and basic problem-solving.
- 📂 Location: `/procedural/TicTacToe.java`

### OOP Version (Recommended)
- Refactored into multiple classes to improve modularity, readability, and scalability:
    - Board → Manages game state and win logic
    - Player → Represents player identity
    - Game → Controls gameplay flow and interactions
    - Main → Entry point
- 📂 Location: `/oop/`

---

## ▶️ How to Run
- Ensure Java is installed on your system.

### Run OOP Version (Recommended)
     cd oop
     javac *.java
     java Main

### Run Procedural Version
     cd procedural
     javac TicTacToe.java
     java TicTacToe

---

## 🧪 Example Gameplay

🎮 Tic Tac Toe Game

```
 1 | 2 | 3
---|---|---
 4 | 5 | 6
---|---|---
 7 | 8 | 9
```

Player X, enter position (1-9) : 5

```
 1 | 2 | 3
---|---|---
 4 | X | 6
---|---|---
 7 | 8 | 9
```
---

## ✨ Features

- Position-based input system (1–9)
- Input validation:
    - Non-numeric input handling
    - Out-of-range positions
    - Occupied cell checks
- Win and draw detection logic
- Replay functionality (multiple rounds)
- Clean and interactive console interface

---

## 📚 Learning Outcomes
By building this project, you will understand:

- Mapping user input (1D) to a 2D grid.
- Designing game loops and control flow.
- Implementing input validation and error handling.
- Writing efficient win-condition logic.
- Refactoring procedural code into object-oriented design.
- Applying encapsulation and separation of concerns.

---

## 🚀 Future Improvements

- Single-player mode with AI (Minimax algorithm).
- Score tracking across multiple rounds.
- Variable board size (NxN).
- Graphical User Interface (Java Swing / JavaFX).

---

## 📌 Notes
- This project demonstrates the evolution from a procedural approach to a structured OOP design, highlighting improvements in maintainability and extensibility.
