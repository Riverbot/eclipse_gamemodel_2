package org.mapas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import org.interfaces.IDesenhavel;

class Circulo implements IDesenhavel{
    private Point point = new Point();
    private int velocidade;
    private int x2 = 0;
    private int y2 = 0;

    public Circulo(int x, int y) {
        point.setLocation(x, y);
        velocidade = 5;
    }

    public void desenha(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(point.x-10, point.y-10, 20, 20);
        g.setColor(Color.GREEN);
		g.drawLine(point.x, point.y, x2, y2);
    }

	public void segue(Point p) {
        x2 = p.x;
        y2 = p.y;

        double dx = p.x - point.x;
        double dy = p.y - point.y;
        double mag = Math.sqrt(dx*dx + dy*dy);

        dx = dx * 5 / mag;
        dy = dy * 5 / mag;

        if (mag < 3){
            point.x = point.x;
            point.y = point.y;
        }
        else{
            point.x += dx;
            point.y += dy;
        }
	}
}