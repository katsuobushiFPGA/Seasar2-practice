package section2.s2container.helloworld;

public class DefaultMessageTarget implements IMessageTarget {

    @Override
    public String getName() {
        return "World";
    }

    @Override
    public void init() {
        System.out.println("Init");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
    }

}
