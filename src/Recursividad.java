public class Recursividad {
    public int factorial(int n){
        System.out.println("Calculando  factorial de:" + n);
        //Caso base: n sea 0!  y !1 son iguales a 1
        if (n == 0 || n == 1) {
            System.out.println("Caso base alcanzado el factorial de "+n+" es 1");
            return 1; 
    }
    int resultado = n*factorial(n-1);
    System.out.println("Resulatdo parcial para" +n+ "factorial("+(n-1)+")="+resultado);
    return resultado;
    }


//Calcula la suam de los nuemros consecutivos 
// n= 5 resultado =5+4+3+2+1=15
    public int sumaConsecutivos(int n ){
        if (n==1){
            return 1;
        }
        return n+sumaConsecutivos(n-1);
    }
// Calcula la potencia de un numero
    public int potencia (int base, int exp){
        //Caso base
        if (exp==0){
            return 1;
        }
        return base*potencia(base,exp-1);
    }

//crear un metodo que seume los digitos de un numero, si mando 456 = 15
//4+5+6=15
public int sumaDigitos(int n ){
    //Caso base
    if (n<10){
        return n;
        }
        return n%10+sumaDigitos(n/10);
    }

    // Serie fibonacci
    public int fibonacci(int n){
        //casos base: if and else
        //if de una sola lin
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);

        /*if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
        /* */} 
}

