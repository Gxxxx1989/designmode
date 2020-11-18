import javax.swing.*;
import java.awt.*;


/**
 * @author guoxi_789@126.com
 * @date 2020/11/18
 */
public class AppOne extends JFrame {
    //定义坐标
    int x = 100;
    int y = 100;

    public AppOne() {
        setSize(700, 800);
        setTitle("Tank War");
        setVisible(true);
    }

    /**
     * 当前方法自动调用
     */
    @Override
    public void paint(Graphics graphics) {
        System.out.println("paint");
        graphics.fillRect(x, y, 100, 100);
        x += 10;
        y += 10;

    }
}
