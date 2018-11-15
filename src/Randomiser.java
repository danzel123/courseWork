import java.util.Random;
import java.util.Random.*;


public class Randomiser {
    private static int[] horse = {0,0,0};
    public static int[] r(){
        Random r = new Random();
           for (int x = 0; x < 3; x++) {
               int runR = r.nextInt(2);
               horse[x] += runR;
               //System.out.printf("Лошадь %d бежит на %d вперед до финиша ей осталось %d\n", x, runR, horse[x]);
               }
        return horse;
    }

    public static void setHorse() {
        Randomiser.horse[0] = 0;
        Randomiser.horse[1] = 0;
        Randomiser.horse[2] = 0;
    }
}