public interface Command
{
    void execute();
    // could add an undo or redo commands here and then add some state to the
    //concrete command implementation
}

// we are gonna have concrete implementations for each one the receiver actions
// (methods) which are opening closing and writing
class OpenFileCommand implements Command
{
   private FileSystemReceiver fileSystem;
    // we could store previous state for undo.

    public OpenFileCommand(FileSystemReceiver fs)
    {
        fileSystem = fs;

    }

    @Override
    public void execute() {
        // save previous state, in case undo called
        this.fileSystem.openFile();
    }
    public void undo()
    {
        //restore the previous state that is saved in case sth happens.
        // myMemberVariable = previousState;
    }
}

class CloseFileCommand implements Command
{
    private FileSystemReceiver fileSystem;
    // we could store previous state for undo.

    public CloseFileCommand(FileSystemReceiver fs)
    {
        fileSystem = fs;

    }

    @Override
    public void execute() {
        // save previous state, in case undo called
        this.fileSystem.closeFile();
    }
    public void undo()
    {
        //restore the previous state that is saved in case sth happens.
        // myMemberVariable = previousState;
    }
}

class WriteFileCommand implements Command
{
    private FileSystemReceiver fileSystem;
    // we could store previous state for undo.

    public WriteFileCommand(FileSystemReceiver fs)
    {
        fileSystem = fs;

    }

    @Override
    public void execute() {
        // save previous state, in case undo called
        this.fileSystem.writeFile();
    }
    public void undo()
    {
        //restore the previous state that is saved in case sth happens.
        // myMemberVariable = previousState;
    }
}
