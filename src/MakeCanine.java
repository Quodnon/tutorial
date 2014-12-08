/**
 * Created by quodnon on 12/8/14.
 */
public class MakeCanine {
    public void go()
    {
        Canine c;
        c = new Dog();
       // c = new Canine();
        c.roam();
        c.eat();
        Dog dof1 = new Dog();
        MyDogList list = new MyDogList();
        list.add(dof1);
        list.add(dof1);
        list.add(dof1);
        list.add(dof1);
        list.add(dof1);
    }
}
