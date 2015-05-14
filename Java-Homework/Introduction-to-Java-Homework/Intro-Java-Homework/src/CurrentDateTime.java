import java.time.LocalDateTime;


public class CurrentDateTime {
    public static void main(String []args) {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("" + currentTime);
    }
}
