
import board.Board;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Board b = new Board(3, '-');
        Player p = new Player();
        
        p.setPlayerDetails("Abhi", 'X', "Bangalore, India", 9123178432L, "abhi234r@gmail.com", 30);
    }
}
