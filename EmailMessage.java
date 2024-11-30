public class EmailMessage extends Message {
    String sender;
    String content;
    String receiver;

    public void send(){
        System.out.print("E-mail has been sent");
    }

    public boolean isValid() {
        if (sender != null) {
            return true;
        } else {return false;}
        
    }

    public void checkReceiver(String receiver) {
        if (receiver != null) {
            send();
        } else {
            System.out.println("No email found with that adress");
        }

    }


}
