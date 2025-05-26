public class Main {
    public static void main(String[] args) {
        Empleados empleados = new Empleados();

        empleados.altaEmpleado(new Empleado("Ana", 2000, 30));
        empleados.altaEmpleado(new Empleado("Luis", 2500, 40));
        empleados.altaEmpleado(new Empleado("Marta", 1800, 25));

        empleados.mostrarEmpleados();

        empleados.aumentarSalario(10);

        System.out.println("Después de aumentar salario:");
        empleados.mostrarEmpleados();
    }
}
