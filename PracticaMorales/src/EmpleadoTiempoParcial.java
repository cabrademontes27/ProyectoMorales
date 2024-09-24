public class EmpleadoTiempoParcial extends Empleado implements IEmpleado {
    private int horasPorSemana;


    public EmpleadoTiempoParcial(String nombre, int id, double salario, int horasPorSemana)
    {
        super(nombre, id, salario);
        this.horasPorSemana = horasPorSemana;
        
    }

    //calcula el salario semanal en funcion de el salario por hora y las horas que trabajo a la semana
    public double calcularSalario()
    {
        double salarioPorSemana = (salario * horasPorSemana)  ;
        salarioPorSemana += calcularIncentivo(salarioPorSemana);
        return salarioPorSemana;
    }

    @Override
    // aqui es el 3% sobre el pago por semana del total de horas trabajadas
    public double calcularIncentivo(double salarioPorSemana) {
        double salarioSobreIncentivo = salarioPorSemana * 0.03;
        //3% sobre el calculo del salario
        return salarioSobreIncentivo; 
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
