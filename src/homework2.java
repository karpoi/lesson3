import java.util.Arrays;

public class homework2 {
    //Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void main(String[] args) {
        System.out.println("Task 1");

            int[] arr = {1, 0, 0, 1, 0};
            System.out.println("Начальный массив");
            for (int value : arr) {
                System.out.print(value + " ");
            }
                System.out.println("");
                System.out.println("Исправленный массив");
            for (int x = 0; x < arr.length; x++) {
                if (arr[x] == 0) {
                    arr[x] = 1;
                } else {
                    arr[x] = 0;
                }

                }

            System.out.print(Arrays.toString(arr));


//task 2
//Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println(" ");
        System.out.println("Task 2");
        int y = 0;

        int[] arr1 = new int [8];
        System.out.println("Начальный массив");
        System.out.print(Arrays.toString(arr1));;

        System.out.println("");
        System.out.println("Исправленный массив");
        for (int x = 0; x < arr1.length; x++) {
            arr1[x] = y;
            y = y + 3;
            }
        for (int value : arr1) {
            System.out.print(value + " ");
        }
//task 3
//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
// и числа меньшие 6 умножить на 2;
        System.out.println(" ");
        System.out.println("Task 3");
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Начальный массив");
        for (int value : arr2) {
            System.out.print(value + " ");
        }
        System.out.println("");
        System.out.println("Исправленный массив");
        for (int x = 0; x < arr2.length; x++) {
            if (arr2[x] > 6) {
                y = arr2[x] * 2;
                arr2[x] = y;
            }

        }
        for (int value : arr2) {
            System.out.print(value + " ");
        }

//Task 4
//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println(" ");
        System.out.println("Task 4");
        System.out.println("Начальный массив");
        int[][] arr3 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Исправленный массив");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr3[i][j] = 1;}
                            System.out.print(arr3[i][j] + " ");
                }

            System.out.println(" ");
        }
// Task 5
// ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
// (без помощи интернета);
        System.out.println(" ");
        System.out.println("Task 5");
        int[] arr4 = {1, 5, 3, 22, 11 };
        System.out.println("Начальный массив");
        for (int value : arr4) {
            System.out.print(value + " ");
        }
        System.out.println("");
        y = arr4[0];
        for (int x = 0; x < arr4.length; x++) {
            if (arr4[x] > y) {
                y = arr4[x];
            }
        }
        System.out.println("Max " + y);
        y = arr4[0];
        for (int x = 0; x < arr4.length; x++) {
            if (arr4[x] < y) {
                y = arr4[x];
            }
        }
        System.out.println("Min " + y);


    }
}


