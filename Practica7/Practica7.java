package mx.unam.fi.poo.g1.p7;

/**
 * Clase principal de Practica 7
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public class Practica7 {

    /**
     * Método main.
     * Se ejecuta toda la funcionalidad del programa.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Manager manager = new Manager("Georgina Pérez", "Tejamamil 58, CDMX", "Web Dev Manager", 35000);

        Desarrollador desarrollador = new Desarrollador("Juan Velazco", "Jilotepec 54, Edo. Mex.", "Mobile Developer", 25000);

        Programador programador = new Programador("Federica flores", "Monte verde 37, CDMX", "Junior Programmer", 18000);

        System.out.println("A continuación se presenta la información de 3 empleados a quienes se les otorgó un bono a su salario.\n");

        manager.imprimirInformacion();
        manager.generarReporteDesempeño("Excelente");
        manager.manejoProyectos();
        System.out.println("\nEl bono dado a "+manager.getNombre() + " equivalió a: $"+manager.calcularBono());
        System.err.println("Su salario después del bono fue de: $"+manager.getSalario()+"\n");

        desarrollador.imprimirInformacion();
        desarrollador.generarReporteDesempeño("Bueno");
        desarrollador.manejoProyectos();
        System.out.println("\nEl bono dado a "+desarrollador.getNombre() + " equivalió a: $"+desarrollador.calcularBono());
        System.err.println("Su salario después del bono fue de: $"+desarrollador.getSalario()+"\n");

        programador.imprimirInformacion();
        programador.generarReporteDesempeño("Sobresaliente");
        programador.manejoProyectos();
        System.out.println("\nEl bono dado a "+programador.getNombre() + " equivalió a: $"+programador.calcularBono());
        System.err.println("Su salario después del bono fue de: $"+programador.getSalario()+"\n");

    }
}

