package section2.s2container.aop;

import org.seasar.framework.aop.annotation.Trace;

public class TraceAnnotation {
	@Trace
	public void trace() {
		System.out.println("He");
	}
}
