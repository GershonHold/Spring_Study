package club.banyuan.service;

import club.banyuan.bean.User;
import club.banyuan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    User getUserByName(String username) {
        return userDao.selectUserByName(username);
    }

    String insertUser(String username, String password, String email) {
        return "成功插入数据";
    }

}
