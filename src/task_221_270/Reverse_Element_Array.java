package task_221_270;

public class Reverse_Element_Array {
    public static void main(String[] args) {

        int[] array = {50, 60, 70, 80, 111, 222, 333, 444};
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
