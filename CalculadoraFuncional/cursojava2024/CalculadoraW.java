package cursojava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraW extends JFrame implements ActionListener {

    private JTextField display;
    private StringBuilder currentInput;
    private double num1 = 0, num2 = 0;
    private String operator = "";

    // Constructor to set up the calculator
    public CalculadoraW() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Setting up the display
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Setting up the button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        // Button labels
        String[] buttons = {
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "3", "2", "1", "-", 
            "0", ".", "=", "+", 
            "C"
        };
        
        // Creating buttons and adding them to the panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        add(buttonPanel, BorderLayout.CENTER);

        // Initialize current input
        currentInput = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Clear display logic
        if (command.equals("C")) {
            resetCalculator();
            return;
        }

        // Logic for operators
        if ("/+-*".contains(command)) {
            if (currentInput.length() > 0) {
                try {
                    num1 = Double.parseDouble(currentInput.toString());
                    operator = command;
                    currentInput.setLength(0); // Clear input for next number
                } catch (NumberFormatException ex) {
                    display.setText("Erro: entrada inválida!");
                }
            }
            return;
        }

        // Logic for "=" (result)
        if (command.equals("=")) {
            if (currentInput.length() > 0) {
                try {
                    num2 = Double.parseDouble(currentInput.toString());
                    double result = calcular(num1, num2, operator);
                    display.setText(String.valueOf(result));
                } catch (ArithmeticException ex) {
                    display.setText("Erro: " + ex.getMessage());
                }
                currentInput.setLength(0); // Clear for new operation
            }
            return;
        }

        // Adding digits to the current input
        currentInput.append(command);
        display.setText(currentInput.toString());
    }

    // Method for performing calculations
    private double calcular(double num1, double num2, String operator) throws ArithmeticException {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Divisão por zero não é possível");
                }
                return num1 / num2;
            default:
                return 0;
        }
    }

    // Method to reset the calculator
    private void resetCalculator() {
        currentInput.setLength(0);
        display.setText("");
        num1 = num2 = 0;
        operator = "";
    }

    // Main method to run the calculator
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraW calc = new CalculadoraW();
            calc.setVisible(true);
        });
    }
}