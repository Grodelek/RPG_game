import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        RPG_game game = new RPG_game();
        char[][] board = new char[10][15];
        Hero hero = new Hero();
        Skeleton[] skeleton = new Skeleton[5];
        boolean running = true;
        hero.pozycjaX = board.length - 1;
        hero.pozycjaY = rand.nextInt(board[0].length);
        //Creating a board
        game.stworzPlansze(board);
        //Placing Hero on a board
        board[hero.pozycjaX][hero.pozycjaY] = hero.znak;
        //Placing Skeleton on a board
        for (int i = 0; i < skeleton.length; i++) {
            skeleton[i] = new Skeleton();
            skeleton[i].setSkeletonPosition(board, skeleton);
            board[skeleton[i].pozycjaX][skeleton[i].pozycjaY] = skeleton[i].znak;
        }

        printRoom(board);
        //Adding Hero movement
        while (running == true) {
            hero.heroMovement(board, hero);
            space();
            hero.heroStats(hero);
            hero.getHeroStats();
            printRoom(board);
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[hero.pozycjaX][hero.pozycjaY] == board[0][j]) {
                        running = false;
                    }
                }
            }
        }
    }

    public static void printRoom(char[][] board){
        for(int i=0; i< board.length; i++){
            for(int j=0; j< board[i].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void space(){
        for (int i = 0; i < 6; i++) {
            System.out.println();
        }
    }
}

