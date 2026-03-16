class Content {
    int contentId ;
    String uploadDate ;
    String userName;
    
    void upload(){
        System.out.println("Facebook Post : \n");
        System.out.println("contentId :"+contentId);
        System.out.println("uploadDate :"+uploadDate);
        System.out.println("userName :"+userName);
    }
}

class FacebookPost extends Content{
    String caption ;
    int numberOfLikes ;
    int numberOfComments;
    
    void addCaption(){
        System.out.println("caption : " + caption);
        System.out.println("numberOfLikes : " + numberOfLikes);
        System.out.println("numberOfComments : " + numberOfComments);
    }
}
class FacebookReel extends Content{

    String musicName;
    int durationInSeconds;
    int numberOfViews ;
    

    void addMusic(){
        System.out.println( "numberOfViews :" + numberOfViews); 
        System.out.println(  "durationInSeconds :"+durationInSeconds); 
        
    }
}

public class Problem05 {
    public static void main(String[] args) {
        FacebookPost f1 = new FacebookPost();
        f1.contentId = 201;
        f1.caption = "Learning Java Inheritance";
        f1.uploadDate = "12/3/1/1";
        f1.userName = "Bunny";
        f1.numberOfLikes = 4507;
        f1.numberOfComments = 587;

        f1.upload();
        f1.addCaption();

        FacebookReel f2 = new FacebookReel();
        f2.musicName = "song";
        f2.durationInSeconds = 3;
        f2.numberOfViews = 99099;

        f2.addMusic();

    }
}

