package codingChallenges;

public class missingNUmber {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,10};
        int intial = 0;
        for (int i : arr){
            if (intial != i){
                System.out.println(intial);
            } else {
                intial+=1;
            }
        }

    }
}
