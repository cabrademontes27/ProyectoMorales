public class Empleado {
    protected String nombre;
    protected int id;
    protected double salario;

    public Empleado (String nombre, int id, double salario)
    {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public int getId()
    {
        return this.id;
    }

    public double getSalario()
    {
        return this.salario;
    }


    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public double calcularSalario()
    {
        return 0.0;
    }

    public void mostrar()
    {
        System.out.println("Nombre: " + getNombre() + "\nID: " + getId() + "\nSalario: " + getSalario());
    }


}
