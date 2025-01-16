public class Caretaker {
    private Object object;
    public void save(Originator originator){
        this.object = originator.save();
    }
    public void undo(Originator originator){
        originator.undoToLastSave(object);
    }
}
