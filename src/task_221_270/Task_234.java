package task_221_270;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի n հատ ամբողջ տիպի տարրեր պարունակող միաչափ զանգվածի
կենտ արժեք ունեցող տարրերի միջին թվաբանականը։
*/
public class Task_234 {
    public static void main(String[] args) {

        int[] array = {15, 85, 106, -25, -10, -3, -65};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
                sum = sum + array[i];
            }
        }
        System.out.println(sum / count);
    }
}
