package org.home.example.algorithms.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] testArray = new int[]{5, 1, 7, 9, 5, 6, 7, 3, 2, 3};
        System.out.println("--Сортировка методом вставки--\nИзначальный массив:");
        for (int k : testArray) {
            System.out.print(k + " ");
        }
        insertionSort(testArray);
        System.out.println("\nСортированный массив:");
        for (int j : testArray) {
            System.out.print(j + " ");
        }
    }

    /**
     Данный вид сортировки превосходит вышеописанные,
     так как несмотря на то, что время работы такое же — O(N²),
     этот алгоритм работает вдвое быстрее пузырьковой сортировки
     и немного быстрее сортировки выбором.
     */

    public static void insertionSort(int[] array){

        for (int i = 1; i < array.length; i++) { // i - разделяющий маркер
            int temp = array[i]; // делаем копию помеченного элемента
            int j = i;
            while (j > 0 && array[j - 1] >= temp) { // пока не будет найден меньший элемент
                array[j] = array[j - 1]; // сдвигаем элементы вправо
                --j;
            }
            array[j] = temp;   // вставляем отмеченный элемент, в положеное ему место
        }

    }

}
