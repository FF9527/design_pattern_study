package study.design.pattern.observer;

/**
 * @author:wuqi
 * @date:2020/4/2
 * @description:study.design.pattern.observer
 * @version:1.0
 */
public class Main {

    public static void main(String[] args) {
        //定义一个主题，被观察者
        SubjectInterface subject = new Subject();
        //订阅主题，被观察者：观察者=1：n
        Observer observerA = new ObServerAImp(subject);
        Observer observerB = new ObServerBImp(subject);
        //通知
        subject.notifyObservers("hello Observer!");
        //A取消订阅
        observerA.getSubject().deleteObserver(observerA);
        subject.notifyObservers("hello World!");
    }
}
