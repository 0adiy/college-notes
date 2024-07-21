package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainJApp extends JFrame implements ActionListener {
  JLabel mainAppLabel = new JLabel("Name");
  JButton clickMe = new JButton("Click Me");
  JPanel mainAppPanel = new JPanel();

  JDialog dialogBox = new JDialog(this, "Hello");
  JLabel dialogBoxText = new JLabel("Hello");
  JPanel dialogAppPanel = new JPanel();

  MainJApp(String name) {
    super(name);
    mainAppLabel.setForeground(Color.white);
    clickMe.setForeground(Color.white);
    clickMe.setBackground(new Color(0x3e3e3e));
    clickMe.addActionListener(this);
    mainAppPanel.add(mainAppLabel);
    mainAppPanel.add(clickMe);

    mainAppPanel.setBackground(new Color(0x222222));

    dialogBoxText.setForeground(Color.white);
    dialogAppPanel.setBackground(Color.black);
    dialogBox.setSize(200, 100);
    dialogAppPanel.add(dialogBoxText);
    dialogBox.add(dialogAppPanel);

    this.add(mainAppPanel);
    this.setSize(500, 250);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    dialogBox.setVisible(true);
  }
}

public class SimpleJUI {
  public static void main(String[] args) {
    new MainJApp("Title of frame");
  }
}
