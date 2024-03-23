import board.Board;
import game.Game;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Board b = new Board(3, '-');
        
        Player p1 = new Player();
        p1.setPlayerNameAndSymbol("Abhi", 'X');
        p1.getPlayerNameAndSymbol();
        
        Player p2 = new Player();
        p2.setPlayerNameAndSymbol("Shruti", 'O');
        p2.getPlayerNameAndSymbol();
        Game g = new Game(new Player[]{p1, p2}, b);
        g.play();
    }
}
