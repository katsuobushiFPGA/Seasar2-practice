package section2.s2container.injection;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {
    public static void main(String[] args) {
        //S2Containerを初期化
        SingletonS2ContainerFactory.init();

        CSVLoader csvloader = SingletonS2Container.getComponent(CSVLoader.class);
        System.out.println(csvloader.getFileName());        
        System.out.println(csvloader.getFileNames().toString());
        
        //S2Containerを破棄
        SingletonS2ContainerFactory.destroy();
    }
}
