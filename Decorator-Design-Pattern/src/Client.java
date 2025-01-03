public class Client {

    public static void main(String[] args) {

        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecorator cd1 = new ConcreteDecorator();
        cd1.setCom(cc);
        cd1.doJob();
        System.out.println("**************");

        ConcreteDecoratorTwo cd2 = new ConcreteDecoratorTwo();
        cd2.setCom(cd1); // adding the results from cd1
        cd2.doJob();
    }
}
