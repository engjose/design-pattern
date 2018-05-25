package proxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 上午11:48 2018/5/25
 * @Description:
 */
public class UserProxy {

    /** 被代理的对象 */
    private UserDao userDao;

    public UserProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 创建UserDao的代理对象
     *
     * @return
     */
    public UserDao createUserDao() {
        ClassLoader classLoader = userDao.getClass().getClassLoader();
        Class<?>[] interfaces = userDao.getClass().getInterfaces();
        return(UserDao) Proxy.newProxyInstance(classLoader, interfaces, (Object proxy, Method method, Object[] args) ->{
            System.out.println("before....");
            Object invoke = method.invoke(userDao, args);
            System.out.println("after....");
            return invoke;
        });
    }
}
