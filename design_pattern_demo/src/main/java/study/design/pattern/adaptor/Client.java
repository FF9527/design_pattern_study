package study.design.pattern.adaptor;

/**
 * @author:wuqi
 * @date:2020/4/13
 * @description:study.design.pattern.adaptor
 * @version:1.0
 */
public class Client {
    public static void main(String[] args) {
        PersonVO personVO = new PersonVO();
        personVO.setId(9527L);
        personVO.setName("hua an");
        personVO.setAge(18);
        Adaptee adaptee = new AdapteeImp();
        Adaptor adaptor = new AdaptorImp(adaptee);
        adaptor.methodA(personVO);
    }
}
