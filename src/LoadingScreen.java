import java.io.IOException;

public class LoadingScreen {

    private static int width = 21;
    private static int height = 15;
    char logo [][] = new char[7][79];


    public static int getHeight() {
        return height;
    }

    public static int getWidth() {
        return width;
    }

    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static char[][] setGrafic(){

        String str1 = "С К А Ч К И";
        String str2 = "@Денис Кривошапко";
        String str3 = "Нажмите q";
        String str4 = "чтобы начать!";

        char points [][] = new char[height][width];
//        for (int i = 0; i < getHeight(); i++){
//            for ( int n = 0; n < getWidth(); n++){
//                points[i][n] = '.';
//            }
//        }

        for (int i = 0; i < getWidth(); i++){
            points[0][i] = '_';
        }

        for (int i = 0; i < getWidth(); i++){
            points[height-1][i] = '_';
        }

        for (int i = 1; i < getHeight(); i++){
            points[i][0] = '|';
        }

        for (int i = 1; i < getHeight(); i++){
            points[i][width-1] = '|';
        }

        for (int i = 0; i < 11; i++) {
            points[2][5 + i] = str1.charAt(i);
        }

        for (int i = 0; i < 17; i++) {
            points[height - 2][2 + i] = str2.charAt(i);
        }

        for (int i = 0; i < 9; i++) {
            points[height - 7][6 + i] = str3.charAt(i);
        }

        for (int i = 0; i < 12; i++) {
            points[height - 6][4 + i] = str4.charAt(i);
        }

        return points;
    }

    public static void getGrafic (char[][] points) {
        for (int i = 0; i < getHeight() ; i++) {
            for (int n = 0; n < getWidth(); n++) {
                System.out.print(points[i][n]);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print('\n');
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
