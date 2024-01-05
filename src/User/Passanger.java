package User;

public class Passanger extends User implements userType{
    String ride = "ride details";
    Passanger(String user, long phoneNumber) {
        super(user, phoneNumber);
    }
    public String getRide() {
        return ride;
    }
    @Override
    public String getUserType() {
        return "passanger";
    }
    public static void main(String[] args) {
        Passanger passanger = new Passanger("passanger1", 1234567890);
        String o = passanger.getRide();
        String p = passanger.getUser();
        long n = passanger.getphoneNumber();
        System.out.println(p);
        System.out.println(n);
        System.out.println(o);

    }


}
