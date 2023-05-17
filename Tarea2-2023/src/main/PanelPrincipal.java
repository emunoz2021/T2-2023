package main;
import java.awt.*;
import javax.swing.*;


class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
	//private PanelComprador com;
	private PanelExpendedor exp;
    //private PanelComprador com;
    public PanelPrincipal (Expendedor x) {
        //com=new PanelComprador();
		exp = new PanelExpendedor(x.cantidadproduct());
		setLayout(null);
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
		private int cantidad,z=0;
		private ImageIcon coquita,sprite,super8,trencito;
		public PanelExpendedor(int num){
			cantidad=num;
			coquita=new ImageIcon("cocafinal.png");
			sprite=new ImageIcon("sprite.png");
			super8=new ImageIcon("super8.png");
			trencito=new ImageIcon("trencito.png");
			setLayout(null);

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
		for (int i = 0; i <cantidad; i++) {
			gd.drawImage(coquita.getImage(), 600+z, 120,null);
			gd.drawImage(sprite.getImage(), 600+z, 169,null);
			gd.drawImage(super8.getImage(), 600+z, 230,null);
			gd.drawImage(trencito.getImage(), 600+z, 285,null);
			z+=17;
		}
    }

	}
    /*class PanelCOmprador extends Jpanel{

    }*/
