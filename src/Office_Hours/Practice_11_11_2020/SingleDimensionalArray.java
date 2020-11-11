package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        //int[] scores;  //size is 0 because nothing has been assigned

        int[] scores = new int[2]; //size of the array is 2
                       //    length = 1
                       //    last index: 1-1 = 0

        scores[0] = 10;
        scores[1] = 20; //this wont be store into the array as exceed the size of it, unless we change the size

        System.out.println(Arrays.toString(scores));

        System.out.println("==============================");

        System.out.println(scores[0]);

        System.out.println("==============================");

        for(int i=0; i< scores.length;i++){
            System.out.println(scores[i]);
        }

        System.out.println("==============================");

        for(int each: scores){
            System.out.println(each);
        }





    }
}
