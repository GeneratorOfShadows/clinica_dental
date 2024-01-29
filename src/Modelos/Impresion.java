/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelos;

import javax.swing.table.DefaultTableModel;

public interface Impresion {
    static final String[] encabez={"","Código", "Nombres","Apellidos","Correo","Telefono","Especialidad","Sede","Hora","Fecha","Comentarios"};
    public void Imprimir(DefaultTableModel dtm);      
}
