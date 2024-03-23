package board;

public class Board {
    int size;
    char[][] boardArr;
    
    public Board(int size, char symbol) {
        this.size = size;
        boardArr = new char[size][size];    
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boardArr[i][j] = symbol;
            }
        }
    }
    
    public void printBoardConfig() {
        int sz = this.size;
        
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                System.out.print(boardArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
