import java.util.HashMap;
import java.util.Random;

public class Skeleton {
    char znak = 'S';
    int[] pozycjaX = new int[10];
    int[] pozycjaY = new int[15];
    HashMap<String, Integer> attributes = new HashMap<>();
    public static void setSkeletonPosition(char[][] board,Skeleton[] skeleton){
        Random rand = new Random();
        for(int i=0; i<skeleton.length; i++){
            skeleton[i] = new Skeleton();
            skeleton[i].pozycjaX[i] = rand.nextInt(board.length);
            skeleton[i].pozycjaY[i] = rand.nextInt(board[0].length);
            board[skeleton[i].pozycjaX[i]][skeleton[i].pozycjaY[i]] = skeleton[i].znak;
        }
    }
    public void skeletonStats(Skeleton[] skeleton){
        for(int i=0; i < skeleton.length; i++) {
            skeleton[i].setAttributes("Health", 10);
            skeleton[i].setAttributes("Damage", 2);
        }
    }

    public void setAttributes(String attribute, int value) {
        attributes.put(attribute, value);
    }

    public int getAttributes(String attribute) {
        return attributes.getOrDefault(attribute, 0);
    }
}
