import java.util.HashMap;
import java.util.Scanner;

public class Hero {
    char znak = 'H';
    int pozycjaX;
    int pozycjaY;
    HashMap<String, Integer> attributes = new HashMap<>();
    public void setAttributes(String attribute, int value){
        attributes.put(attribute,value);
    }
    public int getAttributes(String attribute){
        return attributes.getOrDefault(attribute,0);
    }
    public void heroMovement(char[][] board,Hero hero){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose letter");
        System.out.println("W - up A- left S- down D-right");
        char move = sc.next().charAt(0);
        if (move == 'W' || move == 'w') {
            board[hero.pozycjaX][hero.pozycjaY] = board[hero.pozycjaX-1][hero.pozycjaY];
            board[hero.pozycjaX-1][hero.pozycjaY] = hero.znak;
        }
    }
}
