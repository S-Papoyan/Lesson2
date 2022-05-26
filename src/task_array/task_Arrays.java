package task_array;

public class task_Arrays {
    public static void main(String[] args) {
        int[][] array = {{15, 25, 35}, {45, 55, 65}, {75, 85, 95}};
/*
         * * *
         * *
         *
*/
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
/*
         *
         * *
         * * *
*/
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("-------------------");
/*
         * * *
          * *
           *
*/
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                if (i <= j) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(" ");
                }

            }System.out.println();
        }
        System.out.println("-------------------");
    }
}

