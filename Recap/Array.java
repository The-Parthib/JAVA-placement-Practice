public class Array {
    public static void main(String[] args) {
/*
        int [] student = new int[5];
        student[0] = 3;
        student[1] = 4;
        student[3] = 1;
        student[4] = 6;
        student[2] = 9;
        for (int i = 0; i < student.length; i++) {
            System.out.print(student[i]+" ");
        }
        */

       // int[][] myArr = new int[2][3];

        int[][] myArr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(myArr[1].length);

        // for (int i = 0; i < myArr.length; i++) {
        //     for (int j = 0; j < myArr[i].length; j++) {
        //         System.out.print(myArr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}
