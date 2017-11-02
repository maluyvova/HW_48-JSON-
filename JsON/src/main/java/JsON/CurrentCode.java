package JsON;
import java.io.*;
import java.net.*;
import org.json.simple.*;
import org.json.simple.parser.*;



public class CurrentCode {
public static void main (String [] args) throws IOException , ParseException{
	JSONParser j = new JSONParser();
	URL u = new URL ("http://www.geoplugin.net/json.gp?ip=88.191.179.56");
	BufferedReader in = new BufferedReader(new InputStreamReader(u.openConnection().getInputStream()));
	JSONObject cc_jo = (JSONObject) j.parse(in);
	System.out.println("Country code: \t\t"+cc_jo.get("geoplugin_countryName"));
	System.out.println("Currency Code: \t\t"+cc_jo.get("geoplugin_currencyCode"));
	System.out.println("Currency Symbol: \t\t" +cc_jo.get("geoplugin_currencySymbol_UTF8"));
	
	
	
	
	
	
	
}
}
