package game;

import player.Player;
import board.Board;
import java.util.Scanner;

public class Game {
    Player[] players;
    Board board;
    int turn;
    int noOfMoves;
    boolean gameOver;
    String o;
    String x;
    
    public Game(Player[] players, Board board) {
        this.players = players;
        this.board = board;
        
        StringBuilder o = new StringBuilder();
        StringBuilder x = new StringBuilder();
        
        char c1 = players[0].getPlayerSymbol();
        char c2 = players[1].getPlayerSymbol();

        for(int i = 0; i < board.size; i++) {
            o.append(c1);
            x.append(c2);
        }
        
        this.o = o.toString();
        this.x = x.toString();
    }
    
    public void play() {
        board.printBoardConfig();
        int sz = board.size;
        
        while (!gameOver) {
            noOfMoves++;
            int pos = getPosition();
            
            int row = pos / sz;
            int col = pos % sz;

            board.board[row][col] = players[turn].getPlayerSymbol();
            
            if (noOfMoves >= sz * sz) {
                System.out.println("Game Draw!");
                gameOver = true;
                return;
            }
            
            if (noOfMoves >= 2 * sz - 1 && checkCombinations()) {
                gameOver = true;
                board.printBoardConfig();
                System.out.println("Winner is " + players[turn].getPlayerName());
                return;
            }
            
            turn = 1 - turn;
            board.printBoardConfig();
        }
    }
    
    public int getPosition() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Player " + players[this.turn].getPlayerName() + ", choose your position");
            int pos = sc.nextInt() - 1;
            
            if (pos < 0 || pos >= board.size * board.size) {
                System.out.println("Invalid position.");
                continue;
            }
            int sz = board.size;
            if (board.board[pos/sz][pos%sz] != board.symbol) {
                System.out.println("Position already occupied.");
                continue;
            }
            return pos;
        }
    }
    
    public boolean checkCombinations() {
        int sz = board.size;
        
        // Row
        for (int i = 0; i < sz; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < sz; j++) {
                sb.append(board.board[i][j]);
            }
            
            String pattern = sb.toString();
            if(pattern.equals(o) || pattern.equals(x)) {
                return true;
            }
        }
        
        // Column
        for (int i = 0; i < sz; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < sz; j++) {
                sb.append(board.board[j][i]);
            }
            
            String pattern = sb.toString();
            if(pattern.equals(o) || pattern.equals(x)) {
                return true;
            }
        }
        
        // Diagonal
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sz; i++) {
            sb.append(board.board[i][i]);
        }
        String pattern = sb.toString();
        if(pattern.equals(o) || pattern.equals(x)) {
            return true;
        }
        
        // Anti-diagonal
        sb.setLength(0);
        for (int i = 0, j = sz - 1; i < sz; i++, j--) {
            sb.append(board.board[i][j]);
        }
        pattern = sb.toString();
        if(pattern.equals(o) || pattern.equals(x)) {
            return true;
        }
        
        return false;
    }
}      
