package study.design.pattern.observer;

/**
 * @author:wuqi
 * @date:2020/4/2
 * @description:study.design.pattern.observer
 * @version:1.0
 */
public interface SubjectInterface {
    void registerObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers(Object object);
}
