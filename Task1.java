import java.util.ArrayList;
import java.util.Random;

//  заполнения рандомными числами матрицы
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(10));
        System.out.println(list);

        list.removeIf(number -> number % 2 == 0);
        System.out.println(list);
           }
        }
    }