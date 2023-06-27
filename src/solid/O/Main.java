package solid.O;

public class Main {
    public static void main(String[] args) {
        var blog=new Blog(1,"Blog","shortDesc","description");
        Share share=new ShareInMedium();
        share.share(blog);
    }

}
