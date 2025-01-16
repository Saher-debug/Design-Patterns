import java.awt.*;

public class Originator {
    // file writer util
    // this is the object that we are gonna save it's state
    // will user an inner class for it's memento
    // we don't have to make it inner class but it keeps it private
    //
    private String filename;
    private StringBuilder content;
    public Originator(String file){
        this.filename = file;
        this.content = new StringBuilder();

    }
    @Override
    public String toString(){
        return this.content.toString();
    }
    public void write(String str){
        content.append(str);
    }
    // we want to create the memento
    public Memento save() {
        return new Memento(this.filename, this.content);
    }
    // restore into its earlier state
    public void undoToLastSave(Object obj){
        Memento memento = (Memento) obj;
        this.filename = memento.filename;
        this.content = memento.content;
    }
    private class Memento{
        // it mimicks what is inside our class.
        private String filename;
        private StringBuilder content;
        public Memento(String file, StringBuilder content) {
            this.filename = file;
            this.content = new StringBuilder(content);
        }
    }

}
