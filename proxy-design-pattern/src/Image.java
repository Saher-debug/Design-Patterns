public interface Image // that is the subject: the interface that both the proxy and the real object that the proxy is meant to proxy for is gonna implement
{
    void display();
}

//real image does the actual work and it is what the proxy will have a relationship with
class RealImage implements Image
{
    private String fileName;
    public RealImage(String fileName) // constructor that sets the member variable
    {                                 // and also will try to load the disk.
       this.fileName = fileName;
       loadfromDisk(this.fileName);
    }
    @Override
    public void display()
    {
       System.out.println("Displaying " + fileName);
    }
    private void loadfromDisk(String fileName)
    {
        System.out.println("loading " + fileName);
    }
}