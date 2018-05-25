package proxy;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 上午11:57 2018/5/25
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        UserProxy userProxy = new UserProxy(new UserDaoImpl());
        UserDao userDao = userProxy.createUserDao();
        userDao.sayHello("TOM");
    }
}
