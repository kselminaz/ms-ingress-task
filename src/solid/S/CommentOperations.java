package solid.S;

import java.util.Iterator;
import java.util.List;

public class CommentOperations {

    public List<BlogComment> comments;

    public boolean addComment(int blogId,int userId,String text){
        if(userId!=0 && blogId!=0 && text!=null){
            comments.add(new BlogComment(blogId, userId, text));
            return true;
        }
        return false;

    }
    public boolean deleteComment(int commentId){
        Iterator<BlogComment> iterator=comments.iterator();
        while (iterator.hasNext()){
            if(iterator.next().id==commentId){
                iterator.remove();
                return  true;
            }
        }
       return false;
    }
}
