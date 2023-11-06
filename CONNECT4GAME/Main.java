import java.util.*;

class Main {
        public static void main(String[] args) {
            Connect4 myGame = new Connect4(); 
            Scanner scanner = new Scanner(System.in); 
            for (int i = 0;; i += 1) {
                if (myGame.getGameResult() == 1) {
                    System.out.println("Player Red has won!"); 
                    myGame.printGameState();
                    break; 
                }
                
                else if (myGame.getGameResult() == 2) {
                    System.out.println("Player Yellow has won!"); 
                    myGame.printGameState();
                    break;
                }

                else if (myGame.getGameResult() == 0) {
                    System.out.println("Game is still in progress");
                }
            myGame.printGameState(); 
            myGame.getGameResult(); 
            System.out.println("Player Red's turn: Place a red token by entering the column you want to place:");
            int col = scanner.nextInt(); 
            myGame.playRed(col); 
            myGame.printGameState(); 
            myGame.getGameResult(); 
            System.out.println("Player 2's turn: Place a yellow token by entering the column you want to place: ");
            col = scanner.nextInt(); 
            myGame.playYellow(col);
            }
    }
}