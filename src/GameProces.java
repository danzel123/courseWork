public class GameProces {
    private static char pole[][] = new char[3][20];
    private static int first = 1;
    private static int second = 2;
    private static int third = 3;
    private static int x1 = 0;
    private static int x2 = 0;
    private static int x3 = 0;

    public static char[][] getPole() {
        return pole;
    }

    public static void setPole(char[][] pole) {
        GameProces.pole = pole;
    }

    public static int getX1() {
        return x1;
    }

    public static int getX2() {
        return x2;
    }

    public static int getX3() {
        return x3;
    }

    public static void setX1(int x1) {
        GameProces.x1 = x1;
    }

    public static void setX2(int x2) {
        GameProces.x2 = x2;
    }

    public static void setX3(int x3) {
        GameProces.x3 = x3;
    }

    public static void setPole() {
        for (int i = 0; i < 20; i++) {
            getPole()[0][i] = '.';
            getPole()[1][i] = '.';
            getPole()[2][i] = '.';
        }
        getPole()[0][0] = '1';
        getPole()[1][0] = '2';
        getPole()[2][0] = '3';
        setX1(0);
        setX2(0);
        setX3(0);
    }

    public static void iterGr(int[] horse) {
        char[][] nPole = getPole();
        nPole[0][getX1()] = '.';
        setX1(horse[0]);
        try {
            nPole[0][horse[0]] = '1';
        }catch (ArrayIndexOutOfBoundsException e){
            return;
        }
        nPole[1][getX2()] = '.';
        setX2(horse[1]);
        try {
            nPole[1][horse[1]] = '2';
        }catch (ArrayIndexOutOfBoundsException e){
            return;
        }
        nPole[2][getX3()] = '.';
        setX3(horse[2]);
        try {
            nPole[2][horse[2]] = '3';
        }catch (ArrayIndexOutOfBoundsException e){
            return;
        }
        setPole(nPole);

    }

    public static void viewPole() {
        char[][] nPole = getPole();
        for (int i = 0; i < 3; i++) {
            for (int n = 0; n < 20; n++) {
                System.out.print(nPole[i][n]);
            }
            System.out.println();
        }

    }
}
