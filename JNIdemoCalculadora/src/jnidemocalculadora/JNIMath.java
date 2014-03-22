/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jnidemocalculadora;
/**
 *
 * @author les
 */

public class JNIMath {
    //Metodo nativo de suma 
    public native double sumaNativa(double num1,double num2);
    //Metodo nativo de resta
    public native double restaNativa(double num1,double num2);
    //Metodo nativo de multiplicacion
    public native double multiplicacionNativa(double num1,double num2);
    //Metodo nativo de division
    public native double divisionNativa(double num1,double num2);
    
    // Carga la libreria JNIMath.so 
    public static boolean loadLibrary(String Path) {
        try{
     System.load(Path);
        return true;
        }
        
        catch(UnsatisfiedLinkError e){
        return false;
        }
    }
    
}
