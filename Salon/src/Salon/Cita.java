package Salon;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Noel
 */
public class Cita {
    Conexion e=new Conexion();
    String nombre,apellidos, asunto, fecha, hora;
    public Cita(String nombre, String apellidos, String asunto, String fecha, String hora) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asunto = asunto;
        this.fecha = anioActual()+"-"+fecha;
        this.hora = hora;
    }
    
    public static int anioActual(){
        Calendar anio = Calendar.getInstance();
        int a=anio.get(Calendar.YEAR);
        return a;
    }
    
    public boolean Comparar(){
        String SQL = "SELECT * FROM citas WHERE fecha='"+this.fecha+"' AND hora='"+this.hora+"'";
        try {
            if (e.consulta(SQL).next()) {
                JOptionPane.showMessageDialog(null, "La fecha y hora ya estan ocupadas.\nConsulte sus citas.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public void registrarSQL(){
        if (Comparar()) {
            String SQL = "insert into citas values('"+this.nombre+"','"+this.apellidos+"','"+this.asunto+"','"+this.fecha+"','"+this.hora+"');";
            try {
                if (e.insertSQL(SQL)==1) {
                    JOptionPane.showMessageDialog(null, "Cita Agregada Correctamente", "Sucess", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Hubo un error al agregar la cita", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch (HeadlessException ex) {
                Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
