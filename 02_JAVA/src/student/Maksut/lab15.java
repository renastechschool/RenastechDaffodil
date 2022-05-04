package student.Maksut;
public class lab15 {
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    //sort the individual string and append them back together
    //Ex:
    //Input:  "DC501GCCCA098911"
    //OutPut: "CD015ACCCG011899"
    public static void main(String[] args) {
        String str = "DC501GCCCA098911";
        alphanumeric(str);
        String str2 = "DCY5701GMCA3981";
        alphanumeric(str2);
    }

    public static void alphanumeric(String str) {
//        48-57 0-9
//        65-90 A-Z
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 57) {
                count1++;
            } else {
                break;
            }
        }

        for (int i = count1; i < str.length(); i++) {
            if (str.charAt(i) <= 57) {
                count2++;
            } else {
                break;
            }
        }

        for (int i = count1 + count2; i < str.length(); i++) {
            if (str.charAt(i) > 57) {
                count3++;
            } else {
                break;
            }
        }

        for (int i = count1 + count2 + count3; i < str.length(); i++) {
            if (str.charAt(i) <= 57) {
                count4++;
            } else {
                break;
            }
        }

        char[] sub1 = new char[count1];
        char[] sub2 = new char[count2];
        char[] sub3 = new char[count3];
        char[] sub4 = new char[count4];

        char[] total = new char[str.length()];

        {
            for (int i = 0; i < count1; i++) {
                sub1[i] = str.charAt(i);
            }

            for (int i = 0; i < count1; i++) {
                int min = 0;
                for (int j = 0; j < count1; j++) {
                    if (sub1[i] < sub1[j]) {
                        min = sub1[i];
                        sub1[i] = sub1[j];
                        sub1[j] = (char) min;

                    }
                }
            }
        }

        {
            for (int i = 0; i < count2; i++) {
                sub2[i] = str.charAt(i + count1);
            }

            for (int i = 0; i < count2; i++) {
                int min = 0;
                for (int j = 0; j < count2; j++) {
                    if (sub2[i] < sub2[j]) {
                        min = sub2[i];
                        sub2[i] = sub2[j];
                        sub2[j] = (char) min;
                    }
                }
            }
        }

        {
            for (int i = 0; i < count3; i++) {
                sub3[i] = str.charAt(i + count1 + count2);
            }
            for (int i = 0; i < count3; i++) {
                int min = 0;
                for (int j = 0; j < count3; j++) {
                    if (sub3[i] < sub3[j]) {
                        min = sub3[i];
                        sub3[i] = sub3[j];
                        sub3[j] = (char) min;
                    }
                }
            }
        }

        {
            for (int i = 0; i < count4; i++) {
                sub4[i] = str.charAt(i + count1 + count2 + count3);
            }
            for (int i = 0; i < count4; i++) {
                int min = 0;
                for (int j = 0; j < count4; j++) {
                    if (sub4[i] < sub4[j]) {
                        min = sub4[i];
                        sub4[i] = sub4[j];
                        sub4[j] = (char) min;
                    }
                }
            }
        }
        System.out.println(String.valueOf(sub1) + String.valueOf(sub2) + String.valueOf(sub3) + String.valueOf(sub4));
    }
}


