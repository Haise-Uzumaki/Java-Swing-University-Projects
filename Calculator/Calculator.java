import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField text;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAdd,bSub,bMul,bDiv,bDec,bEQ,bCLR;

    static double a = 0 , b = 0, result = 0;

    static int operator = 0;

    public Calculator() {

        frame = new JFrame("Calculator");
        text = new  JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bAdd = new JButton("+");
        bSub = new JButton("-");
        bMul = new JButton("*");
        bDiv = new JButton("/");
        bDec = new JButton(".");
        bEQ = new JButton("=");
        bCLR = new JButton("Clear");

        text.setBounds(30, 40, 280, 30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110, 100, 50, 40);
        b9.setBounds(180, 100, 50, 40);
        bDiv.setBounds(250, 100,  50, 40);

        b4.setBounds(40, 170, 50, 40);
        b5.setBounds(110, 170, 50, 40);
        b6.setBounds(180, 170, 50, 40);
        bMul.setBounds(250, 170, 50, 40);

        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bSub.setBounds(250,240,50,40);

        bDec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        bEQ.setBounds(180,310,50,40);
        bAdd.setBounds(250,310,50,40);

        bCLR.setBounds(100,380,100,40);

        frame.add(text);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);
        frame.add(bAdd);
        frame.add(bSub);
        frame.add(bMul);
        frame.add(bDiv);
        frame.add(bDec);
        frame.add(bEQ);
        frame.add(bCLR);


        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bDec.addActionListener(this);
        bEQ.addActionListener(this);
        bCLR.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1){
            text.setText(text.getText().concat("1"));
        }
        if(e.getSource()==b2){
            text.setText(text.getText().concat("2"));
        }
        if(e.getSource()==b3){
            text.setText(text.getText().concat("3"));
        }
        if(e.getSource()==b4){
            text.setText(text.getText().concat("4"));
        }
        if(e.getSource()==b5){
            text.setText(text.getText().concat("5"));
        }
        if(e.getSource()==b6){
            text.setText(text.getText().concat("6"));
        }
        if(e.getSource()==b7){
            text.setText(text.getText().concat("7"));
        }
        if(e.getSource()==b8){
            text.setText(text.getText().concat("8"));
        }
        if(e.getSource()==b9){
            text.setText(text.getText().concat("9"));
        }
        if(e.getSource()==b0){
            text.setText(text.getText().concat("0"));
        }
        if(e.getSource()==bDec){
            text.setText(text.getText().concat("."));
        }
        if(e.getSource()==bAdd){
            a=Double.parseDouble(text.getText());
            operator = 1;
            text.setText("");
        }
        if(e.getSource()==bSub){
            a=Double.parseDouble(text.getText());
            operator = 2;
            text.setText("");
        }
        if(e.getSource()==bMul){
            a=Double.parseDouble(text.getText());
            operator = 3;
            text.setText("");
        }
        if(e.getSource()==bDiv){
            a=Double.parseDouble(text.getText());
            operator = 4;
            text.setText("");
        }

        if(e.getSource()==bEQ){
            b=Double.parseDouble(text.getText());

            switch (operator) {
                case 1: result=a+b;
                        break;
                case 2: result=a-b;
                        break;
                case 3: result=a*b;
                        break;
                case 4: result=a/b;
                        break;

                default:result=0;
            }

            text.setText(""+result);
        }

        if(e.getSource()==bCLR){
            text.setText("");
        }




    }

    

}