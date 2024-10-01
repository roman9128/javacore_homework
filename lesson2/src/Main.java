import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] arr = { -1, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Integer[] arr2 = { 1, null, null, 5, 6, 7 };

        System.out.println("Чётных чисел в массиве: " + countEvens(arr));
        System.out.println("Разница между самым большим и самым маленьким элементами массива: " + findDifference(arr));
        System.out.println("В массиве есть два соседних элемента с нулевым значением: " + checkForNeighboringNulls(arr2));

    }

    //Написать метод, возвращающий количество чётных элементов массива.
    // countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    private static int countEvens(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
    private static int findDifference(int[] arr) {
    // Конечно, можно было просто циклом пройтись по массиву и найти мин. и макс. значения, но захотелось немного заморочиться и сделать меньше строк.
        Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new); // перевожу массив интов в массив интеджеров, т.к. Collections.min и max с интами не заработали
        return Collections.max(Arrays.asList(array)) - Collections.min(Arrays.asList(array)); 
    }

    // Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента с нулевым значением.
    private static boolean checkForNeighboringNulls(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i - 1] == null && arr[i] == null){
                return true;
            }
        }
        return false;
    }
}