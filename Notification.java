public abstract class Notification {
    String sender;
    String message;
    boolean isViable;

    public boolean errorHandler(){ //concrete
        if (sender != null && message != null) {
            return true;
        } else {return false;}
    }

    public void sound() { //abstract
    }    
}
class SMSNotification extends Notification {
    boolean isViable;

    public void sound() {
            System.out.println("BEEP");
        }

}
class PopupNotification extends Notification {
    boolean isViable;

    public void soind() {
        System.out.println("PLING!");
    }

}