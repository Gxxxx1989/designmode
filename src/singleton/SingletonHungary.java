package singleton;

/**
 * 单例模式之饿汉式
 *
 * @author guoxi_789@126.com
 * @date 2020/11/18
 */
public class SingletonHungary {
    private static SingletonHungary singletonHungary = new SingletonHungary();

    private SingletonHungary() {
    }

    public static SingletonHungary getInstance() {
        return singletonHungary;
    }
}
