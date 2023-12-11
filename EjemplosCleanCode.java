public class EjemplosCleanCode {

    static int contador;

    //Aqui tenemos un ejemplo de un mal nombre que no representa nada para el que lea el codigo
    static int n = 10;
    //Especifica que el numero es el limite
    static final int NUMERO_LIMITE = 10;
    public static void main(String[] args){

        //bucle que me dice si los numeros son pares o impares
        for (int i = 0; i <= NUMERO_LIMITE; i++) {
            if(i % 2 == 0){
            System.out.println(i+" es par");
            }else{
            System.out.println(i+" es impar");
            }
        }
        // Incrementa el contador en 1
        contador++;

        // Evitar que el contador exceda el límite permitido
        contador++;


    }

    //Este seria un mal ejemplo de nombres pronunciables
    public static void chkTbl(){

        System.out.println("Chekeando tabla...");

    }
    //Este seria el ejemplo correcto
    public static void checkTable(){

        System.out.println("Chekeando tabla...");

    }



    //Mal ejemplo para nombrar a una clase
    public class PC {
        //codigo
        
    }
    //Asi si se deberia de llamar una clase
    public class PagoClientes {
        //codigo
        
    }



    //Puede dar lugar a errores tanto codigo junto
    public void procesarYMandarEmail(String user) {
        // Procesamiento de datos del usuario
        // Generación de contenido del correo electrónico
        // Envío del correo electrónico
    }
    //Codigo dividido
    public static void ProcesarDatos(String user) {
        // Procesamiento de datos del usuario
    }
    
    public static void GenerarContenidoEmail(String user) {
        // Generación de contenido del correo electrónico
    }
    
    public static void EnviarEmail(String contenido, String recipiente) {
        // Envío del correo electrónico   
    }


    //Evitar generar efectos secundarios
    public void updateAndNotifyUser(String user) {
        // Actualización de datos del usuario
        // Notificación al usuario
    }
    public void updateUser(String user) {
        // Actualización de datos del usuario
    }
    
    public void notifyUser(String user) {
        // Notificación al usuario
    }


    //Argumentos que no tienen ningun significado
    public void print(int a, int b) {
        // Imprime valores de a y b
    }
    //Argumento que no da lugar a errores
    public void printValues(int value1, int value2) {
        // Imprime los valores proporcionados
    }

    

}