public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator("data.txt");

        originator.write("First set of data");
        System.out.println(originator);

        // now let's save the file
        caretaker.save(originator);

        //now we can write sth else
        originator.write(" second set of data");
        System.out.println(originator);

        //now we wanna undo this last operation
        caretaker.undo(originator);
        System.out.println(originator);

    }
}

