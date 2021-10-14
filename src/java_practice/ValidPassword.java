package java_practice;


    public class ValidPassword {

        public static void main(String[] args) {
            String password = "Poopsie!33";
            System.out.println(checkPassword(password));
        }


        public static boolean valPassword(String password) {  // <-- this variable local for this method

            if(password.length() > 6 && !password.contains(" ")){

                if(checkPassword(password)){ // this from the boolean method we made on bottom connect them with nested if statement
                    return true;
                }else{
                    return false;
                }


            }
            else{
                System.out.println("Password needs to be at least 6 characters and cannot contain empty space");
                return false;
            }



        }

        public static boolean checkPassword(String password){  // And this variable local for this method
            boolean hasUpper = false; boolean hasLower = false; boolean hasSpecial = false; boolean hasDigit = false; char c; // this line I just declared boolean values from validation requirement
            // giving char method instead of int or double cause there's some helpful methods with and keeps organized our codes
            for(int i = 0; i < password.length(); i++){ // setting up loop to go every single characters in our password
                c = password.charAt(i); // Reassign c every single character in the loop
                if(Character.isDigit(c)){

                    hasDigit = true;


                }else if(Character.isUpperCase(c)) {
                    hasUpper = true;
//"!, @, #, $, %, ^, &, *, ( , ) , _ , - ,=,+
                }else if(Character.isLowerCase(c)){
                    hasLower = true;
                }
                else if(password.contains("$") || password.contains("!") || password.contains("@") || password.contains("+") || password.contains("#")){

                    hasSpecial = true;
                }

                if(hasDigit && hasLower && hasUpper && hasSpecial){ // different if statement checks if all the booleans true or not

                    return true;

                }

            }
            return false; // this return false if any of the iteration is false

        }




    }





