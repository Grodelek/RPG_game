import java.util.HashMap;

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
}
