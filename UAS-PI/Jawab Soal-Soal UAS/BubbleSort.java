public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        int n = array.length;

        // Menampilkan Urutan sebelum di sorting
        System.out.println("Array sebelum diurutkan:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Mensorting dengan Algoritma Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Jika elemen saat ini lebih besar dari elemen berikutnya, tukar
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Menampilkan Urutan setetlah di sorting
        System.out.println("\nArray setelah diurutkan:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
