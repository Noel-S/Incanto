package Salon;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    public Connection cadena_Conexion(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/salon?autoReconnect=true&useSSL=false","root","sasa");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("No");
        }
        return con;
    }
    
    public ResultSet consulta(String SQL){
        Connection con=cadena_Conexion();
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(SQL);
            System.out.println(SQL);
            return rs;    
        }catch(SQLException e){
            System.out.println("no se pudo");
        }
        return null;
    }
    
    public int insertSQL(String SQL){
        int filasafectadas=0;
        try {
            Connection con=cadena_Conexion();
            Statement insert=con.createStatement();
            filasafectadas=insert.executeUpdate(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filasafectadas;
    }
}

/*insert into clientes values('Nombre Cliente','Apellidos','3123123123','correo@correo.com','1998-09-10');
  UPDATE clientes SET	cumpleanyos='1990-09-10' WHERE id=1

  SELECT * FROM clientes
  drop table clientes*/

