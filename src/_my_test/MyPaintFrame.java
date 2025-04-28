package _my_test;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {

    private MyPanel myPanel;

    public MyPaintFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("MyPaintFrame");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myPanel = new MyPanel();
    }

    private void setInitLayout() {
        super.add(myPanel);
    }

    static class MyPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawLine(150,50,90,110);
            g.drawLine(150,50,210,110);
            g.drawRect(100,100,100,100);
            g.drawRect(160,120,20,20);
            g.drawLine(170,120,170,140);
            g.drawLine(160,130,180,130);

            for (int i = 0; i < 30; i++) {
                g.drawLine(i*10,5,150,50);
                g.drawLine(400,i*5,200,200);
            }
            for (int i = 0; i < 11; i++) {
                g.drawRect(10,300,i*10,i*10);
            }
        }
    } // end of static inner class

    public static void main(String[] args) {
        new MyPaintFrame();
    } // end of main

}
