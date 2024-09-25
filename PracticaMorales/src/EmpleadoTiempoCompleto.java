public class EmpleadoTiempoCompleto extends Empleado implements IEmpleado
{
    private int horasTrabajadas;
    public EmpleadoTiempoCompleto(String nombre, int id, double salario,int horasTrabajadas)
    {
        super(nombre, id, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    //Tomando en cuenta que el salario base es x mes, y el mes tiene 160 horas, 
    //su salario se vera divido por las horas que contiene un mes 
    public double calcularSalario()
    {
        double horasTrabajadasPorMes = horasTrabajadas / 160.0; 
        double salarioPorMes = salario * horasTrabajadasPorMes;
        salarioPorMes += calcularIncentivo(salarioPorMes);
        return salarioPorMes;
    }

    @Override
    // Aqui es el 5% sobre el pago mensual 
    public double calcularIncentivo(double salarioPorSemana) {
        double salarioSobreIncentivo = salarioPorSemana * 0.05;
        //5% sobre el calculo del salario
        return salarioSobreIncentivo; 
    }

    public int getHorasTrabajadas()
    {
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas)
    {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void mostrar()
    {
        System.out.println("");
        System.out.println("Empleado de tiempo completo: ");
        System.out.println("Nombre: " + getNombre() + "\nID: " + getId() + "\nSalario base: " + getSalario());
    }

}