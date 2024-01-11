package collectionslocal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class swap {
    ArrayList<String> swapStrings(ArrayList<String> input , int i , int j){
        String temp = input.get(i);
        input.set(i,input.get(j));
        input.set(j,temp);
//        Collections.max(input);
        return input;

    }

    public static void main(String[] args) {
        swap s= new swap();
    }
}
