public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Saher");
        User user2 = new UserImpl(mediator, "Ahmed");
        User user3 = new UserImpl(mediator, "Adam");
        User user4 = new UserImpl(mediator, "Hameed");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi Students");
    }

}
