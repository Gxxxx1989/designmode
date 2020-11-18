package singleton;

/**
 * 单例模式之懒汉式(有线程安全问题)
 *
 * @author guoxi_789@126.com
 * @date 2020/11/18
 */
public class SingletonLazy {
    private static SingletonLazy singletonLazy = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
