package UI;

import javax.swing.*;
import java.awt.event.*;

class f extends JFrame implements ActionListener {
  JButton addButton = new JButton("Add");
  JTextField jtf = new JTextField(20);
  JLabel jl = new JLabel("Add stuff :");
  JPanel jp = new JPanel();
  JComboBox<String> jcb = new JComboBox<String>();

  f() {
    addButton.addActionListener(this);
    jp.add(addButton);
    jp.add(jl);
    jp.add(jtf);
    jp.add(jcb);

    this.add(jp);

    this.setSize(300, 300);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String txt = jtf.getText();
    jcb.addItem(txt);
  }

}

public class TextFieldtoChoice {
  public static void main(String[] args) {
    new f();
  }
}
