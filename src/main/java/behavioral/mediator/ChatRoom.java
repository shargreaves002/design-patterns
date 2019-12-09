package behavioral.mediator;

import java.sql.Timestamp;

public class ChatRoom implements ChatRoomMediator {
    @Override
    public void showMessage(User user, String message) {
        Timestamp time = new Timestamp(System.currentTimeMillis());
        String sender = user.getName();
        System.out.println(time + "[" + sender + "]: " + message);
    }
}
