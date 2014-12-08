/**
 * Created by quodnon on 08.12.14.
 */
import  java.*;
import  java.io.*;
public class tutorial {
    public  static void main(String [] args){
        System.out.println("Hello wordl");
        MakeCanine s=new MakeCanine();
        s.go();
        MyAnimalList alist = new MyAnimalList();
        Dog d = new Dog();
        Cat df = new Cat();
        alist.add(d);
        alist.add(df);
        alist.add(d);
        alist.add(df);;
    }
}
