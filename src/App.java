//Recursividad
//son llamadas al mismo metodo
//Caso base: conod que establece cuando se debe detener la recursion y da el resultado directo
//Caso recursivo: llamada a la funcion misma para resolver 
//el problema en un subprbolema mas pequeño.la recursion continua hasta que se alcanza el caso base y da el resultado final
//si llamo a la funcion con los mismos argumentos no se va allegar a la respuesta
//permite abordar el mismo problema en subproblemas mas pequeños y mas manejables,
// si el if tiene return ya no es necesario el else
// path absoluta: desde el inicio de la unidad C:/User/ y relativa :/(testhijo) carpeta desde donde estoy  
/*public static int factorial(int n){
    if(n==0){
        return 1;

    }else{
        factorial(n-1);
    }
    return factorial(n);
}*/ 

public class App {
    public static void main(String[] args) throws Exception {
        
    /*Recursividad rs= new Recursividad();
    int resultado =rs.factorial(5);
    System.out.println(resultado);
    System.out.println(rs.sumaConsecutivos(5));
    System.out.println(rs.potencia(2,4));
    System.out.println(rs.sumaDigitos(456));
    System.out.println(rs.fibonacci(1));*/

    RenombrarDirectorios rd = new RenombrarDirectorios();
    rd.renombrarDir("src/directorios");
    }
}
