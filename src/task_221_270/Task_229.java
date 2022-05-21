package task_221_270;

/*Կազմել ծրագիր, որը կհաշվի և կտպի այն տարրերի արտադրյալը, որոնց արժեքի և ինդեքսի տարբերությունը
դրական թիվ է։
*/
public class Task_229 {
    public static void main(String[] args) {

        int[] array = {15, 85, 105, -25, -10, -3, -65};
        int art = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] - i > 0) {
                art = art * array[i];
            }
        }System.out.println(art);
    }
}
