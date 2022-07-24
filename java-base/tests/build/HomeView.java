import javax.swing.*;
import java.awt.*;
import java.awt.image.*;


public class HomeView extends AppView{

  public int width = 800;

  public int height = 600;

  HomeView(AppData data){

    this.data = data;

    this.setTitle(data.getData("title"));

    this.setSize(new Dimension(this.width, this.height));

    this.block(BorderLayout.WEST,11,1);

    this.center();

    this.render();

  }

  public void center(){

    JPanel center = new JPanel();

    center.setLayout(new FlowLayout(1,0,0));

    Icon icon = new ImageIcon(data.getData("product-image"));

    JButton but = new JButton(icon);

    but.setPreferredSize(new Dimension(791,767));

    but.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));

    but.setContentAreaFilled(false);
    
    center.add(but);

    contents.add(center);

  }

  public void block(String align,int rows, int cols){

    JPanel panel = new JPanel(new GridLayout(rows,cols));

    this.textfields(panel);

    contents.add(panel, align);

  }

  public void textfields(JPanel panel){

    String[] msg = data.readDataArray("sidebar");

    for (int i = 0; i < msg.length; i++) {

      String txt = msg[i];

      this.buttons(panel,txt);

    }

  }

}
