/**
 * Created by quodnon on 08.12.14.
 */
import org.omg.PortableServer._ServantLocatorStub;

import  java.*;
import  java.io.*;
public class tutorial {
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
    }
}
