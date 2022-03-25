/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author HP
 */
public class Cordoba extends Monedas{
              
   float cordoba;
    

    
    public Cordoba(){
  
    }
    
      
        public void setResultado(float _cordoba, int _cantidad){
        this.cordoba=_cordoba;
        this.cantidad=_cantidad;
    }
    
         
   public float getResultado(){
        resul=(float) cantidad*cordoba;
        return resul;

    }
   
      @Override
   public String getInfor(){
       return "Ha Convertido Cordobas";
   }
       
}
