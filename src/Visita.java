public class Visita extends Cliente{

    java.util.Date fecha =  new java.util.Date();
    java.sql.Date inicioLocal = new java.sql.Date(0);
    java.util.Date otraFecha = new java.util.Date(1000);
    double factura;

    public Visita(java.util.Date fecha,double factura){
        super();
        this.nombre=nombre;
        this.DNI=DNI;
        this.socio=socio;
        this.membresia=membresia;
        this.factura=factura;
        factura=0;
    }


}
