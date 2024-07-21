package UI;

import java.awt.*;

class MainApp extends Frame {
  Label name = new Label("Name");
  Button clickMe = new Button("Click Me");
  Panel p = new Panel();

  MainApp() {
    name.setForeground(Color.white);
    clickMe.setForeground(Color.white);
    clickMe.setBackground(new Color(0x3e3e3e));
    p.add(name);
    p.add(clickMe);

    p.setBackground(new Color(0x222222));

    this.add(p);
    this.setSize(500, 500);
    this.setVisible(true);
  }
}

public class SimpleUI {
  public static void main(String[] args) {
    new MainApp();
  }
}
