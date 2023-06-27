package listremove;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        var hashset=new HashSet<String>();
       /* for (int i=0;i<3;i++){
            hashset.add("test"+i);
        }*/
        hashset.add("test1");
        hashset.add("test2");
        hashset.add("test3");
        System.out.println(hashset);
        Iterator<String> iterator=hashset.iterator();
        int index=0;
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(index);
            index++;
        }

    }
}
