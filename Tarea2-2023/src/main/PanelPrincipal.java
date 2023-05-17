package main;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Image;
import java.io.IOException;

class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
	//private PanelComprador com;
	private PanelExpendedor exp;
    //private PanelComprador com;
    public PanelPrincipal (Expendedor x) {
        //com=new PanelComprador();
		exp = new PanelExpendedor(x.cantidadproduct());
		this.add(exp);
		this.setBackground(Color.white);
	}
	@Override
	public void paint (Graphics g) { //todo se dibuja a partir de este método
		super.paint(g);
		exp.paintComponent(g);

	}
}	
	
	class PanelExpendedor extends JPanel{
		private int cantidad,z=700;
		private Image coquita,sprite,super8,trencito;
		private Image loadImage1(String fileName) {
			try {
				return ImageIO.read(new File("cocafinal.png"));
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
		private Image loadImage2(String fileName) {
			try {
				return ImageIO.read(new File("sprite.png"));
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
		private Image loadImage3(String fileName) {
			try {
				return ImageIO.read(new File("super8.png"));
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
		private Image loadImage4(String fileName) {
			try {
				return ImageIO.read(new File("trencito.png"));
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
		public PanelExpendedor(int num){
			cantidad=num;
			coquita=loadImage1("cocafinal.png");
			sprite=loadImage2("sprite.png");
			super8=loadImage3("super8.png");
			trencito=loadImage4("trencito.png");
		}
	@Override
    public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics gd=g;
		// Pinta el rectángulo del expendedor en rojo
		gd.setColor(Color.RED);
		gd.fillRect(750, 100, 200, 300);
		gd.setColor(Color.LIGHT_GRAY);
		gd.fillRect(767,118,168,252);
		gd.setColor(Color.BLACK);
		gd.setFont(new Font("Arial", Font.BOLD, 16)); // Establece la fuente y tamaño del texto
		gd.drawString("Expendedor", 800, 114); // Dibuja el texto en la posición especificada
		gd.setColor(Color.BLACK);
		gd.drawLine(767,165,935,165);
		gd.setColor(Color.BLACK);
		gd.drawLine(767,222,935,222);
		gd.setColor(Color.BLACK);
		gd.drawLine(767,279,935,279);
		gd.setColor(Color.BLACK);
		gd.drawLine(767,336,935,336);
		for(int i=0;i<cantidad;i++) {
			gd.drawImage(coquita,z,120,null);
			gd.drawImage(sprite,z,169,null);
			gd.drawImage(super8,z,230,null);
			gd.drawImage(trencito,z,285,null);
			z=z+17;
		}
    }

	}
    /*class PanelCOmprador extends Jpanel{

    }*/
