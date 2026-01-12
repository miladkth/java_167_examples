package concatenateTwoArraysUsingArraycopy59;

import java.util.Arrays;

public class ConcatenateTwoArraysUsingArraycopy {
    public static void main(String[] args) {
        int[] arrayOfElement1 = {1,2,3,4};
        int[] arrayOfElement2 = {5,6,7,8};

        int[] newArray = new int[arrayOfElement1.length + arrayOfElement2.length];

        System.arraycopy(arrayOfElement1,0, newArray,0,arrayOfElement1.length);
        System.arraycopy(arrayOfElement2,0,newArray,arrayOfElement1.length,arrayOfElement2.length);
        System.out.println(Arrays.toString(newArray));
    }
}
