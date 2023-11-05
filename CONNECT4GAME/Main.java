import java.util.*;

class Main {
        public static void main(String[] args) {
            Connect4 myGame = new Connect4(); 
            Scanner scanner = new Scanner(System.in); 
            for (int i = 0;; i += 1) {
                if (myGame.getGameResult() == 1) {
                    System.out.println("Player Red has won!"); 
                    break; 
                }
                
                if (myGame.getGameResult() == 2) {
                    System.out.println("Player Yellow has won!"); 
                    break;
                }

                if (myGame.getGameResult() == 0) {
                    System.out.println("Game is still in progress");
                }
            myGame.printGameState(); 
            myGame.getGameResult(); 
            System.out.println("Player Red's turn: Place a red token by entering a coordinate:");
            int row = scanner.nextInt(); 
            System.out.println("Please enter the second coordinate:"); 
            int col = scanner.nextInt(); 
            myGame.playRed(row, col); 
            myGame.printGameState(); 
            myGame.getGameResult(); 
            System.out.println("Player 2's turn: Place a yellow token by entering a coordinate: ");
            row = scanner.nextInt(); 
            System.out.println("Please enter the second coordinate:"); 
            col = scanner.nextInt(); 
            myGame.playYellow(row, col);
            }
    }
}