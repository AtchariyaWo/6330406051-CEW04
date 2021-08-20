/*
 *  Author: Atchariya Worasit
 *  ID: 633040605-1
 *  Sec: 1
 */
package worasit.atchariya;

public class InsertionSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T item = array[i];
            int indexHole = i;
            while (indexHole > 0 && array[indexHole - 1].compareTo(item) > 0) {
                array[indexHole] = array[--indexHole];
            }
            array[indexHole] = item;
        }
    }
}
