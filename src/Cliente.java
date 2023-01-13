public class Cliente {

    String nombre;
    String DNI;
    boolean socio;
    String[] membresia;

    public Cliente() {

        this.nombre=nombre;
        this.DNI=DNI;
        this.socio=socio;
        this.membresia=membresia;
    }

    public void crear_no_socio(){

        System.out.println(nombre + DNI + String.valueOf(false));
    }

    public void getDescuento(){

    }

    public String toString(){

        System.out.println(nombre + ", " + DNI + ", " + membresia + ", " + socio);
        return toString();
    }

}
