package app;

public class mainMessage implements Printer{
    @Override
    public void print(Message message) {
        if((message.getText() == null || message.getText().isEmpty()) && (message.getSender() == null || message.getSender().isEmpty())){
            new Object(){
                void handleEmptyMessage(){
                    System.out.println("An empty message from an anonymous user is being processed...");
                }
            }.handleEmptyMessage();
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("An anonymous user has sent a message: " + message.getText() + ".");
        } else if (message.getText() == null || message.getText().isEmpty()){
            System.out.println("User " + message.getSender() + " sent a empty message.");
        }else{
            System.out.println("User " + message.getSender() + " sent a message: " + message.getText() + ".");
        }
    }
}