package builder;

public class UserMain {


    public static void main(String[] args) {
        User user = User.UserBuilder.UserBuilder()
                        .name("혜성")
                        .password("1234")
                        .username("lhs")
                        .build();
        System.out.println(user);

    }
}
