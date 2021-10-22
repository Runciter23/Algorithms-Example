package org.home.example.algorithms.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] testArray = new int[]{5, 1, 7, 9, 5, 6, 7, 3, 2, 3};
        System.out.println("--Быстрая сортировка--\nИзначальный массив:");
        for (int k : testArray) {
            System.out.print(k + " ");
        }
        quickSort(testArray);
        System.out.println("\nСортированный массив:");
        for (int j : testArray) {
            System.out.print(j + " ");
        }
    }

    /**
     Вне всяких сомнений, алгоритм быстрой сортировки считается самым популярным,
     так как в большинстве ситуаций он выполняется быстрее остальных, за время O(N*logN).
     */

    public static void quickSort(int[] array) {
        recursionFastSort(array, 0, array.length - 1);
    }


    public static void recursionFastSort(int[] array, int min, int max) {
        if (array.length == 0)// условие выхода из рекурсии,  если длина массива равна 0
            return;

        if (min >= max) //выходим, так как нечего уже делить
            return;


        int middle = min + (max - min) / 2;  // выбираем середину
        int middleElement = array[middle];


        int i = min, j = max;
        while (i <= j) {  // относительно элемента middle определяем меньшие элементы слева, большие справа
            while (array[i] < middleElement) {
                i++;
            }
            while (array[j] > middleElement) {
                j--;
            }

            if (i <= j) {      //меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (min < j) // запускаем рекурсию с элементами меньшими чем middle
            recursionFastSort(array, min, j);

        if (max > i)// запускаем рекурсию с элементами большими чем middle
            recursionFastSort(array, i, max);
    }

}
