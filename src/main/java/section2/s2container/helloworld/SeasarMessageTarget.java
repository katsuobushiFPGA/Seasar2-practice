package section2.s2container.helloworld;

public class SeasarMessageTarget implements IMessageTarget {

    @Override
    public String getName() {
        return "Seasar2";
    }

    @Override
    public void init() {
        System.out.println("Init");
    }

    @Override
    public void destroy() {
        System.out.println("Destory");
    }

}
