package section2.s2container.aop;

import org.apache.log4j.Logger;

public class CalcService {
	private static Logger logger = Logger.getLogger(CalcService.class);

	public int add(int value1, int value2) {
		System.out.println(logger.isTraceEnabled());
		if(logger.isTraceEnabled()) {
			logger.trace("CalcService#add(); start.");
		}
		int result = value1 + value2;
		
		//メソッドの終了ログ
		if(logger.isTraceEnabled()) {
			logger.trace("CalcService#add");
		}
		return result;
	}
	public void hello() {
		System.out.println("Hello");
	}
}
