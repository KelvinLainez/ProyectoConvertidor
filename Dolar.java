/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author HP
 */
public class Dolar extends Monedas {
    float dolar;
    public Dolar(){
        
    }
    
        public void setResultado(float _dolar, int _cantidad){
        this.dolar=_dolar;
        this.cantidad=_cantidad;
    }
    
         
    public float getResultado(){
        resul=(float) cantidad*dolar;
        return resul;

    }
    
       @Override
   public String getInfor(){
       return "Ha Convertido Dolares";
   }

    
       
}
