import java.util.HashMap;
import java.util.Scanner;

public class Hero {
    char znak = 'H';
    int pozycjaX;
    int pozycjaY;
    HashMap<String, Integer> attributes = new HashMap<>();
    public void setAttributes(String attribute, int value) {
        attributes.put(attribute, value);
    }
    public int getAttributes(String attribute) {
        return attributes.getOrDefault(attribute, 0);
    }
    public void heroMovement(char[][] board, Hero hero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose letter");
        System.out.println("W - up A- left S- down D-right");
        char move = sc.next().charAt(0);
        try {
            switch (move){
                case 'W':
                case 'w':
                        board[hero.pozycjaX][pozycjaY] = '.';
                        hero.pozycjaX = hero.pozycjaX - 1;
                        board[hero.pozycjaX][hero.pozycjaY] = hero.znak;
                        break;
                case 'A':
                case 'a':

                        board[hero.pozycjaX][pozycjaY] = '.';
                        hero.pozycjaY = hero.pozycjaY - 1;
                        board[hero.pozycjaX][hero.pozycjaY] = hero.znak;
                        break;
                case 'S':
                case 's':
                        board[hero.pozycjaX][pozycjaY] = '.';
                        hero.pozycjaX = hero.pozycjaX + 1;
                        board[hero.pozycjaX][hero.pozycjaY] = hero.znak;
                        break;
                case 'D':
                case 'd':
                        board[hero.pozycjaX][pozycjaY] = '.';
                        hero.pozycjaY = hero.pozycjaY + 1;
                        board[hero.pozycjaX][hero.pozycjaY] = hero.znak;
                        break;
                default:
                        System.out.println("No action assigned to this key");
                        break;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Hero out of bounds exception");
                }
            }
        }

