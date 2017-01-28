package section2.s2container.helloworld;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {
    public static void main(String[] args) {
        //S2Containerを初期化
        SingletonS2ContainerFactory.init();

        //IMessageProviderインターフェースを実装したコンポーネントを取得
        IMessageProvider messageProvider = SingletonS2Container.getComponent(IMessageProvider.class);

        //メッセージを表示
        System.out.println(messageProvider.getMessage());

        //S2Containerを破棄
        SingletonS2ContainerFactory.destroy();
    }
}
