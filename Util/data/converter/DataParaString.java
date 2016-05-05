package converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataParaString {
	public static void main(String[] args) {
		
		Date data = new Date();
		String aData;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		aData = sdf.format(data);
		
		System.out.println(aData);
		
	}
}
