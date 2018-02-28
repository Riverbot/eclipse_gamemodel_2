package org.mapas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.interfaces.IDesenhavel;
import org.mapas.Mapa_1;

public class App {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();

        List<IDesenhavel> ds = new ArrayList<IDesenhavel>();
        
        Mapa_1 m = new Mapa_1();
        Circulo c = new Circulo(340, 340);

        ds.add(m);
        ds.add(c);

        //futuro switch case para outras telas
        Janela_Principal principal = new Janela_Principal(ds);

        frame.add(principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //In Game Loop
        while (true){

            //Controla eventos
            c.segue(principal.getMousePos());

            //Desenha na Tela
            principal.repaint();
            Thread.sleep(10);
        }
    }
}