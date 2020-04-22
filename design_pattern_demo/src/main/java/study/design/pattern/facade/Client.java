package study.design.pattern.facade;

/**
 * @author:wuqi
 * @date:2020/4/14
 * @description:study.design.pattern.facade
 * @version:1.0
 */
public class Client {
    public static void main(String[] args) {
        //客户端只知道facade
        ACGWatchFacade facade = new WatchMovieServiceImpl();
        facade.ACGWatch("LOL");
        facade.ACGWatchFinish();
    }
}
