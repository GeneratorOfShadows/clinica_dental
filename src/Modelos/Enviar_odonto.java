/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelos;

import DAO.Conexion_odontograma;
import Vistas.Enviar_odontograma;

/**
 *
 * @author aless
 */
public class Enviar_odonto {
    public static Conexion_odontograma conexion = new Conexion_odontograma();
    
    public static void main(String[] args) {                
        System.out.println("Conectado: "+conexion.crearConexion());
        Enviar_odontograma od=new Enviar_odontograma();
        od.setVisible(true);
        
        
    }
    
}
