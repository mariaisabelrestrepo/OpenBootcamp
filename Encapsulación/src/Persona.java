public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void main(String[] args) {
        //creación del objeto
        Persona mipersona=new Persona();
        //utilizamos los setter para modificar los valores de las variables
        mipersona.setEdad(12);
        mipersona.setNombre("Sebastian");
        mipersona.setTelefono("4389558");
        //utilizamos los getter para mostrarlos en consola
        System.out.println(mipersona.getNombre());
        System.out.println(mipersona.getEdad());
        System.out.println(mipersona.getTelefono());



    }
}
