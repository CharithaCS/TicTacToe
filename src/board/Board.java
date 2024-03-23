package board;

public class Board {
    public int size;
    public char[][] board;
    public char symbol;
    
    public Board(int size, char symbol) {
        this.size = size;
        board = new char[size][size];    
        this.symbol = symbol;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = symbol;
            }
        }
    }
    
    public void printBoardConfig() {
        int sz = this.size;
        
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
