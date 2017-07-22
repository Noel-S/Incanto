package Salon;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author noel
 */
public class Venta {
    Conexion con=new Conexion();
    public void Nventa(int id,String tipo, float monto){
        String SQL="insert into ventas values(id,"+id+",'"+tipo+"',"+monto+",'"+fecha()+"');";//quitar id
        con.insertSQL(SQL);
    }
    private String fecha(){
        Date d=new Date();
        SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd");
        return df.format(d);
    }
}
