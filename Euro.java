/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author HP
 */
public class Euro extends Monedas {
       
       float euro;
   
        
    public Euro(){
   
    }
    
        public void setResultado(float _euro, int _cantidad){
        this.euro=_euro;
        this.cantidad=_cantidad;
    }
    
         
    public float getResultado(){
        resul=(float) cantidad*euro;
        return resul;

    }
   
       @Override
   public String getInfor(){
       return "Ha Convertido Euros";
   }
       
    

    
}
