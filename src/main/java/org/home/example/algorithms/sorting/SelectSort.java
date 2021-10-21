package org.home.example.algorithms.sorting;

public class SelectSort {

    public static void main(String[] args) {
        int[] testArray = new int[]{5, 1, 7, 9, 5, 6, 7, 3, 2, 3};
        System.out.println("--Сортировка выбором--\nИзначальный массив:");
        for (int k : testArray) {
            System.out.print(k + " ");
        }
        selectSort(testArray);
        System.out.println("\nСортированный массив:");
        for (int j : testArray) {
            System.out.print(j + " ");
        }
    }

    /**
     Данный алгоритм превосходит пузырьковую сортировку,
     ведь тут количество необходимых перестановок сокращается с O(N²) до O(N):
     мы не гоняем один элемент через весь список, но тем не менее,
     количество сравнений остается O(N²).
     */

    public static void selectSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            int indexOfMin = i;

            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[indexOfMin]){
                    indexOfMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin] = temp;
        }
    }

}
