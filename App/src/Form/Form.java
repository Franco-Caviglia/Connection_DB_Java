package Form;
//importamos paquete DatosCliente y la clase Clientes;
import DatosCliente.Cliente;

//importamos libreria para crear nuestra UI;
import javax.swing.JLabel;
import javax.swing.JTextField;

import DAO.ClienteDAO;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Form {
    //Declaracion labels para los campos;
    
    private JLabel nameLabel;
    private JLabel lastNameLabel;
    private JLabel phoneLabel;
    private JLabel emailLabel;
    

    //Declaracion cajas de texto para tomar datos;
    private JTextField nameTextField;
    private JTextField lastNameTextField;
    private JTextField phoneTextField;
    private JTextField emailTextField;

    //Declaracion botones;
    private JButton saveButton;
    private JButton deleteButton;
    //Boton prueba de conexion;
    private JButton conectarButton;

    void borrarDatos(){
        nameTextField.setText(" ");
        lastNameTextField.setText(" ");
        emailTextField.setText(" ");
        phoneTextField.setText(" ");
    }
    
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
        //Nombre;
        nameLabel = new JLabel("Nombre");
        nameLabel.setBounds(40, 20, 80, 20);
        panel.add(nameLabel);

        //Apellido;
        lastNameLabel = new JLabel("Apellido");
        lastNameLabel.setBounds(40, 50, 80, 20);
        panel.add(lastNameLabel);

        //Telefono;
        phoneLabel = new JLabel("Telefono");
        phoneLabel.setBounds(40, 80, 80, 20);
        panel.add(phoneLabel);

        //Email;
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(40, 110, 80, 20);
        panel.add(emailLabel);

        //TxtField;
        //NombreTxtField;
        nameTextField = new JTextField();
        nameTextField.setBounds(105, 20, 80, 20);
        panel.add(nameTextField);

        //ApellidoTxtField;
        lastNameTextField = new JTextField();
        lastNameTextField.setBounds(105, 50, 80, 20);
        panel.add(lastNameTextField);

        //TelefonoTxtField;
        phoneTextField = new JTextField();
        phoneTextField.setBounds(105, 80, 80, 20);
        panel.add(phoneTextField);

        //EmailTxtField;
        emailTextField = new JTextField();
        emailTextField.setBounds(105, 110, 80, 20);
        panel.add(emailTextField);

        //List;
        JList<String> listaUsuarios = new JList<String>(lista);
        listaUsuarios.setBounds(210, 20, 500, 100);
        panel.add(listaUsuarios);

        //Boton guardar;
        saveButton = new JButton("Guardar");
        saveButton.setBounds(65, 140, 80, 20);
        saveButton.addActionListener(e -> {
            Cliente usuario = new Cliente();
            usuario.setName(this.nameTextField.getText());
            usuario.setLastName(this.lastNameTextField.getText());
            usuario.setEmail(this.emailTextField.getText());
            usuario.setPhone(this.phoneTextField.getText());
            lista.addElement(usuario.getName());
            borrarDatos();
        });
        panel.add(saveButton);

        //Boton borrar;
        deleteButton = new JButton("Eliminar");
        deleteButton.setBounds(210, 140, 80, 20);
        deleteButton.addActionListener(e -> {
            int indice = listaUsuarios.getSelectedIndex();
            lista.remove(indice);
        });
        panel.add(deleteButton);

        //boton prueba conex;
        conectarButton = new JButton("Conectar");
        conectarButton.setBounds(300, 140, 100, 20);
        conectarButton.addActionListener(e -> {
            ClienteDAO dao = new ClienteDAO();
            dao.conectar();
        });
        panel.add(conectarButton);
    }

    
}

