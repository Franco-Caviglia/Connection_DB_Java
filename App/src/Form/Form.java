package Form;
//importamos paquete DatosCliente y la clase Clientes;
import DatosCliente.Cliente;

//importamos libreria para crear nuestra UI;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Form {
    private JButton saveButton;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private static DefaultListModel<String> lista = new DefaultListModel<String>();

    public void formulario(){
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        panel.setLayout(null);

        //Frame config;
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
        frame.add(panel);
        
        //Labels;
        nameLabel = new JLabel("Nombre");
        nameLabel.setBounds(40, 20, 80, 20);
        panel.add(nameLabel);

        //TxtField;
        nameTextField = new JTextField();
        nameTextField.setBounds(105, 20, 80, 20);
        panel.add(nameTextField);

        //List;
        JList<String> listaUsuarios = new JList<String>(lista);
        listaUsuarios.setBounds(210, 20, 500, 100);
        panel.add(listaUsuarios);

        //Boton guardar;
        saveButton = new JButton("Guardar");
        saveButton.setBounds(65, 140, 80, 20);
        saveButton.addActionListener(e -> {
            Cliente nameUser = new Cliente();
            nameUser.setName(this.nameTextField.getText());
            lista.addElement(nameUser.getName());
        });
        panel.add(saveButton);
        
        
    }

    public void setVisible(boolean b) {

    }
    


}
