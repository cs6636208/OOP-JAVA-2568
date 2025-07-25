import javax.swing.JOptionPane;

public class Test {
        public static void main(String[] args) {
                String annualInterestRateString = JOptionPane.showInputDialog(
                                null,
                                "Enter yearly interest rate, for example 8.25:",
                                "Loan Calculator",
                                JOptionPane.QUESTION_MESSAGE);
                double annualInterestRate = Double.parseDouble(annualInterestRateString);
                double monthlyInterestRate = annualInterestRate / 1200;

                String numberOfYearsString = JOptionPane.showInputDialog(
                                null,
                                "Enter number of years as an integer, for example 5:",
                                "Loan Calculator",
                                JOptionPane.QUESTION_MESSAGE);
                int numberOfYears = Integer.parseInt(numberOfYearsString);

                String loanAmountString = JOptionPane.showInputDialog(
                                null,
                                "Enter loan amount, for example 120000.95:",
                                "Loan Calculator",
                                JOptionPane.QUESTION_MESSAGE);
                double loanAmount = Double.parseDouble(loanAmountString);

                double monthlyPayment = loanAmount * monthlyInterestRate /
                                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
                double totalPayment = monthlyPayment * numberOfYears * 12;

                monthlyPayment = (int) (monthlyPayment * 100) / 100.0;
                totalPayment = (int) (totalPayment * 100) / 100.0;

                String output = "The monthly payment is " + monthlyPayment +
                                "\nThe total payment is " + totalPayment;
                JOptionPane.showMessageDialog(null, output, "Loan Result", JOptionPane.INFORMATION_MESSAGE);
        }
}
