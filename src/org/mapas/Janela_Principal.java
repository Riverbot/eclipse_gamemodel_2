package org.mapas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

import org.interfaces.IDesenhavel;

public class Janela_Principal extends JPanel implements MouseInputListener{
    private static final int D_W = 400;
    private static final int D_H = 400;
    private Point mousePos = new Point();

    List<IDesenhavel> desenhaveis;
    public Janela_Principal(List<IDesenhavel> desenhaveis) {
        this.desenhaveis = desenhaveis;
        addMouseListener(this);
    }

    public Point getMousePos(){
        return this.mousePos;
    }

    private void setMousePos(Point mousePos){
        this.mousePos = mousePos;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (IDesenhavel d : desenhaveis) {
            d.desenha(g);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(D_W, D_H);
    }

	public void mouseClicked(java.awt.event.MouseEvent e) {
	}

	public void mousePressed(java.awt.event.MouseEvent e) {
		this.setMousePos(e.getPoint()); 
	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
		
	}

	public void mouseEntered(java.awt.event.MouseEvent e) {
		
	}

	public void mouseExited(java.awt.event.MouseEvent e) {
		
	}

	public void mouseDragged(java.awt.event.MouseEvent e) {
		
	}

	public void mouseMoved(java.awt.event.MouseEvent e) {
		
	}
}