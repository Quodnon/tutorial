/**
 * Created by quodnon on 08.12.14.
 */
import com.sun.java.util.jar.pack.Attribute;
import org.omg.PortableServer._ServantLocatorStub;

import  java.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class tutorial {
    static int si=0;
    public  static void main(String [] args){
        Dog a = new Dog();
        Cat f = new Cat();
        Cat sf = new Cat();

        if(a.equals(f) ){
            System.out.print("true");

        } else {
            System.out.print("false");

        }
        System.out.print( sf.hashCode()+" "+ sf.getClass() +' '+ sf.toString());

        ArrayList<Dog> myDARList = new ArrayList<Dog>();
        Dog ds = new Dog();
        myDARList.add(ds);
        Animal dog = myDARList.get(0);
        System.out.println();
       // dog.roam();
        dog.eat();
        System.out.println("\n" + dog.getClass().toString());
        JFrame frame = new JFrame();
        JButton button = new JButton("click ");

        ActionListener func = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JButton src = (JButton) actionEvent.getSource();
                si++;
                src.setText("click "+Integer.toString(si));
                JDialog s=new JDialog();
                LayoutManager layoutManager=new LayoutManager() {
                    @Override
                    public void addLayoutComponent(String s, Component component) {

                    }

                    @Override
                    public void removeLayoutComponent(Component component) {

                    }

                    @Override
                    public Dimension preferredLayoutSize(Container container) {
                        return null;
                    }

                    @Override
                    public Dimension minimumLayoutSize(Container container) {
                        return null;
                    }

                    @Override
                    public void layoutContainer(Container container) {

                    }
                };
                s.setSize(433,443);
                s.setVisible(true);
            }
        };
        button.addActionListener(func);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);

    }
}
