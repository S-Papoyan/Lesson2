package task_array;

public class OddArrayReverse2 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reverseArray = new int[array.length];

        for (int i = 0; i < array.length / 2; i++) {
            reverseArray[i] = array[array.length - 1 - i];
            reverseArray[reverseArray.length - 1 - i] = array[i];
            reverseArray[reverseArray.length / 2] = array[array.length / 2];
        }
        for (int x : reverseArray) {
            System.out.print(x + " ");
        }
    }
}
