package day22_Arras_Loops;

public class NestedLoopArray {
    public static void main(String[] args) {
        //                   0    1      0   1   2      0   1   2
        char [] [] arr2D={ {'A', 'B'}, {'C','D','E'}, {'F','J','H'} };
        //                      0           1               2
        // each index in arr2D MUST be single dimensional array
        // arr2D[0]==>{'A', 'B'}
        for (int i=0; i<arr2D[0].length; i++){
            System.out.println(arr2D[0][i]); // A B
        }
        for (int i=0; i<arr2D[1].length; i++){
            System.out.println(arr2D[1][i]);//C D E
        }
        for (int i=0; i<arr2D[2].length; i++){
            System.out.println(arr2D[2][i]);// F J H
        }
        System.out.println("=============================");

        for (int j=0; j<arr2D.length; j++){// j: index number of 1D array. i: number of elements
            for (int i=0; i<arr2D[j].length; i++){
                System.out.print(arr2D[j][i]+" "); //
            }
        }





    }
}
