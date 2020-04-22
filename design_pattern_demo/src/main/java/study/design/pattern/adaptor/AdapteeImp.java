package study.design.pattern.adaptor;

/**
 * @author:wuqi
 * @date:2020/4/13
 * @description:study.design.pattern.adaptor
 * @version:1.0
 */
public class AdapteeImp implements Adaptee {
    @Override
    public void methodB(UserVO userVO) {
        System.out.println(userVO);
    }
}
