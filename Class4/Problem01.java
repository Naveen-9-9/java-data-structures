class Account {
    String Username;
    String email;
    String accountType;
    String phoneNumber;
    boolean isVerified;

    void displayAccountInfo (){
        System.out.println("User Name : "+Username);
        System.out.println("E mail : "+email);
        System.out.println("Account Type : "+accountType);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Verified Account : "+isVerified);
    }
    
}

class user extends Account{
    int followersCount;
    int followingCount ;
    int totalPosts  ;
    int totalReels  ;
    int totalLikes  ;

    void displayFollowersInfo(){
        System.out.println("Followers : "+ followersCount);
        System.out.println("Following : "+ followingCount);

    }
    void displayPostInfo(){
        System.out.println("Total Posts  : "+ totalPosts);
        System.out.println("Total Reels: "+ totalReels);

    }
    void displayEngagement(){
        System.out.println("Total Likes  : "+ totalLikes);
    }
}

public class Problem01 {
    public static void main(String[] args) {
        user us = new user();
        us.Username = "Bunny";
        us.email = "Bunny123@GMAIL.COM";
        us.accountType = "Public";
        us.phoneNumber = "987654345";
        us.isVerified = true;
        us.followersCount = 12345;
        us.followingCount = 45;
        us.totalPosts= 12;
        us.totalReels = 6;
        us.totalLikes = 999;
        us.displayAccountInfo();
        us.displayFollowersInfo();
        us.displayPostInfo();
        us.displayEngagement();
    }
}
