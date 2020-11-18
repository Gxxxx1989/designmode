import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 入口
 *
 * @author guoxi_789@126.com
 * @date 2020/11/18
 */
public class App {
    public static void main(String[] args) {
        //创建窗口对象
        Frame frame=new Frame();
        //窗口大小
        frame.setSize(800,700);
        //是否可以改变窗口大小
        frame.setResizable(false);
        //标题
        frame.setTitle("Tank");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        //显示窗口
        frame.setVisible(true);
    }
}
