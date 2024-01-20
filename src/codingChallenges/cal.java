package codingChallenges;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class cal {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date of birth MM-DD-yyyy");
        String birthDate = input.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date date = dateFormat.parse(birthDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        Calendar cur = new GregorianCalendar();

        int age = cur.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);

        System.out.println(age);



    }


}
