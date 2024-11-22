package practice.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Find_2nd_highst_in_a_array {

    public static void main(String[] args) {

        int[] a = {20,10,50,40,30};
        System.out.println(Arrays.stream(a).sorted().skip(1).findFirst().getAsInt());



    }
}
