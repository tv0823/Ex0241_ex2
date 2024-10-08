public class Main {
    public static void main(String[] args)
    {
        Playable[] instrioment = new Playable[3];
        instrioment[0] = new Guitar();
        instrioment[1] = new Piano();
        instrioment[2] = new Drum();
        
        for(Playable player : instrioment)
        {
            player.play();
        }
    }
}
