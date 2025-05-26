import java.util.ArrayList;

public class Empleados {
    public ArrayList<Empleado> lista;

    public Empleados() {
        lista = new ArrayList<>();
    }

    public void altaEmpleado(Empleado e) {
        lista.add(e);
    }

    public void mostrarEmpleados() {
        for (Empleado e : lista) {
            System.out.println("Nombre: " + e.getNombre() + ", Salario: " + e.getSalario() + ", Edad: " + e.getEdad());
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado e : lista) {
            double nuevoSalario = e.getSalario() * (1 + porcentaje / 100);
            e.setSalario(nuevoSalario);
        }
    }
}
