
package Modelos;

import javax.swing.table.DefaultTableModel;

interface Impresiones_Doctor2 {
    String[] encabez={"Num","Código", "Nombre","Apellido","Correo","Telefono","Sede","Descripciòn","Especialidad"};
    public void Imprimir2(DefaultTableModel dtm);
}
