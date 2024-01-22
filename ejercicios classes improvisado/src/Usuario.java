

public class Usuario {
   
    
    /* PROPIEDADES */
    private String nombre;     
    private String email;
    private String contraseña; 
    private boolean esEncriptada; 
    
    /* CONSTRUCTORES */
    public Usuario(String nombre, String email, String contraseña, String esEncriptada){
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.esEncriptada = false;
    }
    
    public void desencriptarcontraseña(){
        char [] letras = contraseña.toCharArray();
        
        int valorLetra;
        for(int i=0; i < contraseña.length; i++){  
    }
    
}
   
