package task_221_270;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի n հատ ամբողջ տիպի տարրեր պարունակող միաչափ զանգվածի
կենտ արժեք ունեցող տարրերի քանակը և արտադրյալը։
*/
public class Task_236 {
    public static void main(String[] args) {

        int[] array = {15, 85, 106, -25, -10, -3, -65};
        int art = 1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
                art = art * array[i];
            }
        }
        System.out.println("Քանակը = " + count);
        System.out.println("Արտադրյալը = " + art);
    }
}
