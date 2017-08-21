package service;

import pojo.User;

public interface UserService {
  public void save(User user);

  public User getByNumber(Integer num);

  public void delete(Integer num);
}
