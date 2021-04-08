/*
Introducción a la programación
Universidad Fidélitas
Proyecto: Viajeros Aventure
Integrantes: Cristopher Navarro Guevara
             Yarón Hernández Chavarría
             Luis Carlos Gonzalez Ortega
 */
package viajerosaventure;

import javax.swing.JOptionPane;



public class FacturacionYcobro 
{    
      String Nombre,Telefono,Lugar,Targeta;
        int Edad,opcion;
        double Total,Subtotal,IVA;
     

       public void total () {
        Nombre = "Andrey Guzman"; Telefono = "80001"; Lugar = "Cancu";  Edad = 1; Subtotal = 2000;    
        IVA = Subtotal*0.13;
        Total = Subtotal + IVA ;
        
    }  
    
    public void Factu () {
        
            JOptionPane.showMessageDialog(null,"Facturacion del viaje","Facturacion",1);
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "-Bienvenido a Viajeros Aventure- "
                    + "\nDigite el metodo de pago que desea utilizar: "
                    + "\n1.Targeta de credito "
                    + "\n2.Targeta de debito "
                    + "\n3.Metodo de pago en Efectivo "
                    + "\n4.Factura "
                    + "\n0.Si desea salir ","Facturacion",1)); 
        
        switch(opcion) {
            case 1 :
                     Targeta = JOptionPane.showInputDialog(null,Nombre+" por favor ingrese el numero de su targeta de credito ","Facturacion",1);
                    
                break;
            case 2 :
                     Targeta = JOptionPane.showInputDialog(null,Nombre+" por favor ingrese el numero de su targeta de debito ","Facturacion ",1);
                  
            case 3 :
                    JOptionPane.showMessageDialog(null,Nombre+" El pago se realizara en el Hotel","Facturacion",1);
                break;
            case 4 :
                JOptionPane.showMessageDialog(null,
                    "Bienvenido a Viajeros Aventure "
                    + "\n  Destino  |Subtotal  |  IVA     | Total "
                    + "\n "+ Lugar+"    | "+Subtotal+ "   | " +IVA +"   | "+Total   
                    + "\n "); 
                break;
        }
        }while(opcion!=0);
    }
    
    
}
