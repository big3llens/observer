package classes;

import interfaces.Observer;

public class UserOne implements Observer {
    @Override
    public void update(Publisher publisher, int i) {
        System.out.println("Температура в приложении первого юзера: " + i);
    }
}
