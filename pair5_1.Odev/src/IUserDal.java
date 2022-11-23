public interface IUserDal {
    void getUser(User user);
    void addUser(User user);
    void deleteUser(int id);
    void updateUser(int id);
}
