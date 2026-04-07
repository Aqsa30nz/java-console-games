# ❌⭕Tic Tac Toe
A Java console-based Tic Tac Toe game for two players featuring position-based input (1–9), input validation, and replay functionality, built to strengthen core programming and problem-solving skills..

---

## 🎮 How to Play

The game is played on a 3×3 grid.

Players take turns:

Player X
Player O
Instead of row/column input, players select positions from 1 to 9:
```
1	2	3
4	5	6
---	---	---
7	8	9
```
Each number maps to a position on the board.
The first player to get three marks in a row (horizontal, vertical, or diagonal) wins.
If all cells are filled and no player wins, the game ends in a draw.
After the game ends, players can choose to play again.
### ▶️ How to Run
- Make sure Java is installed on your system. 
- Open a terminal in the folder containing : TicTacToe.java. 
- Compile and run: 
    - javac TicTacToe.java 
    - java TicTacToe

---

## ✨ Features

- Position-based input system (1–9)
- Input validation (invalid numbers & occupied positions)
- Win and draw detection
- Replay functionality (multiple rounds)
- Clean and interactive console UI

---

## 🧪 Example Gameplay
🎮 Tic Tac Toe Game
```
1	2	3
4	5	6
---	---	---
7	8	9
```
Player X, enter position (1-9): 5
```
1	2	3
4	X	6
---	---	---
7	8	9
```
---

## 📚 Learning Outcomes
By building this project, you will understand:

- 2D arrays and index mapping (1D → 2D)
- Game loops and control flow
- Input validation techniques
- Conditional logic for win/draw detection
- Structured programming and method decomposition

---

## 🚀 Future Improvements
- Add single-player mode (AI using minimax)
- Convert to an object-oriented design
- Build a GUI version (Java Swing / JavaFX)