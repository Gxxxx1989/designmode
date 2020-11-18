package singleton;

/**
 * 单例模式之静态内部类
 *
 * @author guoxi_789@126.com
 * @date 2020/11/18
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}