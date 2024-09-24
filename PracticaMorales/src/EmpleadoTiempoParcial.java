public class EmpleadoTiempoParcial extends Empleado {
    private int horasPorSemana;


    public EmpleadoTiempoParcial(String nombre, int id, double salario, int horasPorSemana)
    {
        super(nombre, id, salario);
        this.horasPorSemana = horasPorSemana;
        
    }

    public void calcularSalario(double salarioHora, int horasPorSemana)
    {

    }

    public void calcularIncentivo()
    {
        //3% sobre el calculo del salario
    }

    public int getHorasPorSemana() 
    {
        return this.horasPorSemana;
    }

    public void setHorasPorSemana(int horasPorSemana)
    {
        this.horasPorSemana = horasPorSemana;
    }
    
}
