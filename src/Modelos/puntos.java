/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.LinkedList;

/**
 *
 * @author aless
 */
public class puntos {
    LinkedList <Integer> PuntosX = new LinkedList();
    LinkedList <Integer> PuntosY = new LinkedList();
    public void GuardarPuntos(int x, int y){
        PuntosX.add(x);
        PuntosY.add(y);
    }
    public LinkedList <Integer> listax(){
        
        return PuntosX;
    }
    public LinkedList <Integer> listay(){
        
        return PuntosY;
    }
    
    public void VaciarLista(){
        while(!PuntosX.isEmpty()){
            PuntosX.remove();
            PuntosY.remove();
        }
    }
    
}
