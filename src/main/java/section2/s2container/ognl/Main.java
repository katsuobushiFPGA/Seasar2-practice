package section2.s2container.ognl;

import java.util.Date;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {
	public static void main(String[] args) {
        //S2Containerを初期化
        SingletonS2ContainerFactory.init();

        DateFormatter dateFmt = SingletonS2Container.getComponent(DateFormatter.class);
        System.out.println(dateFmt.format(new Date()));
        
        OGNLSample ognl = SingletonS2Container.getComponent(OGNLSample.class);
        System.out.println(ognl.toString());
        
        //S2Containerを破棄
        SingletonS2ContainerFactory.destroy();
	}
}
