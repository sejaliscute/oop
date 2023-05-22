import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adder extends JFrame implements ActionListener {
    private JTextField firstNumberTextField;
    private JTextField secondNumberTextField;
    private JTextField resultTextField;
    private JButton addButton;
    private JButton clearButton;

    public Adder() {
        setTitle("Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(4, 2));

        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberTextField = new JTextField();
        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberTextField = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        resultTextField = new JTextField();
        resultTextField.setEditable(false);

        addButton = new JButton("Add");
        addButton.addActionListener(this);
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        add(firstNumberLabel);
        add(firstNumberTextField);
        add(secondNumberLabel);
        add(secondNumberTextField);
        add(resultLabel);
        add(resultTextField);
        add(addButton);
        add(clearButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            try {
                double firstNumber = Double.parseDouble(firstNumberTextField.getText());
                double secondNumber = Double.parseDouble(secondNumberTextField.getText());
                double result = firstNumber + secondNumber;
                resultTextField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input! Please enter valid numbers.");
            }
        }

        if (e.getSource() == clearButton) {
            firstNumberTextField.setText("");
            secondNumberTextField.setText("");
            resultTextField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Adder();
            }
        });
    }
}

