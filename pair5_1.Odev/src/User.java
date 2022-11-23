public class User {
    int id;
    String name;
    String lastName;
    int userRole;
    String mail;

    public User(){

    }
    public User(int id, String name, String lastName, int userRole, String mail){
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.userRole = userRole;
    this.mail = mail;
    }
}
