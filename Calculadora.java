/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Espabila un poco crack*/
/*Cambio de rama y modificacion desde consola*/
package calculadora;
/*que pasa bro*/
/**
 *
 * @author redes
 */
/*Como se encuentra mi pana*/
/*Prueba de git*/
public class Calculadora {
    private int num1;
    private int num2;
    
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    //Comentario desde el IDE
    public int suma(){
        int result=num1+num2;
        return result;
    }
    //Comentario desdes Github
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
    //Comentario para ramaIDE    
    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
    
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    public int divide(){
        int result=num1/num2;
        return result;
    }
    
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }

     public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
    */
}
