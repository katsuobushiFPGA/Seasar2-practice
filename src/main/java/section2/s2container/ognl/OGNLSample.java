package section2.s2container.ognl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.record.formula.functions.Int;

public class OGNLSample {
	public Map<Int,String> map = new HashMap<>();
	public List<String> list = new ArrayList<>();
	public String stStr = "STATIC_STRINGS";
	
	@Override
	public String toString() {
		return map.toString() + "\n" 
	          + list.toString() + "\n"
	          + stStr.toString();
	}
}
