package objects;

public class FacebookUser {


    String username;
    String password;
    String firstName;
    String lastName;            // in class String username does go in login method

    public void login(String username, String password){
        System.out.println(username + " logged in to the application");
    }

    public static void main(String[] args) {
        FacebookUser user = new FacebookUser();        // new facebookUser is an object
        user.login("Tima","2270");
        System.out.println(""+user);
        user.username = "tokyo";
        user.password = "perkin123";

    }


}
