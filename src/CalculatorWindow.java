import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorWindow extends JFrame {
    private CalculatorController calculatorController;

    private JLabel num1Lbl;

    private JLabel num2Lbl;

    private JLabel headLbl;

    private JTextField num1Text;
    private JTextField num2Text;

    private JButton calBtn;

    private JPanel number1Penal;

    private JPanel number2Penal;


    private JPanel btnPenal;

    private JSlider waterLevelSlider;

    CalculatorWindow(CalculatorController calculatorController) {

        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator Window");
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));
        getContentPane().setBackground(new Color(102, 210, 227));

        this.calculatorController = calculatorController;


        //-----------------------------------------

        num1Lbl = new JLabel("Number 1");
        num1Lbl.setFont(new Font("", 1, 18));

        num2Lbl = new JLabel("Number 2");
        num2Lbl.setFont(new Font("", 1, 18));


        num1Text = new JTextField(10);
        num1Text.setFont(new Font("", 1, 18));

        num2Text = new JTextField(10);
        num2Text.setFont(new Font("", 1, 18));

        //----------------------------------------------------------

        calBtn = new JButton("Calculate");
        calBtn.setFont(new Font("", 1, 18));

        calBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int addNum1 = Integer.parseInt(num1Text.getText());
                int addNum2 = Integer.parseInt(num2Text.getText());

                calculatorController.calculateFunction(addNum1,addNum2);

            }
        });


        //-----------------------------------------------------------

        headLbl = new JLabel("Number Calculator");
        headLbl.setHorizontalAlignment(JLabel.CENTER);
        headLbl.setFont(new Font("Arial Rounded MT Bold", 3, 30));
        add(headLbl);

        number1Penal = new JPanel();
        number1Penal.setBackground(new Color(102, 210, 227));
        number1Penal.add(num1Lbl);
        number1Penal.add(num1Text);
        add(number1Penal);


        number2Penal = new JPanel();
        number2Penal.setBackground(new Color(102, 210, 227));
        number2Penal.add(num2Lbl);
        number2Penal.add(num2Text);
        add(number2Penal);


        btnPenal = new JPanel();
        btnPenal.setBackground(new Color(102, 210, 227));
        btnPenal.setLayout(new FlowLayout(FlowLayout.RIGHT));
        btnPenal.add(calBtn);
        add(btnPenal);


    }
}
