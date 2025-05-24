# ISMAEL DELGADO SANCHO
~~~
 =============================================
|                           _            ___  |
|                          | |          /   | |
|  ___ ___  _ __   ___  ___| |_ __ _   / /| | |
| / __/ _ \| '_ \ / _ \/ __| __/ _` | / /_| | |
|| (_| (_) | | | |  __/ (__| || (_| | \___  | |
| \___\___/|_| |_|\___|\___|\__\__,_|     |_/ |
|                                             |
 =============================================
~~~

## Connect 4 in Java

### Technologies used:

- **JAVA**: A general-purpose, object-oriented programming language.

- **VSC**: Visual Studio Code is a free, lightweight, cross-platform source code editor developed by Microsoft.

- **GIT**: A distributed version control system designed to manage and track changes in a project over time.

---

Connect 4 is a two-player strategy board game where the goal is to align four same-color tokens in a row, whether horizontally, vertically, or diagonally, on a vertical board.

Players alternate turns inserting a token into any column, and the token falls to the lowest available position. The first to connect four consecutive tokens wins.

The program starts by asking the user to enter the board dimensions:

![alt text](img/image.png)

The program includes validation in case the player tries to enter rows or columns below the minimum:

![alt text](img/image2.png)

When the game starts, the board is displayed first, along with a message showing the current player's turn and prompting for the column number to drop the token:

![alt text](img/image3.png)

Validation is also included if the player enters a non-existent column, for example (-1):

![alt text](img/image4.png)

The program checks if a token is placed in a full column:

![alt text](img/image5.png)

It also detects if the board is full; in that case, the game ends in a DRAW:

![alt text](img/image6.png)

After a DRAW or when a player manages to connect four tokens, the console asks whether the players want to restart the game or not.

If an invalid command is entered for “yes” or “no,” it will prompt again:

![alt text](img/image7.png)

The winner message shows which player has won:

![alt text](img/image8.png)

---

## 👨‍💻 About the Author

**Ismael Delgado Sancho**  
Full Stack Web Developer | Java · PHP · JavaScript · React · Laravel  
📍 Based near Barcelona, Spain  
📧 [ismaeldelgado117@gmail.com](mailto:ismaeldelgado117@gmail.com)  
🔗 GitHub: [github.com/IDelgadoSancho](https://github.com/IDelgadoSancho)  
🔗 LinkedIn: [linkedin.com/in/ismael-delgado-sancho-bb144b216](https://linkedin.com/in/ismael-delgado-sancho-bb144b216)

This project was developed as part of my training in Web Application Development (DAW).  
Feel free to reach out or explore my other projects on GitHub!
