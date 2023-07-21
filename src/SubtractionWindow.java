import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class SubtractionWindow extends JFrame implements NumberObserver {

    ArrayList<String>addNumberList2=new ArrayList<>();
    private JTextArea textArea;
    private JLabel headLineLbl;
    private JPanel centerPenal;


    SubtractionWindow() {
        setSize(300, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Subtraction Window");
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setVisible(true);
        //-----------------------------------------

        headLineLbl = new JLabel("Subtraction");
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

        String subtraction = addNum1 + " - " + addNum2 + " = " + (addNum1 - addNum2);

        //----------------------------------------------------------------------------------


        if (addNum1 < 0) {
            subtraction = "(" + addNum1 + ")" + " - " + addNum2 + " = " + (addNum1 - addNum2);
        }

        if (addNum2 < 0) {
            subtraction= addNum1 + " - " + "(" + addNum2 + ")" + " = " + (addNum1 - addNum2);
        }

        if ((addNum1 & addNum2) < 0) {
            subtraction = "(" + addNum1 + ")" + " - " + "(" + addNum2 + ")" + " = " + (addNum1 - addNum2);
        }

        //----------------------------------------------------------------------------------

        addNumberList2.add(subtraction);

        String b = "";
        for (String a : addNumberList2) {
            b += a + "\n";
        }

        textArea.setText(b);


    }
}
