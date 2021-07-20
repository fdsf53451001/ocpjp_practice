
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_Practice {
	public static void main(String[] args) {
		Locale tw_locale = Locale.TAIWAN;
//		Locale tw_locale = Locale.getDefault();
//		ResourceBundle bundle = ResourceBundle.getBundle("message",tw_locale);
//		System.out.println(bundle.getString("hi"));
		
		SimpleDateFormat tw_date = new SimpleDateFormat("zzzz",tw_locale);
		System.out.println(tw_date.format(new Date()));
	}
}
