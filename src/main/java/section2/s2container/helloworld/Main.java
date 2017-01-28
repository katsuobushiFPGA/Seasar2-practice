package section2.s2container.helloworld;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {
    public static void main(String[] args) {
        //diconファイルを指定してコンテナを初期化
        SingletonS2ContainerFactory.setConfigPath("app.dicon");

        //S2Containerを初期化
        SingletonS2ContainerFactory.init();

        //IMessageProviderインターフェースを実装したコンポーネントを取得
        IMessageProvider messageProvider = SingletonS2Container.getComponent(IMessageProvider.class);
        //インターフェイスの型でコンポーネントを取得するときは、実装型が複数存在するとエラーになる。-> 明示的に実装型を指定するか、component nameを指定する。
        //app.diconに指定されている component name を指定して取得することも可能
        //IMessageProvider messageProvider = SingletonS2Container.getComponent("messageProvider");

        //メッセージを表示
        System.out.println(messageProvider.getMessage());

        //S2Containerを破棄
        SingletonS2ContainerFactory.destroy();
    }
}
