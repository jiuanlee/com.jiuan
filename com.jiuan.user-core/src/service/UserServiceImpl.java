package service;

import dao.UserDao;
import dao.UserDaoImpl;
import pojo.User;

public class UserServiceImpl implements UserService {

  @Override
  public void save(User user) {
    getUserDao().save(user);

  }

  @Override
  public User getByNumber(Integer num) {

    return getUserDao().loadByNumber(num);
  }

  @Override
  public void delete(Integer num) {
    getUserDao().delete(num);
  }

  private UserDao getUserDao() {

    return new UserDaoImpl();

  }
}
