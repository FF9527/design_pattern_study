package study.design.pattern.template;

/**
 * @author:wuqi
 * @date:2020/4/13
 * @description:study.design.pattern.template
 * @version:1.0
 */
public class Main {
    public static void main(String[] args) {
        TemplateService template = new ATemplateServiceImp();
        template.templateMethod();
        template = new BTemplateServiceImp();
        template.templateMethod();
    }
}
