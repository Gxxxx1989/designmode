package proxy;
/**
 * 被代理类
 * 实际干活的类（也就是被代理的类）
 * @author guoxi_789@126.com
 * @date 2020/11/18
 */
public class WorkClass implements ProxyClass{
    @Override
    public void doSomeThing() {
        System.out.println("我是被代理类");
    }
}
