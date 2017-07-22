package Salon;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Noel
 */
public class Cliente {
    //Atributos
    Conexion e=new Conexion();
    private final String nombre,apellidos,correo,cumpleaños,telefono;
    private final float deuda;
    
    Cliente(String nom, String ape, String tel, String cor, String cum, float deuda){
        this.nombre=nom;
        this.apellidos=ape;
        this.telefono=tel;
        this.correo=cor;
        this.cumpleaños=cum;
        this.deuda=deuda;
    }
    public boolean Comparar(){
        String SQL = "SELECT * FROM clientes WHERE nombre='"+this.nombre+"' AND apellidos='"+this.apellidos+"';";
        try {
            if (e.consulta(SQL).next()) {
                JOptionPane.showMessageDialog(null, "El cliente que quiere agregar ya exixte.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public void registrarSQL(){
        if (Comparar()) {
            String SQL = "insert into clientes values(id,'"+this.nombre+"','"+this.apellidos+"','"+this.telefono+"','"+this.correo+"','"+this.cumpleaños+"',"+this.deuda+");";
            try {
                if (e.insertSQL(SQL)==1) {
                    JOptionPane.showMessageDialog(null, "Cliente Agregado Correctamente", "Sucess", JOptionPane.INFORMATION_MESSAGE);
                    if (this.deuda>0.0f) {
                        registrarVenta();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Hubo un error al agregar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch (HeadlessException ex) {
                Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void registrarVenta() {
        try {
            ResultSet rs=e.consulta("SELECT * FROM clientes ORDER BY id DESC LIMIT 1;");
            if (rs.next()) {
                new Venta().Nventa((int)rs.getObject(1),"Credito", this.deuda);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
