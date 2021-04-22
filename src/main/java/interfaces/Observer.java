package interfaces;

import classes.Publisher;

public interface Observer {
    void update(Publisher publisher, int i);
}
