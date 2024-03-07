import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Grade implements ActionListener {
    double balence=60000;
    double temp=0;
    String toggle1=" ";
    JFrame frame=new JFrame();
    JTextField textField=new JTextField();
    JButton button1=new JButton();
    JButton button2=new JButton();
    JButton button3=new JButton();
    JButton button4=new JButton();
    JLabel label=new JLabel();
    JTextField result=new JTextField();
    JLabel label1=new JLabel();
    JTextArea result1=new JTextArea();
    JTextField submit=new JTextField();
    JButton OK=new JButton();
    JButton OK1=new JButton();
    JButton back=new JButton();

    public Grade(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,650,650);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(null);
        frame.setResizable(false);

        textField.setBounds(0,0,650,50);
        textField.setBackground(new Color(25,25,25));
        textField.setForeground(new Color(25,255,0));
        textField.setFont(new Font("Ink free",Font.BOLD,30));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);
        textField.setText("BANK");

        button1.setBounds(30,100,120,25);
        button1.setBackground(new Color(218, 185, 185));
        button1.setForeground(new Color(2, 0, 0));
        button1.setFont(new Font("MV Boli",Font.PLAIN,20));
        button1.setBorder(BorderFactory.createBevelBorder(1));
        button1.setFocusable(false);
        button1.addActionListener(this);
        button1.setText("Balance");

        button2.setBounds(180,100,120,25);
        button2.setBackground(new Color(218, 185, 185));
        button2.setForeground(new Color(2, 0, 0));
        button2.setFont(new Font("MV Boli",Font.PLAIN,20));
        button2.setBorder(BorderFactory.createBevelBorder(1));
        button2.setFocusable(false);
        button2.addActionListener(this);
        button2.setText("Withdraw");

        button3.setBounds(330,100,120,25);
        button3.setBackground(new Color(218, 185, 185));
        button3.setForeground(new Color(2, 0, 0));
        button3.setFont(new Font("MV Boli",Font.PLAIN,20));
        button3.setBorder(BorderFactory.createBevelBorder(1));
        button3.setFocusable(false);
        button3.addActionListener(this);
        button3.setText("Deposit");

        button4.setBounds(480,100,120,25);
        button4.setBackground(new Color(218, 185, 185));
        button4.setForeground(new Color(2, 0, 0));
        button4.setFont(new Font("MV Boli",Font.PLAIN,20));
        button4.setBorder(BorderFactory.createBevelBorder(1));
        button4.setFocusable(false);
        button4.addActionListener(this);
        button4.setText("Exit");

        result.setBounds(220,200,200,50);
        result.setBackground(new Color(37, 36, 36));
        result.setForeground(new Color(245, 241, 241));
        result.setFont(new Font("MV Boli",Font.PLAIN,20));
        result.setBorder(BorderFactory.createBevelBorder(1));
        result.setHorizontalAlignment(JTextField.CENTER);

        result1.setBounds(220,500,400,90);
        result1.setBackground(new Color(50,50,50));
        result1.setForeground(new Color(25, 255, 0));
        result1.setFont(new Font(Font.DIALOG,Font.PLAIN,20));

        label.setBounds(90,168,500,100);
        label.setBackground(new Color(50,50,50));
        label.setForeground(new Color(25,255,0));
        label.setFont(new Font("MV Boli",Font.PLAIN,35));
        label.setText("Balance: ");

        label1.setBounds(0,290,500,100);
        label1.setBackground(new Color(16, 15, 15));
        label1.setForeground(new Color(25,255,0));
        label1.setFont(new Font("MV Boli",Font.PLAIN,35));
        label1.setText(" ");

        back.setBounds(10,10,40,40);
        back.setBackground(new Color(218, 185, 185));
        back.setForeground(new Color(2, 0, 0));
        back.setFont(new Font("MV Boli",Font.PLAIN,20));
        back.setBorder(BorderFactory.createBevelBorder(1));
        back.setFocusable(false);
        back.addActionListener(this);
        back.setText("<--");

        frame.add(back);
        frame.add(label1);
        frame.add(label);
        frame.add(OK1);
        frame.add(OK);
        frame.add(submit);
        frame.add(result1);
        frame.add(result);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(textField);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        OK.setEnabled(true);

        if(e.getSource()==button1){
            button1.setBackground(new Color(228, 234, 20));
//            button1.setEnabled(false);
            avalable();
        }
        if(e.getSource()==button2){
            label1.setVisible(true);
            submit.setVisible(true);
            button2.setBackground(new Color(228, 234, 20));
            result1.setText(" ");
            toggle1="Enter Withdraw amount: ";
            label1.setText(toggle1);
//            button2.setEnabled(false);
            submit.setBounds(420,300,200,90);
            submit.setBackground(new Color(218, 185, 185));
            submit.setForeground(new Color(2, 0, 0));
            submit.setFont(new Font("MV Boli",Font.PLAIN,20));
            submit.setBorder(BorderFactory.createBevelBorder(1));
            submit.setHorizontalAlignment(JTextField.CENTER);

            OK1.setBounds(150,400,110,40);
            OK1.setFont(new Font("MV Boli",Font.BOLD,15));
            OK1.setBackground(new Color(232, 60, 60));
            OK1.setForeground(new Color(238, 232, 232));
            OK1.setFocusable(false);
            OK1.addActionListener(this);
            OK1.setText("Withdraw");
            OK1.setVisible(true);
            submit.setText(" ");
            Withdraw();


        }
        if(e.getSource()==button3){
            label1.setVisible(true);
            submit.setVisible(true);
            button3.setBackground(new Color(228, 234, 20));
            result1.setText(" ");
            toggle1="Enter the amount: ";
            label1.setText(toggle1);
//            button3.setEnabled(false);
            submit.setBounds(320,300,200,90);
            submit.setBackground(new Color(218, 185, 185));
            submit.setForeground(new Color(2, 0, 0));
            submit.setFont(new Font("MV Boli",Font.PLAIN,20));
            submit.setBorder(BorderFactory.createBevelBorder(1));
            submit.setHorizontalAlignment(JTextField.CENTER);

            OK.setBounds(370,400,110,40);
            OK.setFont(new Font("MV Boli",Font.BOLD,15));
            OK.setBackground(new Color(43, 82, 239));
            OK.setForeground(new Color(238, 232, 232));
            OK.setFocusable(false);
            OK.addActionListener(this);
            OK.setText("Deposit");
            OK.setVisible(true);
            submit.setText(" ");
            OK.addActionListener(a -> {
                OK.setVisible(false);
                String sam = submit.getText();
                this.temp = Double.parseDouble(sam);
                Deposits();
            });

        }
        if(e.getSource()==button4){
            button4.setBackground(new Color(228, 234, 20));
//            button4.setEnabled(false);
            System.exit(0);
        }
        if(e.getSource()==back){
            button1.setBackground(new Color(218, 185, 185));
            button2.setBackground(new Color(218, 185, 185));
            button3.setBackground(new Color(218, 185, 185));
            button4.setBackground(new Color(218, 185, 185));

            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);

            OK1.setVisible(false);
            OK.setVisible(false);

            label1.setVisible(false);
            submit.setVisible(false);

            result1.setVisible(false);

        }
    }
    public void avalable(){
        result.setText("Rs. "+(balence));
        result1.setVisible(true);
        result1.setText("Balance Checked...");
    }
    public void Withdraw(){
        OK1.addActionListener(a -> {
            result1.setVisible(true);
            OK1.setVisible(false);
            String sam = submit.getText();
            this.temp = Double.parseDouble(sam);
            if(temp>balence){
                result1.setText("Balance is not available...");
                result1.setForeground(new Color(236, 8, 8));
            }
            else{
                result1.setText("Withdraw Successful");
                balence=balence-temp;
                result.setText("Rs. "+(balence));
            }
        });
    }
    public void Deposits(){
        result1.setVisible(true);
            balence=balence+temp;
            result.setText("Rs. "+(balence));
            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            result1.setText("Deposit successful...");
    }
}
public class jframe_gread {
    public static void main(String[] args){
        Grade grade=new Grade();
    }
}
