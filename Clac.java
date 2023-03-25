import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Clac extends JFrame implements ActionListener {
    public static void main(String[] args) {

        // Main Frame Setting
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(314, 539));
        frame.setLocation(475, 60);
        frame.setLayout(null);

        // Panel of upper heading
        JPanel headingP = new JPanel();
        headingP.setBounds(0, 0, 300, 30);
        headingP.setBackground(new Color(9, 52, 254));
        headingP.setLayout(null);

        JLabel calc = new JLabel();
        calc.setText("CASIO");
        calc.setBounds(0, 0, 100, 35);
        calc.setFont(new Font("Tahoma", Font.BOLD, 18));

        headingP.add(calc);

        // Panel for TextField
        JPanel tfp = new JPanel();
        tfp.setLocation(0, 30);
        tfp.setSize(new Dimension(300, 70));
        tfp.setLayout(null);
        tfp.setBackground(new Color(82, 113, 255));
        tfp.setBorder(BorderFactory.createMatteBorder(2, 1, 1, 1, Color.black));

        // Main text field
        tf = new JTextField();
        tf.setBounds(0, 0, 250, 70);
        tf.setFont(new Font("Consolas", Font.PLAIN, 24));
        tf.setBackground(new Color(82, 113, 255));
        tf.setBorder(BorderFactory.createMatteBorder(2, 2, 1, 1, Color.black));
        tf.setText("0");
        tf.setEditable(false);

        // Operator text field
        operatortf = new JTextField();
        operatortf.setBounds(250, 0, 50, 70);
        operatortf.setBorder(BorderFactory.createMatteBorder(2, 1, 1, 2, Color.black));
        operatortf.setBackground(new Color(82, 113, 255));
        operatortf.setFont(new Font("Consolas", Font.PLAIN, 28));
        operatortf.setEditable(false);

        // Panel For Buttons
        JPanel Bpanel = new JPanel();
        Bpanel.setLocation(0, 100);
        Bpanel.setSize(new Dimension(300, 400));
        Bpanel.setLayout(new GridLayout(5, 4));
        Bpanel.setBackground(Color.white);
        Bpanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));

        // 🔴🔴 Creating buttons

        ac = button("AC");

        pm = button("+/-");

        percentage = button("%");

        division = button("/");

        equal = button("=");

        decimal = button(".");

        plus = button("+");

        multiplication = button("*");

        minus = button("-");

        one = button("1");

        two = button("2");

        three = button("3");

        four = button("4");

        five = button("5");

        six = button("6");

        seven = button("7");

        eight = button("8");

        nine = button("9");

        zero = button("0");

        doubleZero = button("00");

        // Adding components to button panel
        Bpanel.add(ac);
        Bpanel.add(pm);
        Bpanel.add(percentage);
        Bpanel.add(division);

        Bpanel.add(seven);
        Bpanel.add(eight);
        Bpanel.add(nine);
        Bpanel.add(multiplication);

        Bpanel.add(four);
        Bpanel.add(five);
        Bpanel.add(six);
        Bpanel.add(minus);

        Bpanel.add(one);
        Bpanel.add(two);
        Bpanel.add(three);
        Bpanel.add(plus);

        Bpanel.add(zero);
        Bpanel.add(doubleZero);
        Bpanel.add(decimal);
        Bpanel.add(equal);

        // adding components to text panel
        tfp.add(tf);

        tfp.add(operatortf);

        // adding components to main frame
        frame.getContentPane().add(tfp);
        frame.getContentPane().add(headingP);
        frame.getContentPane().add(Bpanel);

        frame.setVisible(true);
    }

    // calculator buttons
    static JButton button(String text) {
        Clac c = new Clac();
        LineBorder lb = new LineBorder(Color.BLACK, 1, true);
        JButton b = new JButton();
        b.setText(text);
        b.setFont(new Font("Consolas", Font.PLAIN, 24));
        b.setBackground(new Color(42, 79, 255));
        b.setForeground(new Color(120, 144, 255));
        b.setBorder(lb);
        // b.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        b.addActionListener(c);

        return b;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == one) {
            text += one.getText();
            tf.setText(text);
        } else if (ae.getSource() == two) {
            text += two.getText();
            tf.setText(text);
        } else if (ae.getSource() == three) {
            text += three.getText();
            tf.setText(text);
        } else if (ae.getSource() == four) {
            text += four.getText();
            tf.setText(text);
        } else if (ae.getSource() == five) {
            text += five.getText();
            tf.setText(text);
        } else if (ae.getSource() == six) {
            text += six.getText();
            tf.setText(text);
        } else if (ae.getSource() == seven) {
            text += seven.getText();
            tf.setText(text);
        } else if (ae.getSource() == eight) {
            text += eight.getText();
            tf.setText(text);
        } else if (ae.getSource() == nine) {
            text += nine.getText();
            tf.setText(text);
        } else if (ae.getSource() == zero) {
            text += zero.getText();
            tf.setText(text);
        } else if (ae.getSource() == doubleZero) {
            text += doubleZero.getText();
            tf.setText(text);
        } else if (ae.getSource() == decimal) {
            text += decimal.getText();
            tf.setText(text);
        }
        // operators
        else if (ae.getSource() == ac) {
            tf.setText("");
            operatortf.setText("");
            text = "";
            op = "";
        } else if (ae.getSource() == plus) {
            op = plus.getText();
            operatortf.setText(op);

            val1 = Float.parseFloat(text);
            operator = op.charAt(0);
            text = "";
            tf.setText("");

        } else if (ae.getSource() == minus) {
            op = minus.getText();
            operatortf.setText(op);

            val1 = Float.parseFloat(text);
            operator = op.charAt(0);
            text = "";
            tf.setText("");
        } else if (ae.getSource() == multiplication) {
            op = multiplication.getText();
            operatortf.setText(op);

            val1 = Float.parseFloat(text);
            operator = op.charAt(0);
            text = "";
            tf.setText("");
        } else if (ae.getSource() == division) {
            op = division.getText();
            operatortf.setText(op);

            val1 = Float.parseFloat(text);
            operator = op.charAt(0);
            text = "";
            tf.setText("");
        } else if (ae.getSource() == percentage) {
            op = percentage.getText();
            operatortf.setText(op);

            val1 = Float.parseFloat(text);
            operator = op.charAt(0);
            text = "";
            tf.setText("");
        } else if (ae.getSource() == equal) {
            op = equal.getText();
            operatortf.setText(op);

            val2 = Float.parseFloat(text);

            switch (operator) {
                case '+':
                    res = val1 + val2;
                    text = String.valueOf(res);
                    tf.setText(text);
                    break;
                case '-':
                    res = val1 - val2;
                    text = String.valueOf(res);
                    tf.setText(text);
                    break;
                case '*':
                    res = val1 * val2;
                    text = String.valueOf(res);
                    tf.setText(text);
                    break;
                case '/':
                    res = val1 / val2;
                    text = String.valueOf(res);
                    tf.setText(text);
                    break;
                case '%':
                    res = ((val1 * val2) / 100);
                    text = String.valueOf(res);
                    tf.setText(text);
                    break;

            }

        } else if (ae.getSource() == pm && (text.isEmpty())) {

            text = "";
            tf.setText(text);

        } else if (ae.getSource() == pm && (!(text.isEmpty()))) {
            char minus = '-';
            if (text.charAt(0) == minus) {
                text = text.substring(1, text.length());
                tf.setText(text);
            } else {
                text = String.valueOf(minus) + text;
                tf.setText(text);
            }
        }

    }

    static double val1 = 0;
    static double val2 = 0;
    static double res = 0;
    static char operator;

    static String op = " ";
    static String text = "";

    static JTextField tf;
    static JTextField operatortf;

    static JButton pm;
    static JButton ac;
    static JButton percentage;
    static JButton division;
    static JButton multiplication;
    static JButton one;
    static JButton two;
    static JButton three;
    static JButton four;
    static JButton five;
    static JButton six;
    static JButton seven;
    static JButton eight;
    static JButton nine;
    static JButton zero;
    static JButton doubleZero;
    static JButton plus;
    static JButton minus;
    static JButton equal;
    static JButton decimal;

}