//Recursividad
//Caso base: conodcion que estabelce caundo se debe detener la recursion y da el resultadp dorecto
//Caso recursivo: llamada a la funcion misma para resolver 
//el problema en un subprbolema mas pequeño.la recursion continua hasta que se alcanza el caso base y da el resultado final
//si llamo a la funcion con los mismos argumentos no se va allegar a la respuesta
//permite abordar el mismo problema en subproblemas mas pequeños y mas manejables,
// si el if tiene return ta no es necesario el else
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
        
    Recursividad rs= new Recursividad();
    int resultado =rs.factorial(5);
    System.out.println(resultado);
    System.out.println(rs.sumaConsecutivos(5));
    System.out.println(rs.potencia(2,4));
    System.out.println(rs.sumaDigitos(456));
    }
}
