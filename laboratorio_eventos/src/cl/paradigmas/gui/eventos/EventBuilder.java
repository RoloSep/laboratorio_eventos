package cl.paradigmas.gui.eventos;

import cl.paradigmas.modelo.Circulo;



final public class EventBuilder {
	private EventBuilder(){}
	
	void MouseClicked(MouseEvent)¨
	{
		if (seleccionado == circulo)
		{
			Point p=e.getPoint();
			Circulo c = newCirculo(p,50);
			Canvas.addDibujable();
			Canvas.Repaint();
		}
	}
	
	void MousePresed(MouseEvent)
	{
		if(Seleccionado == linea)
		{
			inicio = e.getPoint();
			linea = new Linea(inicio, inicio);
			Canvas.setDibujabletmp(linea);
		}
	}
	
	void mouseReleased(MouseEvent)
	{
		if(Seleccionado == linea && Canvas.setDibujabletmp())
		{
			linea.setFila(e.getPoint());
			Canvas.addDibujable(linea);
			linea = null;
			Canvas.setDibujabletmp(false);
			Canvas.Repoint();
		}
	}
	public void mouseDragged(MouseEvent e)
	{
		if (ventana.getSeleccionado () == Ventana.MOVER && Canvas.getDibujoSeleccionado()!= null)
		{
			Circulo c = (Circulo)Canvas.getDibujoSeleccionado();
			c.setPosicion( e.getpoint());
			Canvas.repaint();
		}
	}
	/**
	 * Aqui se deben crear los metodos static 
	 * que devolveran los ActionListener y
	 * MouseAdapter->(MouseListener y MouseMotionListener)
	 * que marcan los eventos
	 */


