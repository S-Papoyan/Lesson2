package task_221_270;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի n հատ ամբողջ տիպի տարրեր պարունակող միաչափ զանգվածի
մեծագույն տարրի և իր համարի գումարը։
*/
public class Task_255 {
    public static void main(String[] args) {

        int[] array = {10, 7, 12, 22, 1, -3, -65};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                max = max + i;
            }
        }
        System.out.println(max);
    }
}
