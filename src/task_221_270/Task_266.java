package task_221_270;

/*
Տրված են n ամբողջ թիվը և n տարրեր պարունակող X և Y միաչափ զանգվածները, կազմել ծրագիր, որը կհաշվի և կտպի
X զանգվածի կենտ արժեք ունեցող տարրերի և Y զանգվածի զույգ արժեք ունեցող տարրերի գումարների տարբերությունը։
*/
public class Task_266 {
    public static void main(String[] args) {

        int[] X = {10, 7, -12, 221, 1, 22, -20};
        int[] Y = {52, 5, 94, 4, 10, 1, 21};
        int oddElOfX = 0;
        int evenElofY = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] % 2 != 0) {
                oddElOfX = oddElOfX + X[i];
            }
        }
        for (int i = 0; i < Y.length; i++) {
            if (Y[i] % 2 == 0) {
                evenElofY = evenElofY + Y[i];
            }
        }
        System.out.println(oddElOfX / evenElofY);
    }
}
