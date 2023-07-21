import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class MultiplicationWindow extends JFrame implements NumberObserver {

    ArrayList<String>addNumberList3=new ArrayList<>();
    private JTextArea textArea;
    private JLabel headLineLbl;
    private JPanel centerPenal;


    MultiplicationWindow() {
        setSize(300, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Multiplication Window");
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setVisible(true);
        //-----------------------------------------

        headLineLbl = new JLabel("Multiplication");
        headLineLbl .setFont(new Font("",1,20));
        headLineLbl .setHorizontalAlignment(JLabel.CENTER);

        JPanel northPenal =new JPanel();
        northPenal.setBackground(new Color(102, 210, 227));
        northPenal.add(headLineLbl);
        add("North",northPenal);

        textArea = new JTextArea(8, 16);
        textArea.setFont(new Font("", 1, 18));
        textArea.setSize(250,250);

        centerPenal = new JPanel();
        centerPenal.setSize(300,300);
        centerPenal.setBackground(new Color(102, 210, 227));
        centerPenal.add(textArea);
        add("Center",centerPenal);

    }

    @Override
    public void update(int addNum1, int addNum2) {

        String multiplication = addNum1 + " * " + addNum2 + " = " + (addNum1 * addNum2);

        //----------------------------------------------------------------------------------

        if (addNum1 < 0) {
            multiplication  = "(" + addNum1 + ")" + " * " + addNum2 + " = " + (addNum1 * addNum2);
        }

        if (addNum2 < 0) {
            multiplication = addNum1 + " * " + "(" + addNum2 + ")" + " = " + (addNum1 * addNum2);
        }

        if ((addNum1 & addNum2) < 0) {
            multiplication  = "(" + addNum1 + ")" + " * " + "(" + addNum2 + ")" + " = " + (addNum1 * addNum2);
        }

        //----------------------------------------------------------------------------------

        addNumberList3.add(multiplication );

        String b = "";
        for (String a : addNumberList3) {
            b += a + "\n";
        }

        textArea.setText(b);

    }
}
