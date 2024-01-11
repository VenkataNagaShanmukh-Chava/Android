package codingChallenges;

public class excep {

    public static void main(String[] args) {
        int[] arr = new int[3];
        try {
            System.out.println(arr[4]);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }

        String[] s = new String[9];
        try {
            System.out.println(s[0].length());
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
    }
}
