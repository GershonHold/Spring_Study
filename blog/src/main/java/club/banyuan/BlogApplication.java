package club.banyuan;

import club.banyuan.bean.Blog;
import club.banyuan.bean.User;
import club.banyuan.dao.BlogDao;
import club.banyuan.dao.UserDao;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
@MapperScan("club.banyuan.dao")
public class BlogApplication {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(BlogApplication.class);
        ConfigurableApplicationContext context = SpringApplication.run(BlogApplication.class, args);

        UserDao userDao = context.getBean(UserDao.class);
        User user1 = userDao.selectUserByName("张三");
        logger.info("{}", user1);

        BlogDao blogDao = context.getBean(BlogDao.class);
        List<Blog> blogs = blogDao.selectBlogByUserName("张三");
        logger.info("{}", blogs);

//        UserDao userDao1=context.getBean(UserDao.class);
//        userDao1.insertUser("赵六","666","666@163.com");

        BlogDao blogDao1 = context.getBean(BlogDao.class);
        blogDao1.writeBlog("Spring","This is content about spring.","1");


    }
}
