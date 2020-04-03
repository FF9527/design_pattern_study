package study.design.pattern.observer;

/**
 * @author:wuqi
 * @date:2020/4/2
 * @description:study.design.pattern.observer
 * @version:1.0
 */
public interface Observer {

    void update(SubjectInterface subject, Object object);
    SubjectInterface getSubject();
}
