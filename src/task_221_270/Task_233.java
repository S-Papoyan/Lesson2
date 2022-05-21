package task_221_270;

/*Կազմել ծրագիր, որը կհաշվի և կտպի n հատ ամբողջ տիպի տարրեր պարունակող միաչափ զանգվածի
զույգ արժեք ունեցող տարրերի արտադրյալը և գումարը։
*/
public class Task_233 {
    public static void main(String[] args) {

        int[] array = {15, 85, 106, -25, -10, -3, -65};
        int art = 1;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                art = art * array[i];
                sum = sum + array[i];
            }
        }
        System.out.println("Զույգ տարրերի արտադրյալը = " + art);
        System.out.println("Զույգ տարրերի գումարը = " + sum);
    }
}
