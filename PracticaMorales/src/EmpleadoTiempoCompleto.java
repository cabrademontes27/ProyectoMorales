public class EmpleadoTiempoCompleto extends Empleado
{
    private int horasTrabajadas;
    public EmpleadoTiempoCompleto(String nombre, int id, double salario,int horasTrabajadas)
    {
        super(nombre, id, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public void calcularSalario(int horas, double salarioBase)
    {

    }

    public void calcularIncentivo()
    {
        //5% sobre el calculo del salario
    }

    public int getHorasTrabajadas()
    {
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas)
    {
        this.horasTrabajadas = horasTrabajadas;
    }

}