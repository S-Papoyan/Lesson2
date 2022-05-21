package task_221_270;

/*Կազմել ծրագիր, որը կհաշվի և կտպի այն տարրերի գումարը, որոնց ինդեքսը առանց մնացորդի բաժանվում է
տրված k ամբողջ թվին։
*/
public class Task_228 {
    public static void main(String[] args) {

        int[] array = {15, 85, 105, -25, -10, -3, -65};
        int k = 2;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                sum = sum + i;

            }
        }
        System.out.println(sum);
    }
}
