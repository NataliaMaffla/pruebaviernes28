package clases;

public class Empleado {

    //ATRIBUTOS
    //(VARIABLES DE JAVA)
    //(FUERTES TIPADAS)
    public String id;
    public String nombres;
    String apellidos;
    String documento;
    String email;
    String telefono;
    String direccion;
    char tipoAfiliacionCajaCompensacion;

    byte edad;
    byte numeroHijos;
    float salario;
    short numeroBeneficiario;
    double cuotaFondoEmpleados;
    double deduccionPrestamoVivienda;
    double deduccionPrestado;
    double deduccionGimnasio;
    double demandaAlimentos;
    double deduccionSalud;
    double deduccionPensiones;
    double deducccionCajaCompensacion;
    double subsidioCajaCompensacion;
    double auxilioTransporte;
    double dotacion;
    double auxilioEscolar;


    //CONSTRUCTOR

    public Empleado() {
    }

    //(METODO ESPECIAL)
    //(CREAR OBJETOS DE LA CLASE)

    //METODOS DE LA CLASE
    //(FUNCIONES DE JAVA)
    //(TODA FUNCION RETORNA ALGO EN JAVA)

    public void saludar(){
        System.out.println("Hola buenos dias");
    }

}
