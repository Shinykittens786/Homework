class Connect4 {
    private char[][] mArr;

    public Connect4() {
        mArr = new char[][] {{' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        }

    public boolean playRed(int row, int col) {
        if (mArr[row][col] == ' ') {
            mArr[row][col] = 'R'; 
            return true; 
        }
        return false; 
    }

    public boolean playYellow(int row, int col) {
        if (mArr[row][col] == ' ') {
            mArr[row][col] = 'Y'; 
            return true; 
        }
        return false; 
    }

    public void printGameState() {
        for (int i = 0; i < 6; i += 1) {
            for (int k = 0; k < 7; k += 1) {
                System.out.print(mArr[i][k]);
                if (k == 5) {
                    System.out.println(); 
                }
            }
        }
    }

    public int getGameResult() {
        //HORIZONTAL
        for (int i = 0; i < 6; i += 1) {
            for (int k = 0; k < 7 - 4; k += 1) {
                if (mArr[i][k] == 'R' && mArr[i][k + 1] == 'R' && mArr[i][k + 2] == 'R' && mArr[i][k + 3] == 'R') {
                    return 1;
                }
                 
                if (mArr[i][k] == 'Y' && mArr[i][k + 1] == 'Y' && mArr[i][k + 2] == 'Y' && mArr[i][k + 3] == 'Y') {
                    return 2;
                }
            }
        } return 0; 
    }
} 