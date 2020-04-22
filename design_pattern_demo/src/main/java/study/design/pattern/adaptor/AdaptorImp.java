package study.design.pattern.adaptor;

/**
 * @author:wuqi
 * @date:2020/4/13
 * @description:study.design.pattern.adaptor
 * @version:1.0
 */
public class AdaptorImp implements Adaptor {

    private Adaptee adaptee;
    public AdaptorImp(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void methodA(PersonVO personVO) {
        UserVO userVO = new UserVO();
        userVO.setId(personVO.getId());
        userVO.setName(personVO.getName());
        userVO.setAge(personVO.getAge());
        adaptee.methodB(userVO);
    }

}
