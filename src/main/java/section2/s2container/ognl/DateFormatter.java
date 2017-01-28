package section2.s2container.ognl;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	public SimpleDateFormat format;
	
	public String format(Date date) {
		return format.format(date);
	}
}
