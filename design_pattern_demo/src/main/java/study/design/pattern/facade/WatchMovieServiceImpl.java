package study.design.pattern.facade;

/**
 * @author:wuqi
 * @date:2020/4/14
 * @description:study.design.pattern.facade
 * @version:1.0
 */
public class WatchMovieServiceImpl implements ACGWatchFacade {

    private ThinkPad thinkPad;
    private Light light;
    private Website website;

    public WatchMovieServiceImpl(){
        thinkPad = new ThinkPad();
        light = new Light();
        website = new Website();
    }


    @Override
    public void ACGWatch(String video){
        System.out.println("Get ready to watch a ACG video...");
        thinkPad.on();
        website.open();
        light.off();
    }

    @Override
    public void ACGWatchFinish(){
        System.out.println("Get ready to close a ACG video...");
        light.on();
        website.close();
        thinkPad.off();
    }
}
