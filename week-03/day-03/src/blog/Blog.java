package blog;


import java.util.ArrayList;
import java.util.List;

public class Blog {

  public static void delete(int i) {
    posts.remove(i);
  }

  public static void update(int i, BlogPost post) {
    posts.add(i, post);
  }


  public static void main(String[] args) {
    initPosts();
    delete(1);
  }

  static List<BlogPost> posts = new ArrayList<BlogPost>();

  static void initPosts(){
    posts.add(new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04."));
    posts.add(new BlogPost("Tim Urban", "Wait but why",
            "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10."));
    posts.add(new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, " +
            "a cybersecurity engineer at IBM, doesn’t want " +
            "to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he" +
            " wasn’t really into the whole organizer profile thing.", "2017.03.28."));
  }
}
