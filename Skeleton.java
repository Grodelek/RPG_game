import java.util.HashMap;
import java.util.Random;

public class Skeleton {
    char znak = 'S';
    int pozycjaX;
    int pozycjaY;
    HashMap<String, Integer> attributes = new HashMap<>();

    public void setSkeletonPosition(char[][] board,Skeleton[] skeleton){
        Random rand = new Random();
        for(int i=0; i<skeleton.length; i++){
            skeleton[i] = new Skeleton();
            skeleton[i].pozycjaX = rand.nextInt(board.length);
            skeleton[i].pozycjaY = rand.nextInt(board[0].length);
        }
    }

    public void setAttributes(String attribute, int value) {
        attributes.put(attribute, value);
    }

    public int getAttributes(String attribute) {
        return attributes.getOrDefault(attribute, 0);
    }
}
