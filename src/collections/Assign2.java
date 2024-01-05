package collections;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Assign2 {
    String searchByState(HashMap<String,List<String>> locations, String st){
        if (st.isEmpty()){
            System.out.println("Input string is empty");
        } else {
            for (HashMap.Entry<String, List<String>> entry : locations.entrySet()) {
//                System.out.println(entry);
                String country = entry.getKey();
                List<String> cities = entry.getValue();
                if (cities.contains(st)){
                    return country;
                } else if (country.equals(st)) {
                    return cities.toString();
                }
            }
        }
        return "City not found";
    }
    public static void main(String[] args) {
        HashMap<String,List<String>> locations = new HashMap<>();
        Assign2 assign2 = new Assign2();
        locations.put("UK",List.of("London","Manchester"));
        locations.put("IN",List.of("Karnataka", "Telagana", "Andhra"));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the city/Country ccode to be searched ");
        String str = input.nextLine();
        System.out.println(assign2.searchByState(locations,str));
    }
}
