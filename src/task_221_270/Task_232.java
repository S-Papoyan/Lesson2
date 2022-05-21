package task_221_270;

/*Կազմել ծրագիր, որը կհաշվի և կտպի n հատ ամբողջ տիպի տարրեր պարունակող միաչափ զանգվածի
զույգ արժեք ունեցող տարրերի քանակը։
*/
public class Task_232 {
    public static void main(String[] args) {

        int[] array = {15, 85, 106, -25, -10, -3, -65};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
