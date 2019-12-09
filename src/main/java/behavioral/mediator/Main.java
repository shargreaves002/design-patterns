package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User john = new User("John", chatRoom);
        User jane = new User("Jane", chatRoom);

        john.send("Hey!");
        jane.send("Hi there!");
    }
}
