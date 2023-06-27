package solid.O;

public class ShareInLinkedin implements Share{
    @Override
    public void share(Blog blog) {
        System.out.println("Blog was shared in Linkedin");
    }
}
