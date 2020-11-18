package singleton;

/**
 * 单例模式之懒汉式(升级版 避免线程安全问题)
 *
 * @author guoxi_789@126.com
 * @date 2020/11/18
 */
public class SingletonLazyUpgrade {
    private static SingletonLazyUpgrade singletonLazy = null;

    private SingletonLazyUpgrade() {
    }

    public synchronized static SingletonLazyUpgrade getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazyUpgrade();
        }
        return singletonLazy;
    }
}
