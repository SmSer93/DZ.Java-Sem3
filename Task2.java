import java.util.ArrayList;
import java.util.Random;

//Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее ариф. из этого списка.


public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        
        for (int i = 0; i < 5; i++) {
            list.add(rnd.nextInt(100));
        System.out.println(list);

        int max = 0;
        int min = 100;
        int sum = 0;

        for (Integer number : list){
            if (number > max)
            max = number;
            if (number < min)
            min = number;
            sum += number;
        
        }
        System.out.println("max = "+ max + ", " + "min = " + min + ", " + "avarage = " + sum / list.size());
           }
        }
    }