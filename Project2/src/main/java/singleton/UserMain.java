package singleton;

public class UserMain {
    public static void main(String[] args) {
       // User user=new User(); //error
        User user=User.getUser();
        user.setUserId(1001);
        user.setUserName("pavan");

        User user1=User.getUser();
        System.out.println(user);
        System.out.println(user1);

    }
}
