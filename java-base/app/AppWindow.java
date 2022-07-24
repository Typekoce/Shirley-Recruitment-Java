import javax.swing.*;
import java.awt.*;
import java.awt.image.*;


public class AppWindow extends JFrame{

  public AppPrint print = new AppPrint();

  public AppData data = new AppData();

  public Container contents = getContentPane();

  AppWindow(){

    contents.setLayout(new FlowLayout(2,0,0));

  }

  public void render(){

    setDefaultCloseOperation(EXIT_ON_CLOSE);

    setVisible(true);

    pack();

  }


}
