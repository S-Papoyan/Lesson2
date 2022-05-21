package task_221_270;

/*Կազմել ծրագիր, որը կհաշվի և կտպի այն տարրերի քանակը, որոնք բացարձակ արժեքով փոքր են
տրված k թվից։
*/
public class Task_226 {
    public static void main(String[] args) {

        int[] array = {15, 85, 105, -25, -10, -3, -65};
        int k = 30;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = array[i] - (array[i] * 2);
            }
            if (array[i] < k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
