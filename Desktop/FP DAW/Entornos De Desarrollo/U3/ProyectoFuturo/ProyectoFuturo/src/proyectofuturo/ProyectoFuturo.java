package proyectofuturo;

public class ProyectoFuturo {

    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] +" : ");
        ProyectoFuturo.veredicto(args[1], args[2]);
    }
    
    private static String veredicto(String valor1, String valor2){
        if(valor1.equals(valor2)){
            System.out.println("Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.");
        }else if(Integer.valueOf(valor2) < Integer.valueOf(valor1)){
            System.out.println("Poco tiempo de estudio. Debes dedicar más tiempo.");
        }return "Ideal. Trabajas los contenidos en casa.";
    }

}

