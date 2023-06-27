package solid.O;

public class ShareInMedium implements Share{
    @Override
    public void share(Blog blog) {
        System.out.println("Blog was shared in Medium");
    }
}
