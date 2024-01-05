package User;

public class User {
    private String user;
    private long phoneNumber;
    User(String user, long phoneNumber)
    {
        this.user = user;
        this.phoneNumber = phoneNumber;
    }
    public String getUser(){
        return user;
    }
    public long getphoneNumber(){
        return phoneNumber;
    }

}
