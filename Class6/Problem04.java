interface Camera{
    abstract void takePhoto();
    
}
interface MusicPlayer{
    abstract void playMusic();
    
}

class SmartPhone implements Camera,MusicPlayer{
    @Override
    public void takePhoto() {
        System.out.println("taking photos");
    }
    @Override
    public void playMusic() {
        System.out.println("playing music");
    }
}
public class Problem04 {

    public static void main(String[] args) {
        SmartPhone cr = new SmartPhone();
        cr.takePhoto();
        cr.playMusic();
    }
}