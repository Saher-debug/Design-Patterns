public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("somefilename.jpg");
        image.display();
        System.out.println("");

        image.display();

    }
}
