package task_221_270;

/*
Տրված են n ամբողջ թիվը և n տարրեր պարունակող X և Y միաչափ զանգվածները, կազմել ծրագիր, որը կհաշվի և կտպի
X զանգվածի տարրերի գումարի հարաբերությունը Y զանգվածի տարրերի արտադրյալին։
*/
public class Task_265 {
    public static void main(String[] args) {

        int[] X = {10, 7, -12, 22, 1, 22, -20};
        int[] Y = {5, 5, 9, 4, 1, 1, 21};
        int sumOfElX = 0;
        int artY = 1;
        for (int i = 0; i < X.length; i++) {
            sumOfElX = sumOfElX + X[i];
        }
        for (int i = 0; i < Y.length; i++) {
            artY = artY * Y[i];
        }
        System.out.println(sumOfElX/artY);
    }
}


