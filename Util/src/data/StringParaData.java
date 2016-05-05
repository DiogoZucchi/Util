package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringParaData {
	public static void main(String[] args) throws ParseException {
		
		String aData = "05/03/1995";
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		data = sdf.parse(aData);
		
		System.out.println(data);
	}
}
