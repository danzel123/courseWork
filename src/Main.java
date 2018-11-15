import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        char[][] screen;
        int wins = 0;
        int games = 0;
        int numOfHorse;
        int res;
        int num;
        int speed = 0;
        LoadingScreen.clearScreen();
        screen = LoadingScreen.setGrafic();
        LoadingScreen.getGrafic(screen);
        b:
        while (true) {
            Scanner sc = new Scanner(System.in);
            String breaker = sc.next();
            switch (breaker){
                case "q":
                    break b;
            }
        }
        LoadingScreen.clearScreen();
        loop:
        while (true) {
            LoadingScreen.clearScreen();
            games += 1;
            while (true) {
                System.out.println("На какую лошадь ставите?(Номера лошадей 1, 2, 3");
                try {
                    Scanner in = new Scanner(System.in);
                    num = in.nextInt();
                }catch (Exception e){
                    System.out.println("Введите число");
                    continue;
                }
                if (num == 1 || num == 2 || num == 3){
                    numOfHorse = num;
                    break;
                }else{
                    System.out.println("Введите 1, 2, 3");
                }
            }
            LoadingScreen.clearScreen();
            GameProces.setPole();
            Randomiser.setHorse();
            GameProces.viewPole();
            LoadingScreen.clearScreen();
            while (true){
                int[] iter = Randomiser.r();
                speed += 1;
                System.out.println(iter[0]);
                System.out.println(iter[1]);
                System.out.println(iter[2]);
                GameProces.iterGr(iter);
                GameProces.getPole();
                GameProces.viewPole();
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if ((iter[0] == 20 && iter[1] == 20)||(iter[1] == 20 && iter[2] == 20) || (iter[0] == 20 && iter[2] == 20) ||(iter[0] == 20 && iter[1] == 20 && iter[2] == 20)) {
                    res = 0;
                    break;
                }
                if (iter[0] == 20){
                    res = 1;
                    break;
                }
                if (iter[1] == 20){
                    res = 2;
                    break;
                }
                if (iter[2] == 20){
                    res = 3;
                    break;
                }

                LoadingScreen.clearScreen();
            }
            System.out.println("Лошадь номер " + res +" Пришла первой со скоростью " + speed/20);
            if (res == numOfHorse) {
                System.out.println("Вы выиграли!");
                wins += 1;
            }else{
                System.out.println("Вы проиграли :(");
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Для того, чтобы попытать удачу ещё раз, нажмите   кнопку" +
                    "\nДля выхода, нажмите 0");
            String esk = sc.next();
            switch (esk) {
                case "0":
                    System.out.println("Вы выграли "+ wins +" раз из " +games);
                    break loop;

            }

        }
    }
}
