package org.home.example.algorithms.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] testArray = new int[]{5, 1, 7, 9, 5, 6, 7, 3, 2, 3};
        System.out.println("--Пузырьковая сортировка--\nИзначальный массив:");
        for (int j : testArray) {
            System.out.print(j + " ");
        }
        bubbleSort(testArray);
        System.out.println("\nСортированный массив:");
        for (int j : testArray) {
            System.out.print(j + " ");
        }
    }

    /**
     Пузырьковая сортировка весьма и весьма медленная, с временной сложностью O(N²),
     так как мы имеем вложенные циклы. Внешний проход по элементам выполняется за N раз,
     внутренний — тоже N раз, и в итоге мы получаем N*N, N² итераций
     */

    public static void bubbleSort(int[] array){
        for(int i = array.length-1; i > 1; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

}
