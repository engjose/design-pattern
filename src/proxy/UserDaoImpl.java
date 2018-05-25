package proxy;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 上午11:47 2018/5/25
 * @Description:
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void sayHello(String userName) {
        System.out.println(userName + ":" + "你好");
    }
}
