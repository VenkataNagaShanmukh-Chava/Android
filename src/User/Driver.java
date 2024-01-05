package User;

public class Driver extends User implements userType{

    int rating = 5;
    Driver(String user, long phoneNumber) {
        super(user, phoneNumber);
    }

    public int getRating() {
        return rating;
    }
    @Override
    public String getUserType() {
        return "Driver";
    }
//
//    @Override
//    public String getUserHistory(String n) {
//        if (n.equals("Driver")){
//            return "Driver previous rides";
//        }
//        else {
//            return "Passanger history";
//        }
//    }

    public static void main(String[] args) {
        Driver driver = new Driver("Driver1", 1234567891);

    }


}
