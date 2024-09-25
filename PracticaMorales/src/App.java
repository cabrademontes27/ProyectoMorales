public class App {
    public static void main(String[] args) throws Exception {

        //
        EmpleadoTiempoCompleto empleadoTiempoCompleto1 = new EmpleadoTiempoCompleto("paty", 101, 1500, 160);
        EmpleadoTiempoCompleto empleadoTiempoCompleto2 = new EmpleadoTiempoCompleto("Mag", 102, 2600, 35);
        EmpleadoTiempoCompleto empleadoTiempoCompleto3 = new EmpleadoTiempoCompleto("Morales", 103, 2500, 170);
        EmpleadoTiempoCompleto empleadoTiempoCompleto4 = new EmpleadoTiempoCompleto("pino", 104, 3600, 170);
        EmpleadoTiempoCompleto empleadoTiempoCompleto5 = new EmpleadoTiempoCompleto("Elena", 105, 160000, 40);





        EmpleadoTiempoParcial empleadoTiempoParcial1 = new EmpleadoTiempoParcial("zuzzet",202, 18.0, 40);
        EmpleadoTiempoParcial empleadoTiempoParcial2 = new EmpleadoTiempoParcial("Anujar",203, 5.0, 40);
        EmpleadoTiempoParcial empleadoTiempoParcial3 = new EmpleadoTiempoParcial("emilio",204, 11.0, 40);
        EmpleadoTiempoParcial empleadoTiempoParcial4 = new EmpleadoTiempoParcial("henry",205, 11.1, 40);
        EmpleadoTiempoParcial empleadoTiempoParcial5 = new EmpleadoTiempoParcial("julianDios",206, 120.0, 40);
        

        empleadoTiempoCompleto1.mostrar();
        System.out.println("Salario por " + empleadoTiempoCompleto1.getHorasTrabajadas() + " Horas trabajadas al mes, mas incentivos: " +  empleadoTiempoCompleto1.calcularSalario());

        empleadoTiempoCompleto2.mostrar();
        System.out.println("Salario por " + empleadoTiempoCompleto2.getHorasTrabajadas() + " Horas trabajadas al mes, mas incentivos: " +  empleadoTiempoCompleto2.calcularSalario());

        empleadoTiempoCompleto3.mostrar();
        System.out.println("Salario por " + empleadoTiempoCompleto3.getHorasTrabajadas() + " Horas trabajadas al mes, mas incentivos: " +  empleadoTiempoCompleto3.calcularSalario());

        empleadoTiempoCompleto4.mostrar();
        System.out.println("Salario por " + empleadoTiempoCompleto4.getHorasTrabajadas() + " Horas trabajadas al mes, mas incentivos: " +  empleadoTiempoCompleto4.calcularSalario());

        empleadoTiempoCompleto5.mostrar();
        System.out.println("Salario por " + empleadoTiempoCompleto5.getHorasTrabajadas() + " Horas trabajadas al mes, mas incentivos: " +  empleadoTiempoCompleto5.calcularSalario());

        
        empleadoTiempoParcial1.mostrar();
        System.out.println("Salario por " + empleadoTiempoParcial1.getHorasPorSemana() + " Horas trabajadas  mas incentivos: " +  empleadoTiempoParcial1.calcularSalario());

        empleadoTiempoParcial2.mostrar();
        System.out.println("Salario por " + empleadoTiempoParcial2.getHorasPorSemana() + " Horas trabajadas  mas incentivos: " +  empleadoTiempoParcial2.calcularSalario());

        empleadoTiempoParcial3.mostrar();
        System.out.println("Salario por " + empleadoTiempoParcial3.getHorasPorSemana() + " Horas trabajadas  mas incentivos: " +  empleadoTiempoParcial3.calcularSalario());

        empleadoTiempoParcial4.mostrar();
        System.out.println("Salario por " + empleadoTiempoParcial4.getHorasPorSemana() + " Horas trabajadas  mas incentivos: " +  empleadoTiempoParcial4.calcularSalario());

        empleadoTiempoParcial5.mostrar();
        System.out.println("Salario por " + empleadoTiempoParcial5.getHorasPorSemana() + " Horas trabajadas  mas incentivos: " +  empleadoTiempoParcial5.calcularSalario());

        //recibe NOMBRE -- ID -- SALARIO -- HORAS 
        
    }
}
