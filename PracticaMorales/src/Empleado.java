public class Empleado {
    private String nombre;
    private int id;
    private double salario;

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

    public void calcularSalario()
    {
        
    }

    public void mostrar()
    {
        System.out.println("Nombre: " + getNombre() + "\nID: " + getId() + "\nSalario: " + getSalario());
    }


}
