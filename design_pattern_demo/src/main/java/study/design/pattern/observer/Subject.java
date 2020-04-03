package study.design.pattern.observer;

import java.util.ArrayList;

/**
 * @author:wuqi
 * @date:2020/4/2
 * @description:study.design.pattern.observer
 * @version:1.0
 */
public class Subject implements SubjectInterface {

    /**
     * 这个地方容器类型很重要，
     * 用HashMap甚至可以控制，固定事件给某一个观察者通知
     */
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers(Object object) {
        if(!observers.isEmpty()){
            for (Observer observer : observers){
                observer.update(this,object);
            }
        }
    }
}
