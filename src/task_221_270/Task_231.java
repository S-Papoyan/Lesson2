package task_221_270;

/*Կազմել ծրագիր, որը կհաշվի և կտպի n հատ ամբողջ տիպի տարրեր պարունակող միաչափ զանգվածի
զույգ արժեք ունեցող տարրերի քառակուսիների գումարը։
*/
public class Task_231 {
    public static void main(String[] args) {

        int[] array = {15, 85, 106, -25, -10, -3, -65};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i] * array[i];
            }
        }
        System.out.println(sum);
    }
}
