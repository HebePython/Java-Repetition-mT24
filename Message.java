public abstract class Message {
    protected String content;
    protected String sender;
    public abstract void send();
    public abstract boolean isValid();
}
