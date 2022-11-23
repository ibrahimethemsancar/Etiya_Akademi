public class UserManager {
    private IUserDal userDal;

    public UserManager(IUserDal userDal){
    this.userDal = userDal;
    }

    public void add(User user){
        this.userDal.addUser(user);
    }
    public void delete(int id){
        userDal.deleteUser(id);
    };
}
