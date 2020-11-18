package strategy;

import strategy.impl.A;

/**
 *
 *
 * @author guoxi_789@126.com
 * @date 2020/11/18
 */
public class Main {
    public static void main(String[] args) {
        Context context=new Context(new A());
        context.operate();
    }
}
