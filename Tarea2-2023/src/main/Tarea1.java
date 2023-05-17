package main;
import javax.swing.*;
/**
*Clase main, se usara para instanciar las otras clases respectivas y darle funcionalidad al codigo en conjunto
*/
public class Tarea1 {

    public static void main(String[] args) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        Expendedor exp = new Expendedor(4);
        Moneda m = null;
        Comprador c = null;
        System.out.println("Precios productos: ");
        System.out.println("Cocacola: " + Expendedor.precioCoca);
        System.out.println("Sprite: " + Expendedor.precioSprite);
        System.out.println("Super8: " + Expendedor.precioSuper8);
        System.out.println("Trencito: " + Expendedor.precioTrencito + "\n");
//-----con dinero JUSTO para el precio y y si esta vacio retorna una exception, usamos try-catch para imprimir un msg-----
        try {
            m = new Moneda1000();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// cocacola $100
            m = new Moneda1000();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// cocacola $100
            m = new Moneda1000();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// cocacola $100
            m = new Moneda1000();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// cocacola $100
            m = new Moneda1000();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queDegustaste() + ", " + c.cuantoVuelto());// cocacola $100
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage() + ", se le devolvera su moneda: " + exp.getVuelto().getValor());
        }
        JFrame frame = new JFrame("Tarea2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setVisible(true);  
        PanelPrincipal panel=new PanelPrincipal(exp);
        frame.add(panel);
    }
} 
