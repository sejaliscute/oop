import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton;
    private JButton equalsButton, clearButton;
    private JPanel panel;

    private double firstNumber, secondNumber, result;
    private String operator;

    public Calculator() {
        setTitle("Basic Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 18));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        functionButtons = new JButton[6];
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        functionButtons[0] = addButton;
        functionButtons[1] = subtractButton;
        functionButtons[2] = multiplyButton;
        functionButtons[3] = divideButton;
        functionButtons[4] = equalsButton;
        functionButtons[5] = clearButton;

        for (int i = 0; i < 6; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(new Font("Arial", Font.BOLD, 16));
        }

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subtractButton);

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(multiplyButton);

        panel.add(numberButtons[0]);
        panel.add(clearButton);
        panel.add(divideButton);
        panel.add(equalsButton);

        setLayout(new BorderLayout());
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == addButton) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = "+";
            textField.setText("");
        }

        if (e.getSource() == subtractButton) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = "-";
            textField.setText("");
        }

        if (e.getSource() == multiplyButton) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = "*";
            textField.setText("");
        }

        if (e.getSource() == divideButton) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = "/";
            textField.setText("");
        }

        if (e.getSource() == equalsButton) {
            secondNumber = Double.parseDouble(textField.getText());

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                    } else {
                        JOptionPane.showMessageDialog(this, "Error: Division by zero is not allowed.");
                    }
                    break;
            }

            textField.setText(String.valueOf(result));
            firstNumber = result;
        }

        if (e.getSource() == clearButton) {
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculator();
            }
        });
    }
}
