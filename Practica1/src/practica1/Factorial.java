package practica1;

/**
 *
 * @author Anibal Gramajo - 200924518
 */
public class Factorial {
    
    static int factorial(int numero){
        
        if(numero <= 1){
            return 1;
        }else{
            return numero*(factorial(numero-1));
        }
    
    }
    
}
