import java.awt.*;

class Windows7{
    public static void main(String xyz[]){
        Frame win= new Frame();
        //Color win= new Color();
        Button B1= new Button("Click 1");
        Button B2= new Button("Click 2");
        Button B3= new Button("Click 3");
        Button B4= new Button("Click 4");
        Button B5= new Button("Click 5");
        Action1 e= new Action1();
        B1.addActionListener(e);
        //win.setBackground(Color.GREEN);
        win.add(B1,BorderLayout.NORTH);
        win.add(B1,BorderLayout.EAST);
        win.add(B1,BorderLayout.SOUTH);
        win.add(B1,BorderLayout.WEST);
        win.add(B1,BorderLayout.CENTER);
        win.setSize(400,400);
        win.setVisible(true);
    }
}