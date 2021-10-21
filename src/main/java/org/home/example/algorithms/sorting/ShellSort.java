package org.home.example.algorithms.sorting;

public class ShellSort {

    public static void main(String[] args) {
        int[] testArray = new int[]{5, 1, 7, 9, 5, 6, 7, 3, 2, 3};
        System.out.println("--Сортировка методом Шелла--\nИзначальный массив:");
        for (int k : testArray) {
            System.out.print(k + " ");
        }
        shellSort(testArray);
        System.out.println("\nСортированный массив:");
        for (int j : testArray) {
            System.out.print(j + " ");
        }
    }

    /**
     На данный момент толком не обоснована эффективность сортировки Шелла,
     так как в разных ситуациях результаты отличаются.
     Оценки, полученные на основании экспериментов, лежат в интервале от O(N^3/2) до O(N^7/6)
     */

    public static void shellSort(int[] array){

        int length = array.length;
        int step = length / 2;
        while (step > 0) {
            for (int numberOfGroup = 0; numberOfGroup < length - step; numberOfGroup++) {// проходим по всем нашим группам
                int j = numberOfGroup;
                while (j >= 0 && array[j] > array[j + step]) {//сортировка вставкой внутри группы
                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                    j--;
                }
            }
            step = step / 2; // уменьшаем наш шаг
        }

    }

}
