/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author HP
 */
public class Lempiras extends Monedas{
        float lps;
   
        
    public Lempiras(){
   
    }
    
        public void setResultado(float _lps, int _cantidad){
        this.lps=_lps;
        this.cantidad=_cantidad;
    }
    
         
    public float getResultado(){
        resul=(float) cantidad*lps;
        return resul;

    }
   
       @Override
   public String getInfor(){
       return "Ha Convertido Lempiras";
   }
       
}
