public interface Flyweight {
 void print();
}

class ConcreteFlyweight1 implements Flyweight{
    @Override
    public void print()
    {
        System.out.println("This is the first concrete flyweight");
    }
}


class ConcreteFlyweight2 implements Flyweight{
    @Override
    public void print()
    {
        System.out.println("This is the second concrete flyweight");
    }
}