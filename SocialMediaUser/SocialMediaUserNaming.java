package SocialMediaUser;

public class SocialMediaUserNaming {
    String username;
    String password;
    String email;
    String firstName;
    String lastName;
    int age;









    public boolean setUsername(String username){
        boolean b = username != null && username.length() > 16 && username.trim().length() != 0;

        System.out.println("Success!");
        return b = false;
    }


    public void setPassword(String password){
        boolean isValidPassword = true;
        if (16 >= password.length() && password.length() >= 8) {

            String upperCaseRegex = "[A-Z]";
            String lowerCaseRegex = "[a-z]";

            String digitRegex = "d";
            String specialCharRegex = "[!@#%&*.~=+^]";

            if (!password.matches(upperCaseRegex) || !password.matches(lowerCaseRegex)
            || !password.matches(digitRegex) | !password.matches(specialCharRegex)) {
                isValidPassword = false;
            }
            else {
                System.out.println("ERROR: password must contain at least one Uppercase, lowercase, and special character.");
            }

        }
        else {
            System.out.println("ERROR: Password must be more than 8 and less than 16.");
        }
        System.out.println("Password successfully saved!");
    }


    public void setEmail(String email){
    }


    public void setFirstName(String firstName){
    }

    public void setLastName(String lastName){
    }

    public void setAge(int age){
    }










    public boolean login (String username, String password){
        if (!username.equals(this.username) || !password.equals(this.password) ){
            System.out.println("Username or Password is wrong. Try again.");
            return false;
        }
        System.out.println("Successfully logged in!");
        return true;

    }




    public String resetPassword (String password){
        String newPassword = password;
        return "The password has been reset";
    }





    public String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }






    public boolean isAdult (int age){
        if (age < 18){
            System.out.println("Not adult.");
            return false;
        }
        System.out.println("He is adult.");
        return true;
    }
}
