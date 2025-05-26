class Empleado {
    private String nombre;
    private double salario;
    private int edad;

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
