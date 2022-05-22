package task_221_270;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի n հատ ամբողջ տիպի տարրեր պարունակող միաչափ զանգվածի
այն տարրերի գումարը, որոնք արժեքի և ինեքսի գումարի քառակուսին առանց մնացորդի բաժանվում է տրված k ամբողջ թվին։
*/
public class Task_248 {
    public static void main(String[] args) {

        int[] array = {10, 7, 12, 22, 1, -3, -65};
        int sum = 0;
        int k = 5;
        for (int i = 0; i < array.length; i++) {
            if ((array[i]+i) * (array[i]+i) % k == 0) {
                sum = sum + array[i];

            }
        }
        System.out.println(sum);
    }
}
