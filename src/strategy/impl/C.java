package strategy.impl;

import strategy.StrategyInterface;

/**
 * 策略的实现类
 *
 * @author guoxi_789@126.com
 * @date 2020/11/18
 */
public class C implements StrategyInterface {
    @Override
    public void operate() {
        System.out.println("C");
    }
}
