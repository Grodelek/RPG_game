public class RPG_game{
    public void stworzPlansze(char[][] plansza){
        for(int i=0; i<plansza.length; i++){
            for(int j=0; j<plansza[i].length; j++){
                plansza[i][j] = '.';
            }
        }
    }
}
