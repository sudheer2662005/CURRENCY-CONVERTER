import javax.swing.*;

public class CurrencyConverter {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Currency Converter");

        // Create components
        JLabel label = new JLabel("Enter amount in USD:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Convert to INR");
        JLabel resultLabel = new JLabel(" ");

        // Button click event
        button.addActionListener(e -> {
            try {
                double usd = Double.parseDouble(textField.getText());
                double inr = usd * 89.86; // 1 USD = 83.3 INR (example rate)
                resultLabel.setText(String.format("Amount in INR: %.2f", inr));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter a valid number.");
            }
        });

        // Create panel and add components
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(resultLabel);

        // Add panel to frame
        frame.add(panel);

        // Frame settings
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
