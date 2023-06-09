import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Main {
    public static int[] array = {5, 0, 2, 10};
    public static int[] list;
    public static File file = new File("E://file.pdf");


    public static void main(String[] args) throws FileNotFoundException, WrongLengthException {
        // Задание 1 - Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//        arithmeticEx();
//        outOfBoundsEx();
//        nullPointerEx();
//        fileNotFoundEx();

        // Задание 2 - Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?:
        String[][] arr = {{"0", "1", "2", "6", "4", "2"}, {"3", "4", "5", "3", "2"}};
//        System.out.print(sum2d(arr));
        // Ответ:
        // 1) NumberFormatException - если вместо цифр будут к примеру буквы
        // 2) ArrayIndexOutOfBoundsException - если любая из строк массива содержит менее 5 элементов
        // 3) NullPointerException - если массив на входе равен null;

        // Задание 3 - Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый
        // массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины
        // массивов не равны, необходимо как-то оповестить пользователя.
        int[] arr1 = {1, 10, 30, 2, -5};
        int[] arr2 = {4, -10, 3, 16, 3};
//        System.out.print(Arrays.toString(formArray3(arr1, arr2)));

        // Задание 4 - * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
        // новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если
        // длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное
        // исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
        int[] arr4 = {30, -100, 30, 2, -10};
        int[] arr5 = {10, -10, 10, 16, -5};
        System.out.print(Arrays.toString(formArray6(arr4, arr5)));
    }

    public static void arithmeticEx() {
        int result = array[0] / array[1];
    }

    public static void outOfBoundsEx() {
        int result = array[4];
    }

    public static void nullPointerEx() {
        int result = list[2];
    }

    public static void fileNotFoundEx() throws FileNotFoundException {
        FileReader fr = new FileReader(file);
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static int[] formArray3(int[] arr1, int[] arr2) throws WrongLengthException {
        if (arr1.length != arr2.length)
            throw new WrongLengthException("Длины массивов на входе должны быть одинаковы!!!");
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] - arr2[i];
        }
        return arr3;
    }

    public static int[] formArray6(int[] arr4, int[] arr5) throws RuntimeException {
        int[] arr6 = new int[arr4.length];
        if (arr4.length != arr5.length) {
            System.out.print("Длины массивов на входе должны быть одинаковы!!!\n");
            arr6 = null;
        } else {
            try {
                for (int i = 0; i < arr4.length; i++) {
                    arr6[i] = arr4[i] / arr5[i];
                }
            } catch (RuntimeException e) {
                System.out.print("Что-то пошло не так!\n");
                arr6 = null;
            }
        }
        return arr6;
    }
}