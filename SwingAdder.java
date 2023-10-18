import javax.swing.*;
import java.awt.*;

public class SwingAdder {
  private int Sum = 0;
  private JTextField firstNumber;
  private JTextField secondNumber;
  private JTextField sumTextField;

  public SwingAccumulator() {
    JFrame frame = new JFrame("Swing Adder");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 150);
    frame.setLayout(new GridLayout(4, 2));

    JLabel label1 = new JLabel("First Number", SwingConstants.LEFT);
    frame.add(label1);

    firstNumber = new JTextField();
    frame.add(firstNumber);

    JLabel label2 = new JLabel("Second Number", SwingConstants.LEFT);
    frame.add(label2);

    secondNumber = new JTextField();
    frame.add(secondNumber);

    JLabel label3 = new JLabel("Result", SwingConstants.LEFT);
    frame.add(label3);

    sumTextField = new JTextField();
    sumTextField.setEditable(false); // Make it read-only
    frame.add(sumTextField);

    JButton addButton = new JButton("ADD");
    frame.add(addButton);

    JButton clearButton = new JButton("CLEAR");
    frame.add(clearButton);

    addButton.addActionListener(event -> {
      try{
        Sum = Integer.valueOf(firstNumber.getText()) + Integer.valueOf(secondNumber.getText());
        sumTextField.setText(Integer.toString(Sum));
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(frame, "Please enter a valid integer.");
        firstNumber.setText("");
        secondNumber.setText("");
      }
      
    });

    clearButton.addActionListener(event -> {
      firstNumber.setText("");
      secondNumber.setText("");
      sumTextField.setText("");
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
