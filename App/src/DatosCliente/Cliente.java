package DatosCliente;

public class Cliente{
    
    //Generamos variables que utilizaremos tambien en nuestra BD;
    private String name;
    private String lastName;
    private String phone;
    private String email;

    //Generamos getters & setters para almacenar y obtener los datos;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    
}
