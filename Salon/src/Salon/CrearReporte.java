package Salon;

import java.io.File;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class CrearReporte {
    String Path;
    String tipo;
    
    public CrearReporte(String tipo) {
        this.tipo=tipo;
        Path="C:\\Users\\"+System.getProperty("user.name")+"\\Documents\\Incanto Reportes\\"+this.tipo+"\\";
    }
    
//    public void pdfChooser(String f){//Preguntar
//        String PATH="";
//        JasperReport jasperReport;
//        JasperPrint jasperPrint;    
//        JFileChooser fileChooser = new JFileChooser("C:\\Users\\Noel\\Desktop\\Prueba reportes");
//        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("todos los archivos *.PDF", "pdf", "PDF"));//filtro para ver solo archivos .pdf
//        fileChooser.setSelectedFile(new File("Reporte Clientes "+f+".pdf"));
//        int seleccion = fileChooser.showSaveDialog(null);
//        try{
//            if (seleccion == JFileChooser.APPROVE_OPTION) {//comprueba si ha presionado el boton de aceptar
//                File JFC = fileChooser.getSelectedFile();
//                PATH = JFC.getAbsolutePath();//obtenemos la direccion del archivo + el nombre a guardar
//                //comprobamos si a la hora de guardar obtuvo la extension y si no se la asignamos
//                if (!(PATH.endsWith(".pdf"))) {
//                    File temp = new File(PATH + ".pdf");
//                    JFC.renameTo(temp);//renombramos el archivo
//                }
//            }
//          //se carga el reporte
//            URL  in=this.getClass().getResource( "rClientes.jasper" );
//            jasperReport=(JasperReport)JRLoader.loadObject(in);
//          //se procesa el archivo jasper
//            jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(), new Conexion().cadena_Conexion() );
//          //se crea el archivo PDF
//            JasperExportManager.exportReportToPdfFile( jasperPrint, PATH);
//            JOptionPane.showMessageDialog(null, "Documento Exportado Exitosamente!", "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
//        }catch (JRException ex){
//            System.err.println( "Error iReport: " + ex.getMessage() );
//        }
//    }
    public void pdf(String f){
        String PATH=rutaFecha()+"Reporte "+this.tipo+" "+f+".pdf";
        JasperReport jasperReport;
        JasperPrint jasperPrint;                
        try {
            URL  in = this.getClass().getResource( "r"+this.tipo+".jasper" );
          //se carga el reporte
            jasperReport=(JasperReport)JRLoader.loadObject(in);
            //se procesa el archivo jasper
            jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(), new Conexion().cadena_Conexion());
            //se crea el archivo PDF
            JasperExportManager.exportReportToPdfFile( jasperPrint, PATH);//Fecha y directorio
            if (this.tipo.equals("Clientes")) {
                JOptionPane.showMessageDialog(null, "Documento Exportado Exitosamente!", "Guardado exitoso!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (JRException ex)
        {
          System.err.println( "Error iReport: " + ex.getMessage() );
        }
    }
    
    String rutaFecha(){
        Calendar c=new GregorianCalendar();
        int Y=c.get(Calendar.YEAR);
        String M=mes(c.get(Calendar.MONTH));
        
        Path = Path+Y+"\\"+M;
        File Mes=new File(Path);
        if (!Mes.exists()) {
            Mes.mkdirs();
            return Path+"\\";
        }else{
            //System.out.println(Path+"\\");
            return Path+"\\";
        }
    }
    private String mes(int a) {
        switch(a+1){
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
        }
        return null;
    }
    
}
