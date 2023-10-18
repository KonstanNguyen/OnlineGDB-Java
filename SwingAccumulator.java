import javax.swing.*;
import java.awt.*;

public class SwingAccumulator {
  private int accumulatedSum = 0;
  private JTextField inputTextField;
  private JTextField sumTextField;

  public SwingAccumulator() {
    JFrame frame = new JFrame("Swing Accumulator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 150);
    frame.setLayout(new GridLayout(2, 2));

    JLabel label1 = new JLabel("Enter an integer and press enter", SwingConstants.LEFT);
    frame.add(label1);

    inputTextField = new JTextField(10);
    frame.add(inputTextField);

    JLabel label2 = new JLabel("The accumulated sum is");
    frame.add(label2);

    sumTextField = new JTextField(10);
    sumTextField.setEditable(false); // Make it read-only
    frame.add(sumTextField);

    inputTextField.addActionListener(event -> {
      try {
        int inputValue = Integer.parseInt(inputTextField.getText());
        accumulatedSum += inputValue;
        sumTextField.setText(Integer.toString(accumulatedSum));
        inputTextField.setText(""); // Clear the input field
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(frame, "Please enter a valid integer.");
        inputTextField.setText(""); // Clear the input field
      }
    });

    frame.setVisible(true);

  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new SwingAccumulator();
      }
    });
  }
}
