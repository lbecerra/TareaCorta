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
// Clase Controlador que hereda de JNIMath
public class Controlador extends JNIMath{
    private String Path;
    
    //Metodo que valida la ruta donde se encuentra la libria JNIMath.so para poder cargarla.
    public boolean ConfirmPath(String NewPath){
       
        Path=NewPath;
        
        if(loadLibrary(Path))
            return true;
        else
            return false;
    }
    //Metodo que valida que los valores ingresados son numeros
    public boolean ConfirmJT(String JT1,String JT2){
        try{
        double NewJT1=Double.parseDouble(JT1);
        
        double NewJT2=Double.parseDouble(JT2);
        return true;
        }
        catch(Exception e){
        return false;
        
        
    }
        
    }
    
}
