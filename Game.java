import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    Board board;
    Bot bot;
    OptimalBot obot;
    Player[] players;
    Game(int N){
        board = new Board(N);
        players = new Player[N-1];
        for(int i = 0 ; i < N-1 ; i++){
            System.out.println("Enter the symbol for player "+(i+1));
            char symbol = sc.next().charAt(0);
            players[i] = new Player(symbol);
        }
    }

}
