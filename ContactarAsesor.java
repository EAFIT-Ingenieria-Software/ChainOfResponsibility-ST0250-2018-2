import java.util.Scanner;

public class ContactarAsesor
{
    public static void Main(String[] args){
        //Se crea cada uno de los asesores
        AsesorComercial asesor1 = new Asesor01();
        AsesorComercial asesor2 = new Asesor02();
        AsesorComercial asesor3 = new Asesor03();
        
        //Establecemos que éstos no están disponibles para atender personas
        asesor1.setDisponib(false);
        asesor2.setDisponib(false);
        
        //Establecemos el siguiente asesor que se va a intentar contactar en
        //caso de que el primero esté ocupado
        asesor1.setNext(asesor2);
        asesor2.setNext(asesor3);
        
        //Inicializamos el dialogo y pedimos respuesta
        Scanner reader = new Scanner(System.in);
        System.out.println("¿Desea contactar un asesor? (si/no)");
        String respuesta = reader.nextLine();
        
        if(respuesta.equals("si")){
            System.out.println("Por favor espere mientras lo contactamos con uno de nuestros asesores...");
            System.out.println("\n(Riiiing... Riiiing...) \n");
            asesor1.contactar();//Aquí intentamos contactar al primer asesor  
        }else{
            System.out.println("Estaremos siempre para servirle, felíz día.");
        }
    }
}
