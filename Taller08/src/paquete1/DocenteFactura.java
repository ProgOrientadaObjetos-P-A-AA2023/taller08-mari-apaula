/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA H
 */
public class DocenteFactura extends Docente {

    private double vfactura;
    private double iva;
    private double valorCancelar;

    public double obtenerVfactura() {
        return vfactura;
    }

    public void establecerVfactura(double vfactura) {
        this.vfactura = vfactura;
    }

   

    public double obtenerIva() {
        return iva;
    }

    public void establecerIva() {
        this.iva = (vfactura * 12)/100;
    }
    
    

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public void establecerValorCancelar() {
        this.valorCancelar = vfactura - iva;
    }
    
    
    
    @Override
    public String toString(){
        String reporte = String.format("Del docente %s con numero de cédula %s contiene la siguiente información\n"
                + "Valor factura: %.2f\n"
                + "Valor iva descuento: %.2f\n"
                + "Valor cancelar: %.2f\n",
                obtenerNombres(),obtenerCedula(),
                obtenerVfactura(),
                obtenerIva(),
                obtenerValorCancelar());
        
        return reporte;
    }

}
