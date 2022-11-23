public class Main {
    public static void main(String[] args) {
        User user = new User(1,"İbrahim", "Sancar", 1,"iesancar@gmail.com" );
        UserManager userManager = new UserManager(new MySqlUserDal() );
        userManager.add(user);
        userManager.delete(user.id);
    }
}