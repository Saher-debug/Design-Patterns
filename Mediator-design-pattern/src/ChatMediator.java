import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {
    public void sendMessage(String msg, User user);
    void addUser(User user);
}



// our concrete mediator

class ChatMediatorImpl implements ChatMediator
{
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user)
    {
      this.users.add(user);
    }
    @Override
    public void sendMessage(String msg, User user)
    {
      for (User u: this.users)
      {
          if(u != user)
          {
              u.receive(user.name ,msg);
          }
      }
    }
}