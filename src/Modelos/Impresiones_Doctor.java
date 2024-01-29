
package Modelos;

import javax.swing.JTable;

public interface Impresiones_Doctor {
    
    String[] encabez={"id_user_medico","usuario_medico","contraseña_medico","nombres_medico","apellidos_medico","sede,celular_medico",
                      "especialidad_medico","correo_medico","fecha_creacion","fecha_creacion"};
    public void Imprimir(JTable dtm);      
}
