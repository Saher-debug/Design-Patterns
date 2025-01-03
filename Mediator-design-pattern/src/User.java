abstract class User {
    protected  ChatMediator mediator;
    protected String name;

    public User(String name, ChatMediator med) {
        this.mediator = med;
        this.name = name;

    }
    public abstract void send(String msg);
    public abstract void receive(String sender, String msg);

}

class UserImpl extends User {
    public UserImpl(ChatMediator med, String name)
    {
        super(name, med);

    }
    @Override
    public void send(String msg)
    {
        System.out.println(this.name + ": sending message: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String sender, String msg)
    {
        System.out.println(this.name+ ": Received message: " + msg + " from " + sender);
    }
}