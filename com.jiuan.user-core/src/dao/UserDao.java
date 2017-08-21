import user.User;

public interface UserDao{

public void save(User user);
public User loadByNumber(Integer num);
public void delete(Integer id); 
}
