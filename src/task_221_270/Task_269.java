package task_221_270;

/*
Տրված են n ամբողջ թիվը և n տարրեր պարունակող X և Y միաչափ զանգվածները, կազմել ծրագիր, որը կհաշվի և կտպի
X զանգվածի զույգ ինդեքս ունեցող և Y զանգվածի կենտ ինդեքս ունեցող տարրերի ընդհանուր գումարը։
*/
public class Task_269 {
    public static void main(String[] args) {

        int[] X = {10, 7, -12, 221, 1, 22, -20};
        int[] Y = {52, 5, 94, 4, 10, 1, 21};
        int evenIndexOfX = 0;
        int oddIndexOfY = 0;
        for (int i = 0; i < X.length; i = i + 2) {
            evenIndexOfX = evenIndexOfX + X[i];
        }
        for (int i = 1; i < Y.length; i = i + 2) {
            oddIndexOfY = oddIndexOfY + Y[i];
        }
        System.out.println(evenIndexOfX + oddIndexOfY);
    }
}
