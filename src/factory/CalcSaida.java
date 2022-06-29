/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author kaiov
 */
public class CalcSaida {

    public float calc(int entrada){
        float z=entrada;
        float x = (float) 6.00;
        float y = (float) 4.00;
        float valor;
        
        if(z>1){
            float valorap= valor=x+((z-1)*y);
            return valorap;
            
        }
        else{
            valor=x;
            return valor;
        }
        
        
    }
}
