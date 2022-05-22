package task_221_270;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի n հատ ամբողջ տիպի տարրեր պարունակող միաչափ զանգվածի
առաջին մեծագույն տարրի համարը։
*/
public class Task_257 {
    public static void main(String[] args) {

        int[] array = {10, 7, 12, 22, 1, 22, -65};
        int max = 0;
        int indexOfFirstMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfFirstMax = i;
            }
        }System.out.println(indexOfFirstMax);
    }
}