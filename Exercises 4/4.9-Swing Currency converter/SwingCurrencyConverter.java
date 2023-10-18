import javax.swing.*;
import java.awt.*;

public class SwingCurrencyConverter {
  private JTextField SGDTextField;
  private JTextField USDTextField;
  private JTextField EurosTextField;

  public SwingAccumulator() {
    JFrame frame = new JFrame("Currency Converter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(250, 100);
    frame.setLayout(new GridLayout(3, 2));

    JLabel label1 = new JLabel("Singapore Dollars", SwingConstants.LEFT);
    frame.add(label1);

    SGDTextField = new JTextField();
    frame.add(SGDTextField);

    JLabel label2 = new JLabel("US Dollars", SwingConstants.LEFT);
    frame.add(label2);

    USDTextField = new JTextField();
    frame.add(USDTextField);

    JLabel label3 = new JLabel("Euros", SwingConstants.LEFT);
    frame.add(label3);

    EurosTextField = new JTextField();
    frame.add(EurosTextField);

    SGDTextField.addActionListener(event -> {
      try{
        Float temp = Float.valueOf(SGDTextField.getText().trim());
        USDTextField.setText(String.format("%.2f",temp/(float)1.41));
        EurosTextField.setText(String.format("%.2f",temp*(float)0.65));
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(frame, "Please enter a valid integer.");
        SGDTextField.setText("");
      }
    });

    USDTextField.addActionListener(event -> {
      try{
        Float temp = Float.valueOf(USDTextField.getText().trim());
        SGDTextField.setText(String.format("%.2f",(temp*(float)1.41)));
        EurosTextField.setText(String.format("%.2f",temp*(float)0.92));
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(frame, "Please enter a valid integer.");
        USDTextField.setText("");
      }
    });

    EurosTextField.addActionListener(event -> {
      try{
        Float temp = Float.valueOf(EurosTextField.getText().trim());
        SGDTextField.setText(String.format("%.2f",temp/(float)0.65));
        USDTextField.setText(String.format("%.2f",temp/(float)0.92));
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(frame, "Please enter a valid integer.");
        EurosTextField.setText("");
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
