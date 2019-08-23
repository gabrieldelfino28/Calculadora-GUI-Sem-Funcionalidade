package main;
import javax.swing.*;
import java.awt.*;

public class App extends JFrame{
	JMenuBar barra;
	JMenu msg1;
	JTextField msg;
	JButton btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
	JButton btn10, btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18;
	public App() {
		super("By Gabriel C Coelho");
		Container tela = getContentPane();
		tela.setLayout(null);

		barra = new JMenuBar();
		setJMenuBar(barra);
		msg1 = new JMenu("Calculadora");
		barra.add(msg1);
		msg = new JTextField(0);
		btn1 = new JButton("Backspace");
		btn2 = new JButton("CE");
		btn3 = new JButton("7");
		btn4 = new JButton("8");
		btn5 = new JButton("9");
		btn6 = new JButton("/");
		btn7 = new JButton("4");
		btn8 = new JButton("5");
		btn9 = new JButton("6");
		btn10 = new JButton("*");
		btn11 = new JButton("1");
		btn12 = new JButton("2");
		btn13 = new JButton("3");
		btn14 = new JButton("-");
		btn15 = new JButton("0");
		btn16 = new JButton(".");
		btn17 = new JButton("=");
		btn18 = new JButton("+");


		btn1.setBounds(30, 55, 115, 30);//"Backspace"
		btn2.setBounds(160, 55, 115, 30);//"CE"
		btn3.setBounds(30, 90, 50, 30);//"7"
		btn4.setBounds(95, 90, 50, 30);//"8"
		btn5.setBounds(160, 90, 50, 30);//"9"
		btn6.setBounds(225, 90, 50, 30);//"/"
		btn7.setBounds(30, 125, 50, 30);//"4"
		btn8.setBounds(95, 125, 50, 30);//"5"
		btn9.setBounds(160, 125, 50, 30);//"6"
		btn10.setBounds(225, 125, 50, 30);//"*"
		btn11.setBounds(30, 160, 50, 30);//"1"
		btn12.setBounds(95, 160, 50, 30);//"2"
		btn13.setBounds(160, 160, 50, 30);//"3"
		btn14.setBounds(225, 160, 50, 30);//"-"
		btn15.setBounds(30, 195, 50, 30);//"0"
		btn16.setBounds(95, 195, 50, 30);//"."
		btn17.setBounds(160, 195, 50, 30);//"="
		btn18.setBounds(225, 195, 50, 30);//"+"
		btn1.setForeground(Color.red);
		btn2.setForeground(Color.red);
		btn3.setForeground(Color.blue);
		btn4.setForeground(Color.blue);
		btn5.setForeground(Color.blue);
		btn6.setForeground(Color.red);
		btn7.setForeground(Color.blue);
		btn8.setForeground(Color.blue);
		btn9.setForeground(Color.blue);
		btn10.setForeground(Color.red);
		btn11.setForeground(Color.blue);
		btn12.setForeground(Color.blue);
		btn13.setForeground(Color.blue);
		btn14.setForeground(Color.red);
		btn15.setForeground(Color.blue);
		btn16.setForeground(Color.red);
		btn17.setForeground(Color.red);
		btn18.setForeground(Color.red);

		msg.setBounds(30, 20, 245, 25);
		msg.setFont(new Font("Consolas",Font.BOLD,12));
		msg.setForeground(Color.black);


		tela.add(msg);//("Msg")
		tela.add(btn1);//("Backspace")
		tela.add(btn2);//("CE")
		tela.add(btn3);//("7")
		tela.add(btn4);//("8")
		tela.add(btn5);//("9")
		tela.add(btn6);//("/")
		tela.add(btn7);//("4")
		tela.add(btn8);//("5")
		tela.add(btn9);//("6")
		tela.add(btn10);//("*")
		tela.add(btn11);//("1")
		tela.add(btn12);//("2")
		tela.add(btn13);//("3")
		tela.add(btn14);//("-")
		tela.add(btn15);//("0")
		tela.add(btn16);//(".")
		tela.add(btn17);//("=")
		tela.add(btn18);//("+")

		setSize(315,300);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		App app = new App();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
