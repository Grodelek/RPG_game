import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        RPG_game game = new RPG_game();
        char[][] plansza = new char[10][15];
        Hero hero = new Hero();
        hero.pozycjaX = rand.nextInt(plansza.length);
        hero.pozycjaY = plansza[0].length-1;
        //Tworzenie planszy
        game.stworzPlansze(plansza);
        game.printRoom(plansza);
        System.out.println();
        //Umieszczanie bohatera na planszy
        plansza[hero.pozycjaX][hero.pozycjaY] = hero.znak;
        game.printRoom(plansza);
    }
}

