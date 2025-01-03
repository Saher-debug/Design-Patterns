import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String, Flyweight> mapper = new HashMap<>();
    public int totalObjectsCreated()
    {
        return mapper.size();
    }
    public Flyweight getFlyweightFromFactory(String flyweightCategory) throws Exception
    {
        Flyweight myFlyweight = null;
        if (mapper.containsKey(flyweightCategory))
        {
           myFlyweight = mapper.get(flyweightCategory);
        }
        else
        {
            switch (flyweightCategory) {
                case "small":
                    System.out.println("We do not have first type flyweight. So we are creating a one");
                    myFlyweight = new ConcreteFlyweight1();
                    mapper.put("flyweight1", ConcreteFlyweight1);
                    break;

                case "large":
                    System.out.println("We do not have first type flyweight. So we are creating a one");
                    myFlyweight = new ConcreteFlyweight2();
                    mapper.put("flyweight2", ConcreteFlyweight2);
                    break;

                default:
                    throw new Exception("Robot Factory can create only small and large shapes");
            }
        return flyweightCategory;
        }
    }
}
