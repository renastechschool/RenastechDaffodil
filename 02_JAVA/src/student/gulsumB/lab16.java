package student.gulsumB;
//1. Write a return method that can verify if a password is valid or not.
//requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns  false
public class lab16 {
    public static void main(String[] args) {
        System.out.println(password("Guls@um27"));
        System.out.println(password("Hello?6"));
        System.out.println(password("hello12"));
    }
        public static boolean password(String pass){
            boolean b1=false;
            boolean b2=false;
            boolean b3=false;
            boolean b4=false;

            if(pass.length()>=6&&!pass.contains(" ")){
                for (int i = 0; i < pass.length(); i++) {
                    if(pass.charAt(i)>=65&&pass.charAt(i)<=95){
                        b1=true;
                    }
                    if(pass.charAt(i)>=97&&pass.charAt(i)<=122){
                        b2=true;
                    }
                    if((pass.charAt(i)>=33&&pass.charAt(i)<=47)||(pass.charAt(i)>=58&&pass.charAt(i)<=64)||(pass.charAt(i)>=91&&pass.charAt(i)<=96)||(pass.charAt(i)>=123&&pass.charAt(i)<=126)){
                        b3=true;
                    }
                    if (pass.charAt(i)>=48&&pass.charAt(i)<=57){
                        b4=true;
                    }
                }
            }else {
                return false;
            }
            return b1&&b2&&b3&&b4;


        }


    }

