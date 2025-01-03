public class Client {
    public static void main(String[] args) {
        //create the reciever
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
        // create the command with the associated receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        // create the invoker and associate that with the command
        FileInvoker file = new FileInvoker(openFileCommand);
        //perform action on invoker object
        file.execute();


        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();

    }

}
