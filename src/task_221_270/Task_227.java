package task_221_270;

/*Կազմել ծրագիր, որը կհաշվի և կտպի այն տարրերի միջին թվաբանականը, որոնց ինդեքսը բազմապատիկ է
է տրված k ամբողջ թվին։
*/
public class Task_227 {
    public static void main(String[] args) {

        int[] array = {15, 85, 105, -25, -10, -3, -65};
        int k = 2;
        int countOfIndex = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                sum = sum + i;
                countOfIndex++;

            }
        }
        System.out.println(sum / countOfIndex);
    }
}

