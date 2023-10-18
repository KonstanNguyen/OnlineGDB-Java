import javax.swing.*;
import java.awt.*;

public class SwingArithmetics {
  private int Sum = 0;
  private JTextField firstNumber;
  private JTextField secondNumber;
  private JTextField sumTextField;

  public SwingAccumulator() {
    JFrame frame = new JFrame("Swing Arithmetics");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(250, 200);
    frame.setLayout(new GridLayout(6, 2));

    JLabel label1 = new JLabel("First Number", SwingConstants.LEFT);
    frame.add(label1);

    firstNumber = new JTextField();
    firstNumber.setHorizontalAlignment(SwingConstants.RIGHT);
    frame.add(firstNumber);

    JLabel label2 = new JLabel("Second Number", SwingConstants.LEFT);
    frame.add(label2);

    secondNumber = new JTextField();
    secondNumber.setHorizontalAlignment(SwingConstants.RIGHT);
    frame.add(secondNumber);

    JLabel label3 = new JLabel("Result", SwingConstants.LEFT);
    frame.add(label3);

    sumTextField = new JTextField();
    sumTextField.setHorizontalAlignment(SwingConstants.RIGHT);
    sumTextField.setEditable(false); // Make it read-only
    frame.add(sumTextField);

    JButton addButton = new JButton("+");
    frame.add(addButton);

    JButton minusButton = new JButton("-");
    frame.add(minusButton);

    JButton mutilpliButton = new JButton("*");
    frame.add(mutilpliButton);
    
    JButton divideButton = new JButton("/");
    frame.add(divideButton);
    
    JButton modButton = new JButton("%");
    frame.add(modButton);

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

    minusButton.addActionListener(event -> {
      try{
        Sum = Integer.valueOf(firstNumber.getText()) - Integer.valueOf(secondNumber.getText());
        sumTextField.setText(Integer.toString(Sum));
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(frame, "Please enter a valid integer.");
        firstNumber.setText("");
        secondNumber.setText("");
      }
      
    });

    mutilpliButton.addActionListener(event -> {
      try{
        Sum = Integer.valueOf(firstNumber.getText()) * Integer.valueOf(secondNumber.getText());
        sumTextField.setText(Integer.toString(Sum));
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(frame, "Please enter a valid integer.");
        firstNumber.setText("");
        secondNumber.setText("");
      }
      
    });

    divideButton.addActionListener(event -> {
      try{
        Sum = Integer.valueOf(firstNumber.getText()) / Integer.valueOf(secondNumber.getText());
        sumTextField.setText(Integer.toString(Sum));
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(frame, "Please enter a valid integer.");
        firstNumber.setText("");
        secondNumber.setText("");
      }catch(ArithmeticException e){
        JOptionPane.showMessageDialog(frame, "Divided by zero.");
        firstNumber.setText("");
        secondNumber.setText("");
      }
      
    });
    
    modButton.addActionListener(event -> {
      try{
        Sum = Integer.valueOf(firstNumber.getText()) % Integer.valueOf(secondNumber.getText());
        sumTextField.setText(Integer.toString(Sum));
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(frame, "Please enter a valid integer.");
        firstNumber.setText("");
        secondNumber.setText("");
      }catch(ArithmeticException e){
        JOptionPane.showMessageDialog(frame, "Mod by zero.");
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
