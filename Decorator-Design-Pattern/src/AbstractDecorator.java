


abstract class AbstractDecorator extends Component {
    protected Component com;

    public void setCom(Component c){
        com = c;

    }
    public void doJob(){
      if(com != null){
          com.doJob();
      }

    }

}

class ConcreteDecorator extends AbstractDecorator {
    public void doJob() {

        super.doJob();
        //let's add the additional responsibilities
        System.out.println("I am adding some functionality");


    }
}
class ConcreteDecoratorTwo extends AbstractDecorator {
    public void doJob(){

        super.doJob();

        //let's add the additional responsibilities
        System.out.println("I am adding even more functionality");


    }
}