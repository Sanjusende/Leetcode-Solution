interface photographer{
    void take_photo();
    void record_video();  
}   
class Camera implements photographer{
    public void take_photo(){
        System.out.println("Taking photo");
    }
    public void record_video(){
        System.out.println("Recording video");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Camera cam = new Camera();
        cam.take_photo();
        cam.record_video();
    }
}