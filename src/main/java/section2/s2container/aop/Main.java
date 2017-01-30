package section2.s2container.aop;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

public class Main {
	
	public static void main(String args[]) {
		S2Container container = S2ContainerFactory.create("app.dicon");
		CalcService calc =(CalcService)container.getComponent(CalcService.class);
		calc.add(1, 2);
		calc.hello();
		container.destroy();

		S2Container container2 = S2ContainerFactory.create("app.dicon");
		TraceTest trc =(TraceTest)container2.getComponent(TraceTest.class);
		trc.print();
		trc.test();
		container2.destroy();
	}
}
