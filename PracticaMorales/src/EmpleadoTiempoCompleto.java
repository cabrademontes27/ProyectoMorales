public class EmpleadoTiempoCompleto extends Empleado implements IEmpleado
{
    private int horasTrabajadas;
    public EmpleadoTiempoCompleto(String nombre, int id, double salario,int horasTrabajadas)
    {
        super(nombre, id, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public void calcularSalario(int horas, double salarioBase)
    {
        // FALTA AQUIII
    }

    @Override
    // Aqui es el 5% sobre el pago mensual 
    public double calcularIncentivo(double salarioPorSemana) {
        double salarioSobreIncentivo = salarioPorSemana * 0.03;
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

}