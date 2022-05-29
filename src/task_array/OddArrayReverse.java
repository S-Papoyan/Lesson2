package task_array;

public class OddArrayReverse {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reverseArray = new int[array.length];

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = array[i];
        }
        for (int x : reverseArray) {
            System.out.print(x + " ");
        }
    }
}
