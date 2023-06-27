package solid.S;

public class BlogComment {
    public static int id=0;
    private int blogId;
    private int userId;
    private String text;

    public BlogComment(int blogId, int userId, String text) {
        this.blogId = blogId;
        this.userId = userId;
        this.text = text;
        this.id++;
    }

    public int getBlogId() {
        return blogId;
    }

    public int getUserId() {
        return userId;
    }

    public String getText() {
        return text;
    }
}
