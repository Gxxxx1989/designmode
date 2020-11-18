package singleton;

/**
 * 单例模式之双重校验锁
 *
 * @author guoxi_789@126.com
 * @date 2020/11/18
 */
public class DoubleCheckLock {
    private static DoubleCheckLock doubleCheckLock = null;

    private DoubleCheckLock() {
    }

    public static DoubleCheckLock getInstance() {
        Object o = new Object();
        if (doubleCheckLock == null) {
            synchronized (o) {
                if (doubleCheckLock == null) {
                    doubleCheckLock = new DoubleCheckLock();
                }
            }
        }

        return doubleCheckLock;

    }
}
