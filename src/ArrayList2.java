import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int numbers;
        while (true) {
            numbers = scanner.nextInt();
            if (numbers == 0) {
                break;
            }
            arrayList.add(numbers);
        }

        System.out.println(Avg(arrayList));
        System.out.println(Max(arrayList));
        System.out.println(Min(arrayList));
        RemoveOddNumbers(arrayList);
    }

    public static double Avg(ArrayList<Integer> arrayList) {
        double sum = 0.0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        return sum / arrayList.size();
    }

    public static int Max(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        return max;
    }

    public static int Min(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        return min;
    }

    public static void RemoveOddNumbers(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0) {
                System.out.print(arrayList.get(i) + " ");
            }
        }
    }
}
