package strategy;
/**
 *
 * 策略的持有者
 * @author guoxi_789@126.com
 * @date 2020/11/18
 */
public class Context {
    private StrategyInterface  strategyInterface;
    /**
    * 功能描述 传入要使用的策略
    * @author guoxi_789@126.com
    * @date 2020/11/18
    * @param  
    * @return 
    */
    public Context(StrategyInterface strategyInterface){
        this.strategyInterface=strategyInterface;
    }
    /**
    * 功能描述 使用策略
    * @author guoxi_789@126.com
    * @date 2020/11/18
    * @param
    * @return
    */
    public void operate(){
        strategyInterface.operate();
    }
}
