package code.day34_Maps;

import java.util.LinkedHashMap;

public class c2_Map {

    public static void main(String[] args) {
        // //we will create a map that will has student name and examscore
        //key : Student Name   ; String
        //value : exam score   ; Integar

        //we want to keep insertion order
        LinkedHashMap<String,Integer> studentsScore=new LinkedHashMap<>();
        studentsScore.put("HK" ,87); // A
        studentsScore.put("G" , 55); //c
        studentsScore.put("AS" ,21);//D
        studentsScore.put("ACP" ,10);//F
        studentsScore.put("GB" ,95); //A
        studentsScore.put("EC" ,42);//C
        studentsScore.put("M" ,70); //B

        //Scores more then 85 will be A
        //Scores between 70 85 will be b
        //Scores between 40 70  will be c
        //Scores between 20 40   will be d
        //Scores between 0 20   will be f

        LinkedHashMap<String,Integer> scoreA=new LinkedHashMap<>();
        LinkedHashMap<String,Integer> scoreC=new LinkedHashMap<>();

        System.out.println("scoreA = " + scoreA);
        System.out.println("scoreC = " + scoreC);

        //    keySet(): returns all the keys from the map as Set

        for (String eachStudent : studentsScore.keySet()){
            int eachStudentScore = studentsScore.get(eachStudent);

            if (eachStudentScore >= 85){ //score A
                scoreA.put(eachStudent,eachStudentScore);
            }else if (eachStudentScore >=40 && eachStudentScore <70){
                scoreC.put(eachStudent,eachStudentScore);
            }

        }

        System.out.println("scoreA = " + scoreA);
        System.out.println("scoreC = " + scoreC);

    }
}
