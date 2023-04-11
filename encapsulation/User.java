package encapsulation;

import java.util.ArrayList;
import java.util.HashMap;

public class User {

    private String username;
    private  String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username.length() >= 3 ){
            if (!users.contains(username)){
                System.out.println("Available!");
                this.username = username;
            }
            else {
                System.out.println("Error. The username is already in use");
            }
        }
        else {
            System.out.println("Length must be more than 3");
        }

    }












    public String getPassword() {
        return password;
    }

    public void setPassword1(String password) {
        String passwordUp = password.toUpperCase();
        String passLower = password.toLowerCase();

        if (password.length() >= 8){
            if (password.contains(passwordUp)){
                if (password.contains(passLower)){
                    if (Character.isDigit(password.charAt(Integer.parseInt(password)))){
                        if (Character.isLetter(password.charAt(Integer.parseInt(password)))){
                            if (!Character.isLetter(password.charAt(Integer.parseInt(password))) && !Character.isDigit(password.charAt(Integer.parseInt(password)))){
                                System.out.println("It is availabe and it was set");
                                this.password = password;
                            }
                            else{
                                System.out.println("Password must contain at least one special char");

                            }
                        }
                        else {
                            System.out.println("Password must contain at least one letter");

                        }
                    }
                    else {
                        System.out.println("Password must contain at least one digit");

                    }
                }
                else {
                    System.out.println("Password must contain at least one lowerCase letter");

                }
            }
            else {
                System.out.println("Password must contain at least one upperCase letter");
            }
        }
        else {
            System.out.println("Password length must be more than 8");
        }
    }

















    private static ArrayList<String> users = new ArrayList<>();
    private static HashMap<String, String> usersPasswords = new HashMap<>();

    {
        users.add("bena");
        users.add("max");
        users.add("sunflower123");
        users.add("elturan");
    }

    /*
    CREATE SETTERS FOR username, password
    username:
    check this username is available
    the length must be at least 3 chars


    password:
    length >= 8
    one uppercase
    one lowercase
    one digit
    one letter
    one special character
     */

    //
    public void setPassword(String password) {
        if (password.length() >= 8 && password.length() < 32) {

            boolean isDigit = false, isUpperCase = false, isLowerCase = false,
                    isSpecialChar = false;

            for (int i = 0; i < password.length(); i++) {

                if (Character.isDigit(password.charAt(i))) {
                    isDigit = true;
                } else if (Character.isUpperCase(password.charAt(i))) {
                    isUpperCase = true;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    isLowerCase = true;
                } else if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
                    isSpecialChar = true;
                }
            }


            if (isDigit && isLowerCase && isUpperCase && isSpecialChar) {
                this.password = password;
                usersPasswords.put(username, password);
            } else {
                System.out.println("The password must contain one Upper Case, one Lower Case, one Special Character," +
                        "one number");
            }
        } else {
            System.out.println("Password's length must be at least 8");
        }

    }


    public void setUsersPasswords(String password){
        if (isValidPassword(password)){
            this.password = password;
            System.out.println("Password set successfully.");
        }
        else {
            System.out.println("Invalid password. Please try again.");
        }
    }

    private boolean isValidPassword(String password) {
        //Check password length
        if (password.length() < 8){
            System.out.println("Password must be at least 8 characters long.");
            return false;
        }

        // Check if password contains at least one uppercase, lowercase, and digit
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)){
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        if (!hasLowercase){
            System.out.println("Password must contain at least one lowercase letter.");
            return false;
        }
        if (!hasUppercase){
            System.out.println("Password must contain at least one upper letter.");
            return false;
        }
        if (!hasDigit){
            System.out.println("Password must contain at least one digit.");
            return false;
        }


        // Check if password contains at least one special character

        if (password.matches("[a-zA-Z0-9]")){
            System.out.println("Password must contain at least one special character.");
            return false;
        }


        // All checks passed
        return true;
    }












    public String getPassword(String username){
        return usersPasswords.get(username);
    }

   // private static ArrayList<String> users = new ArrayList<>();

    /*
    username:
    check this username is available
    the length must be at least 3 chars



    password:
    length >= 8
    one uppercase
    one lowercase
    one digit
    one letter
    one special character
     */


    public static void main(String[] args) {
        User user = new User();
        user.setUsersPasswords("Tilla@270");
        user.setUsersPasswords("Tilla270");
        user.setUsersPasswords("il27jfsd0");
        System.out.println(user.getPassword());
        user.setUsername("Temirbek");
        System.out.println(user.getUsername());
    }
}
