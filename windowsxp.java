import java.awt.*;
class windowsxp{
	public static void main(String xyz[]){
	Frame F=new Frame("Calculator");
	Textfield T1,T2,T3;
	Label L1,L2,L3;
	Button B1=new Button("=");
	Label L1=new Label("First No:");
	Label L3=new label("Result:");
	TextField T1=new TextField(10);
	TextField T2=new TextField(10);
	TextField T3=new TextField(10);
	Flowlayout FL=new Flowlayout();
	F.Setlayout(FC);
	ehandler E=new ehandler(T1,T2,T3);
	B1.addActionListener(E);
	F.add(L1);
	F.add(T1);
	F.add(L2);
	F.add(T2);
	F.add(B1);
	F.add(L3);
	F.add(T3):
	F.SetSize(400,400);
	}
}

class Ehandler impliments ActionListener{
	TextField no1,no2,results;
	public ehandler(TextField A, TextField B, TextField)
}