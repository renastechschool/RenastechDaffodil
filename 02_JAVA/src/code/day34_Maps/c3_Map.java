package code.day34_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class c3_Map {

    public static void main(String[] args) {
        LinkedHashMap<String,String>gmailCredentials=new LinkedHashMap<>();
        gmailCredentials.put("user1","pass1");
        gmailCredentials.put("user2","pass2");
        gmailCredentials.put("user3","pass3");
        gmailCredentials.put("user4","pass4");
        gmailCredentials.put("user5","pass4");
        gmailCredentials.put("user6","pass4");
        gmailCredentials.put("user7","pass4");
        gmailCredentials.put("user1","pass4");
        //key has to be unique
        //it will reassign the value for user1

        System.out.println(gmailCredentials);
        //keyset will retyrn all key from the map
        for (String eachKey : gmailCredentials.keySet()){
            System.out.println("eachKey = " + eachKey);
        }

        //    //    values(): returns all the values from the map as Collection
        for (String eachValue : gmailCredentials.values()){
            System.out.println("eachValue = " + eachValue);
        }

        //I want to store usernames in arraylist
        ArrayList<String> userNames=new ArrayList<>(gmailCredentials.keySet());
        ArrayList<String> passwords=new ArrayList<>(gmailCredentials.values());

        System.out.println("userNames = " + userNames);
        System.out.println("passwords = " + passwords);
    }
}
