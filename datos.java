import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class datos extends JFrame{

    private JTextField textField1;
    private JTextField textField2;
    private JButton saludarButton;
    private JButton unionButton;
    private JButton cerrarButton;
    private JPanel Jpanel1;
    private JButton limpiarButton;
    private JTextField val2TextField;
    private JTextField val1TextField;
    private JButton sumarButton;
    private JTextField resultadoTextField;

    public datos(){
        super("Operaciones");
        setContentPane(Jpanel1);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
            }
        });
        unionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Nombre Completo: " + textField1.getText()+" "+textField2.getText());
            }
        });
        saludarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hola! "+textField1.getText()+" "+textField2.getText());
            }
        });
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                double val1=Double.parseDouble(val1TextField.getText());
                double val2=Double.parseDouble(val2TextField.getText());
                double resultado=val1+val2;
                resultadoTextField.setText(Double.toString(resultado));
                }catch (Exception t){
                    JOptionPane.showMessageDialog(null,"Los Datos ingresados son incorrectos");
                }
            }
        });
    }
}
