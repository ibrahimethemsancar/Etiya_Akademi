public class MsSqlUserDal implements IUserDal{

    @Override
    public void getUser(User user) {
        System.out.println(user);
    }

    @Override
    public void addUser(User user) {
        System.out.println("User has  " + user.id + " id" + " is added to  MsSql." );
    }

    @Override
    public void deleteUser(int id) {
        System.out.println("User has  " + id + " id" + " is deleted from MsSql." );
    }

    @Override
    public void updateUser(int id) {
        System.out.println("User has  " + id + " id" + " is update in MsSql." );
    }
}
