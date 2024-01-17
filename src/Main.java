import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> namesA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите имя: " + (i + 1));
            String name = scan.nextLine();

            namesA.add(name);
        }
        System.out.println("Ваш список А " + namesA);
        System.out.println("----------");

        ArrayList<String> namesB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите имя: " + (i + 1));
            String name = scan.nextLine();

            namesB.add(name);
        }
        System.out.println("Ваш список В " + namesB);
        System.out.println("----------");

        ArrayList<String> nameC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            nameC.add(namesA.get(i));
            nameC.add(namesB.get(4 - i));
        }
        System.out.println("Ваш список C " + nameC);

        nameC.sort(Comparator.comparingInt(String::length));
        System.out.println(nameC);
    }
}