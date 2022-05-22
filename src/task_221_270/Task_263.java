package task_221_270;

/*
Տրված են n ամբողջ թիվը և n տարրեր պարունակող X և Y միաչափ զանգվածները, կազմել ծրագիր, որը կհաշվի և կտպի
տրված զանգվածների դրական տարրերի ընդհանուր քանակը։
*/
public class Task_263 {
    public static void main(String[] args) {

        int[] X = {10, 7, -12, -22, 1, 22, -20};
        int[] Y = {65, 58, 99, 4, 17, 10, -41};
        int positiveElOfX = 0;
        int positiveElOfY = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] > 0) {
                positiveElOfX++;
            }
        }
        for (int i = 0; i < Y.length; i++) {
            if (Y[i] > 0) {
                positiveElOfY++;
            }
        }
        System.out.println(positiveElOfX + positiveElOfY);
    }
}
