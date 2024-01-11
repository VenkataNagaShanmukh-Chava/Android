package codingChallenges;

public class over extends dummy {
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    void abc(){
        System.out.println("overriding ");
    }
    public static void main(String[] args) {
        over o = new over();
        System.out.println(o.sum(8,9));
        System.out.println(o.sum(8,9,1));
        o.abc();

    }
}
