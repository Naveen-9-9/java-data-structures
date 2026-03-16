class MusicApp {
    String appName ;
    String version ;
    double totalStorageUsed;
    
    void displayAppDetails(){
        System.out.println("appName :"+appName);
        System.out.println("version :"+version);
        System.out.println("totalStorageUsed :"+totalStorageUsed);
    }
}

class PremiumMusicApp extends MusicApp{
    String subscriptionType ;
    int offlineDownloads ;
    
    void playSong(String songName){
        System.out.println("songName :"+songName+"playing ad-free");
    }
    void displayPremiumInfo(){
        System.out.println("subscriptionType :" + subscriptionType);
        System.out.println("offlineDownloads :" + offlineDownloads);
    }
}


public class Problem07 {
    public static void main(String[] args) {
        PremiumMusicApp pm = new PremiumMusicApp();
        pm.appName = "TuneStream";
        pm.version = "3.5";
        pm.totalStorageUsed = 500.00;
        pm.subscriptionType = "Type Premium";
        pm.offlineDownloads = 50;

        pm.displayAppDetails();
        pm.displayPremiumInfo();
        pm.playSong("AAJA KI RAAT");
        pm.playSong("shape of you");
    }
}

