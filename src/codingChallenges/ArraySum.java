package codingChallenges;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,-3,-2,-1,2};
        int sum =0 ;
        for (int i : arr){
            sum += i;
        }
        System.out.println(sum);
    }
}
