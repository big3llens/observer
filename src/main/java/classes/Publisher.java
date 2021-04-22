package classes;

import interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    private List<Observer> subsvribers =  new ArrayList<>();

    public void addSubscriber(Observer observer){
        subsvribers.add(observer);
    }

    public void removeSubscriber(Observer observer){
        subsvribers.remove(observer);
    }

    public void notify(int i){
        for (Observer ob : subsvribers){
            ob.update(this, i);
        }
    }
}
