package section2.s2container.helloworld;

public interface IMessageProvider {
    public void setMessageTarget(IMessageTarget messageTarget);
    public String getMessage();
}
