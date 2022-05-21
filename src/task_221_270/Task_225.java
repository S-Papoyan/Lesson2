package task_221_270;

/*Կազմել ծրագիր, որը կհաշվի և կտպի այն տարրերի արտադրյալը, որոնք բացարձակ արժեքով փոքր են
տրված t թվից։
*/
public class Task_225 {
    public static void main(String[] args) {

        int[] array = {15, 85, 105, -25, -10, -3, -65};
        int t = 30;
        int art = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = array[i] - (array[i] * 2);
            }
            if (array[i] < t) {
                art = art * array[i];
            }
        }
        System.out.println(art);
    }
}

