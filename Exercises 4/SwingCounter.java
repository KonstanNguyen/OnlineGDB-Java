import java.awt.TextField;
import javax.swing.*;

public class SwingCounter {
  private int counter = 0;
  private JLabel counterLabel;

  public SwingCounter() {
    JFrame frame = new JFrame("AWT Counter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(320, 120);

    JPanel panel = new JPanel();
    frame.add(panel);

    counterLabel = new JLabel("Counter   ");
    panel.add(counterLabel);

    TextField textField = new TextField(String.valueOf(counter),10);
    panel.add(textField);

    JButton countButton = new JButton("Count");
    panel.add(countButton);

    countButton.addActionListener(event -> {
      ++counter;
      textField.setText(String.valueOf(counter));
    });

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new SwingCounter();
      }
    });
  }
}
