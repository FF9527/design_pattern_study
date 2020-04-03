package study.design.pattern.observer;

/**
 * @author:wuqi
 * @date:2020/4/2
 * @description:study.design.pattern.observer
 * @version:1.0
 */
public class ObServerAImp implements Observer {

    private SubjectInterface subject;

    public ObServerAImp(SubjectInterface subject){
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void update(SubjectInterface subject, Object object) {
        System.out.println("A:I get a message from " + subject + "  :" +object);
    }

    @Override
    public SubjectInterface getSubject(){
        return subject;
    }
}
