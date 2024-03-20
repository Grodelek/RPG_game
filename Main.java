import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        RPG_game game = new RPG_game();
        char[][] board = new char[10][15];
        Hero hero = new Hero();
        hero.pozycjaX = board.length-1;
        hero.pozycjaY = rand.nextInt(board[0].length);
        //Creating a board
        game.stworzPlansze(board);
        //Placing Hero on a board
        board[hero.pozycjaX][hero.pozycjaY] = hero.znak;
        printRoom(board);
        //Adding Hero movement
        hero.heroMovement(board,hero);
        printRoom(board);

    }

    public static void printRoom(char[][] board){
        for(int i=0; i< board.length; i++){
            for(int j=0; j< board[i].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}

