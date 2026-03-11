public class App {
    public static void main(String[] args) throws Exception {
        int x = 23;
        int y;

        y = 43;

        boolean isTrue = true;

        String texto2 = "Hola mundo";

        // Practico con variables

        // 1 Crear una variable de tipo entero, llamada “caja” y que guarde el número 90.
        int caja = 90;

        // 2 Modificar la variable llamada “caja” para que guarde la mitad de su valor original.
        caja = caja / 2;

        // 3 Crear la variable de tipo entero llamada “pote” que guarde el valor de “caja” más 10.
        int pote = caja + 10;
        
        // 4 Crear la variable de tipo entero llamada “tarro” la cual guarde la mitad del valor de la suma entre la variable “caja” y “pote”.
        int tarro = (caja + pote) / 2;

        // 5 Crear una última variable de enteros llamada “todo” que guarde la suma de las otras 3 variables anteriores.
        int todo = caja + pote + tarro;

        // 6 Imprima en pantalla los valores de las 4 variables.
        System.out.println(caja);
        System.out.println(pote);
        System.out.println(tarro);
        System.out.println(todo);

        // 7 Imprima el valor de “todo” pero multiplicado por 4.
        System.out.println(todo * 4);

        // 8 Restar a la variable “todo” el valor de “caja” dos veces.
        todo = todo - (caja * 2);

        // 9 Imprimir el resto de dividir la variable “todo” entre 3.
        System.out.println(todo / 3);

        // 10 Crear una variable de tipo String llamada “texto” que guarde un mensaje que usted elija.
        String texto = "Gabriel";

        // 11 Crear una variable de tipo String llamada “saludo” que guarde “Hola, muy buenos días “
        String saludo = "Hola, muy buenos días";

        // 12 Crear una variable llamada “mensajeCompleto” la cual contenga primero el “saludo” y luego el “texto” de las últimas 2 variables utilizadas.
        String mensajeCompleto = String.format("%s %s", saludo, texto);

        // 13 Finalmente imprimir la variable “mensajeCompleto”
        System.out.println(mensajeCompleto);
    }
}
