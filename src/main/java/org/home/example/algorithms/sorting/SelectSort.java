package org.home.example.algorithms.sorting;

public class SelectSort {

    public static void main(String[] args) {
        int[] testArray = new int[]{5, 1, 7, 9, 5, 6, 7, 3, 2, 3};
        System.out.println("--Сортировка выбором--\nИзначальный массив:");
        for(int i = 0; i< testArray.length; i++){
            System.out.print(testArray[i] + " ");
        }
        selectSort(testArray);
        System.out.println("\nСортированный массив:");
        for(int i = 0; i< testArray.length; i++){
            System.out.print(testArray[i] + " ");
        }
    }

    /**
     Данный алгоритм превосходит пузырьковую сортировку,
     ведь тут количество необходимых перестановок сокращается с O(N²) до O(N):
     мы не гоняем один элемент через весь список, но тем не менее, количество сравнений остается O(N²).
     */

    public static void selectSort(int[] array){
        
    }

}
