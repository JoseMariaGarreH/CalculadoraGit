/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 * @author dam
 * @version 22/23
 * @since 2023
 */
public class Calculadora {
    
    private final int num1;
    private final int num2;
    
    /**
     * @param a 
     * @param b 
     */
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    
    /**
     * @return devuelve el resultado de la suma de a y b
     */
    public int suma(){
        int result=num1+num2;
        return result; 
    }
    /**
     * 
     * @return devuelve la resta entre dos números
     */
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result; 
    }
    
    /**
     * @return compará las dos variables, y devuelve true o false 
     */
    public boolean resta2(){
        return num1 > num2;
                         
    }
    
    /**
     * @return devuelve el resultado de la multiplicación de a y b
     */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    /**
     * @return devuelve el resultado de la división de a y b
     */
    public int divide(){
        int result=num1/num2;
        return result;
    }
    
    /**
     * @return null si el cociente es cero y la división de a y b
     */
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }
    
    /**
     * @return mensaje de cociente cero si lo es y sino división de a y b
     * @throws ArithmeticException si el divisor es 0
     * @exception ArithmeticException si el divisor es 0
     */
     public int divide0(){
        if(num2==0)
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
    
}
