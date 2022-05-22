package task_221_270;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի n հատ ամբողջ տիպի տարրեր պարունակող միաչափ զանգվածի
զրո արժեք ունեցող տարրերի քանակը։
*/
public class Task_237 {
    public static void main(String[] args) {

        int[] array = {15, 85, 106, 0, -10, -3, -65};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;

            }
        }
        System.out.println(count);
    }
}
