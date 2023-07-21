import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Demo{
    public static void main(String args[]){
        CalculatorController calculatorController =new CalculatorController();

        calculatorController.addNumberObserver(new AdditionWindow());
        calculatorController.addNumberObserver(new SubtractionWindow());
        calculatorController.addNumberObserver(new MultiplicationWindow());
        calculatorController.addNumberObserver(new DivisionWindow());
        calculatorController.addNumberObserver(new ModularityWindow());


        new CalculatorWindow(calculatorController).setVisible(true);
    }
}
