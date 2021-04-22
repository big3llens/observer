package classes;

import interfaces.Observer;

public class UserTwo implements Observer {
    @Override
    public void update(Publisher publisher, int i) {
        System.out.println("Температура в приложении второго юзера: " + i);
    }
}
