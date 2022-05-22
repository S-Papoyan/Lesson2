package task_221_270;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի n հատ ամբողջ տիպի տարրեր պարունակող միաչափ զանգվածի
այն տարրերի արտադրյալը, որոնք 5-ի բաժանելիս կմնա 2 մնացորդ։
*/
public class Task_244 {
    public static void main(String[] args) {

        int[] array = {17, 7, 12, 22, -71, -3, -65};
        int art = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 2) {
                art = art * array[i];

            }
        }
        System.out.println(art);

    }
}

