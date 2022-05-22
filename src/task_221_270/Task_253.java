package task_221_270;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի n հատ ամբողջ տիպի տարրեր պարունակող միաչափ զանգվածի
մեծագույն և փոքրագույն տարրերի գումարը։
*/
public class Task_253 {
    public static void main(String[] args) {

        int[] array = {10, 7, 12, 22, 1, -3, -65};
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max + min);
    }
}

