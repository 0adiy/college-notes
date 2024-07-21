package UI;

import javax.swing.*;
import java.awt.event.*;

class fx extends JFrame implements ActionListener {
  JButton addButton = new JButton("Add");
  JTextField jtf = new JTextField(20);
  JLabel jl = new JLabel("Add stuff :");
  JPanel jp = new JPanel();
  DefaultListModel<String> l1 = new DefaultListModel<>();
  JList<String> jlis = new JList<>(l1);

  fx() {
    addButton.addActionListener(this);
    jp.add(addButton);
    jp.add(jl);
    jp.add(jtf);
    jp.add(jlis);

    this.add(jp);

    this.setSize(300, 300);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String txt = jtf.getText();
    l1.addElement(txt);
    jtf.setText("");
  }

}

public class TextFieldtoList {
  public static void main(String[] args) {
    new fx();
  }
}
