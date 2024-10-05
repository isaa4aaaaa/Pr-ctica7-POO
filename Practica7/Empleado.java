package mx.unam.fi.poo.g1.p7;

/**
 * Clase Empleado
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public class Empleado {
    private String nombre, direccion, trabajo;
    private double salario;

    /**
     * Método constructor base.
     * @param nombre -> Para asignar el atributo nombre.
     * @param direccion -> Para asignar el atributo direccion.
     * @param trabajo -> Para asignar el atributo trabajo (nombre del trabajo).
     * @param salario -> Para asignar el atributo salario.
     */
    public Empleado(String nombre, String direccion, String trabajo, int salario){
        setNombre(nombre);
        setDireccion(direccion);
        setTrabajo(trabajo);
        setSalario(salario);
    }

    /**
     * Método set.
     * @param nombre -> Para modificar el atrivuto nombre.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método get.
     * @return this.nombre -> Regresa el atributo nombre.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Método set.
     * @param direccion -> Para modificar el atributo direccion.
     */
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    /**
     * Método get.
     * @return this.direction -> Retorna el atributo direccion.
     */
    public String getDireccion(){
        return this.direccion;
    }

    /**
     * Método set.
     * @param trabajo -> Para modificar el atributo trabajo.
     */
    public void setTrabajo(String trabajo){
        this.trabajo = trabajo;
    }

    /**
     * Método get.
     * @return this.trabajo -> Retorna el atributo trabajo.
     */
    public String getTrabajo(){
        return this.trabajo;
    }

    /**
     * Método set.
     * @param salario -> Para modificar el atributo salario.
     */
    public void setSalario(double salario){
        this.salario = salario;
    }

    /**
     * Método get.
     * @return this.salario -> Regresa el atributo salario.
     */
    public double getSalario(){
        return this.salario;
    }

    /**
     * Método para calcular el bono definido.
     * @return bono -> Regresa el bono calculado.
     */
    public double calcularBono(){
        double bono = getSalario() * 0.5;
        setSalario(getSalario()+bono);
        return bono;
    }

    /**
     * Método para generar un reporte de desempeño.
     * @param desempeño -> Definición del desempeño del empleado.
     */
    public void generarReporteDesempeño(String desempeño){
        System.out.println("Desempeño: "+ desempeño);
    }

    /**
     * Método para presentar los proyectos siendo manejados.
     */
    public void manejoProyectos(){
        System.out.println("El/La emplead@" + getNombre() + "no está manejando ningún proyecto");
    }

    public void imprimirInformacion(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Dirección: "+ getDireccion());
        System.out.println("Puesto: "+getTrabajo());
        System.out.println("Salario: "+getSalario());
    }

}
