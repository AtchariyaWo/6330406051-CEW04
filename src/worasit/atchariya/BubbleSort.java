/*
 *  Author: Atchariya Worasit
 *  ID: 633040605-1
 *  Sec: 1
 */
package worasit.atchariya;

// Bubble Sort is a simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
public class BubbleSort {
    public static void sort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

    private static void swap(Integer[] array, int a, int b) {
        Integer temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
