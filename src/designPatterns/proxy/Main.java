package designPatterns.proxy;

public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage();
        image.display();
        image.display();
    }

}
