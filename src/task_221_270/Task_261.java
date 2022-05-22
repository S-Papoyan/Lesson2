package task_221_270;

/*
Տրված են n ամբողջ թիվը և n տարրեր պարունակող X և Y միաչափ զանգվածները, կազմել ծրագիր, որը կհաշվի և կտպի
տրված զանգվածների տարրերի միջին թվաբանականների արտադրյալը։
*/
public class Task_261 {
    public static void main(String[] args) {

        int[] X = {10, 7, 12, 22, 1, 22, -20};
        int[] Y = {65, 58, 99, 4, 17, 10, -41};
        int sumOfX = 0;
        int indexOfX = 0;
        int sumOfY = 0;
        int indexOfY = 0;
        for (int i = 0; i < X.length; i++) {
            sumOfX = sumOfX + X[i];
            indexOfX++;
        }
        for (int i = 0; i < Y.length; i++) {
            sumOfY = sumOfY + Y[i];
            indexOfY++;
        }
        System.out.println((sumOfX/indexOfX)*(sumOfY/indexOfY));
    }
}