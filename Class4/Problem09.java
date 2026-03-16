

abstract class Video {
    String videoTitle ;
    String uploaderName;
    double durationInMinutes; 
    int likes ;
    
    abstract void playVideo();

    void displayVideoDetails(){
        System.out.println("videoTitle : " + videoTitle);
        System.out.println("uploaderName : " + uploaderName);
        System.out.println("durationInMinutes : " + durationInMinutes);
        System.out.println("likes : " + likes);
    }
    void likeVideo(){
        likes++;
        System.out.println("likes : " + likes);
    }

    void addComment(String comment){
        System.out.println("comment : "+ comment);
    }

    void shareVideo(){
        System.out.println("shareVideo" + videoTitle);
    }
}

class TutorialVideo extends Video{
    @Override
    void playVideo() {
        System.out.println("Playing Tutorial Video with captions" );
    }
}

class MusicVideo extends Video{
    @Override
    void playVideo(){
        System.out.println("Playing Music Video with HD quality");
    }
}

public class Problem09 {
    public static void main(String[] args) {
        TutorialVideo tv = new TutorialVideo();
        MusicVideo mv = new MusicVideo();
        tv.videoTitle = "title";
        tv.uploaderName = "bunny";
        tv.durationInMinutes = 40.0;
        tv.likes = 654;

        tv.playVideo();
        mv.playVideo();
        tv.displayVideoDetails();
        tv.likeVideo();
        tv.addComment("comment");
        tv.shareVideo();
        
        

    }
}