import javax.swing.*;
import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.*;


public class AppView extends AppWindow {

  public AppPrint print = new AppPrint();

  public AppData data = new AppData();

  public void buttons(JPanel panel,String txt){

    Icon icon = new ImageIcon(data.getDataProperties(txt,"icon"));

    Icon rollover = new ImageIcon(data.getDataProperties(txt,"rollover"));

    int imgWidth = data.getDataPropertiesNumber(txt,"imgWidth");

    int imgHeight = data.getDataPropertiesNumber(txt,"imgHeight");

    JButton but = new JButton(icon);

    but.setText(txt);

    but.setHorizontalTextPosition(JButton.CENTER);

    but.setPreferredSize(new Dimension(imgWidth,imgHeight));

    but.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));

    but.setContentAreaFilled(false);

    but.setRolloverIcon(rollover);

    but.setForeground(Color.white);

    but.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            //AppRoutes cont = new AppRoutes(txt);

            AppRoutes cont = new AppRoutes();

            cont.data.setData("foo","bar");

            cont.run(txt);



            dispose();
        }
    });

    panel.add(but);

  }

}
