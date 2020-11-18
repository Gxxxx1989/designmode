package proxy;

/**
 * 代理类 可以代理所有实现接口的类去实现
 * VisualWorkClass 虚拟干活的类，虽然由某些方法，但是不能使用， 实际由其他类代理他干活
 * 当前类虽然具有接口的方法 但是不能实现 要靠能实际干活的类去实现 也就是WorkClass
 *
 * @author guoxi_789@126.com
 * @date 2020/11/18
 */
public class VisualWorkClass implements ProxyClass {
    ProxyClass proxyClass;

    public VisualWorkClass(){
        this.proxyClass=new WorkClass();
    }

    public VisualWorkClass(ProxyClass proxyClass) {
        this.proxyClass = proxyClass;
    }

    @Override
    public void doSomeThing() {
        proxyClass.doSomeThing();
    }
}
