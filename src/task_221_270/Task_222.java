package task_221_270;

//Կազմել ծրագիր, որը կհաշվի և կտպի տրված [c;d] միջակայքին պատկանող տարրերի արտադրյալը։
public class Task_222 {
    public static void main(String[] args) {

        int c = 5;
        int d = 10;
        int art = 1;
        for (int i = 5; i <= 10; i++) {
            art *= i;
        }
        System.out.println(art);
    }
}

