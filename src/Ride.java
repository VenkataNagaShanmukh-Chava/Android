public class Ride {
    public void ridetype(String pickup, String destination){
        System.out.println("no car type specified");
    }
    public void ridetype(String pickup, String destination, String carType){
        System.out.println("car type specified");
    }

    public static void main(String[] args) {
        Ride r = new Ride();
        r.ridetype("lindell", "midtown");
        r.ridetype("lindell", "midtown", "XL");
    }
}
