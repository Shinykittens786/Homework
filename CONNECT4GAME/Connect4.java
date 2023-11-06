class Connect4 {
    private char[][] mArr;

    public Connect4() {
        mArr = new char[][] {{' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        }

    public boolean playRed(int col) {
        for (int i = 5; i >= 0; i -= 1) {
            if (mArr[i][col] == ' ') {
                mArr[i][col] = 'R'; 
                return true; 
            } else {}
        }
        return false; 
    }

    public boolean playYellow(int col) {
        for (int i = 5; i >= 0; i -= 1) {
            if (mArr[i][col] == ' ') {
                mArr[i][col] = 'Y'; 
                return true; 
            } else {}
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
        }

        for (int i = 0; i < 6 - 4; i += 1) {
            for (int k = 0; k < 7; k += 1) {
                if (mArr[i][k] == 'R' && mArr[i + 1][k] == 'R' && mArr[i + 2][k] == 'R' && mArr[i + 3][k] == 'R') {
                    return 1; 
                }

                if (mArr[i][k] == 'Y' && mArr[i + 1][k] == 'Y' && mArr[i + 2][k] == 'Y' && mArr[i + 3][k] == 'Y') {
                    return 2;
                }
            }
        }

        for (int i = 0; i < 6 - 4; i += 1) {
            for (int k = 0; k < 7 - 4; k += 1) {
                if (mArr[i][k] == 'R' && mArr[i + 1][k + 1] == 'R' && mArr[i + 2][k + 2] == 'R' && mArr[i + 3][k + 3] == 'R') {
                    return 1;
                }

                if (mArr[i][k] == 'Y' && mArr[i + 1][k + 1] == 'Y' && mArr[i + 2][k + 2] == 'Y' && mArr[i + 3][k + 3] == 'Y') {
                    return 2; 
                }
            }
        }

        for (int i = 0; i < 6 - 4; i += 1) {
            for (int k = 6; k > 0 + 4; k -= 1) {
                if (mArr[i][k] == 'R' && mArr[i + 1][k - 1] == 'R' && mArr[i + 2][k - 2] == 'R' && mArr[i + 3][k - 3] == 'R') {
                    return 1; 
                }

                if (mArr[i][k] == 'R' && mArr[i + 1][k - 1] == 'R' && mArr[i + 2][k - 2] == 'R' && mArr[i + 3][k - 3] == 'R') {
                    return 2; 
                }
            }
        } return 0; 
    }
}