package app;

public interface Printer {
    void print(Message message);

    public class Message {

        String text;
        String sender;

        public Message(String text, String sender) {
            this.sender = sender;
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public String getText() {
            return text;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
