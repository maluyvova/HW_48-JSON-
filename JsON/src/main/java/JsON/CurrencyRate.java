package JsON;
import java.io.*;
import java.net.*;
import org.json.simple.*;
import org.json.simple.parser.*;



public class CurrencyRate {
public static void main (String [] args) throws IOException,ParseException {
	/*JSONParser j = new JSONParser();
	
	URL cc =new URL("http://www.geoplugin.net/json.gp?ip=88.191.179.56");
	JSONObject cc_json = (JSONObject)j.parse(new BufferedReader(new InputStreamReader(cc.openConnection().getInputStream())));
	
	
	
	
	
	
	String usa_code="USD";
	String local_code=(String)  cc_json.get("geoplugin_currencyCode");
	String pair_code=usa_code+local_code;
	String rate_sql = "select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(\"" + pair_code + "\")"; 	URL rate_url = new URL("http://query.yahooapis.com/v1/public/yql?q=" + rate_sql + "&format=json&env=store://datatables.org/alltableswithkeys");
	JSONObject rate_json = (JSONObject) j.parse(new BufferedReader(new InputStreamReader(rate_url.openConnection().getInputStream())));
    JSONObject query = (JSONObject) rate_json.get("query");



              JSONObject results = (JSONObject) query.get("results");


              JSONObject rate = (JSONObject) results.get("rate");



String usd_eur_rate = (String) rate.get("Rate"); 



              System.out.println(usd_eur_rate);*/
	
	 JSONParser jp = new JSONParser();

	 

	              

	 

	               URL cc = new URL("http://www.geoplugin.net/json.gp?ip=88.191.179.56");

	 

	 JSONObject cc_json = (JSONObject) jp.parse(new BufferedReader(new InputStreamReader(cc.openConnection().getInputStream())));

	 

	              

	 

	               String usa_code = "USD";

	 

	               String local_code = (String) cc_json.get("geoplugin_currencyCode");   // EUR

	 

	              

	 

	               String pair_code = usa_code + local_code;                             // USDEUR

	 

	              

	 

	 String rate_sql = "select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(\"" + pair_code + "\")"; 

	 

	  

	 

	 URL rate_url = new URL("http://query.yahooapis.com/v1/public/yql?q=" + rate_sql + "&format=json&env=store://datatables.org/alltableswithkeys");

	 

	              

	 

	 JSONObject rate_json = (JSONObject) jp.parse(new BufferedReader(new InputStreamReader(rate_url.openConnection().getInputStream())));

	 

	       

	 

	               JSONObject query = (JSONObject) rate_json.get("query");

	 

	               JSONObject results = (JSONObject) query.get("results");

	 

	               JSONObject rate = (JSONObject) results.get("rate");



	 String usd_eur_rate = (String) rate.get("Rate"); 

	 

	               System.out.println(usd_eur_rate);

	 

	  

	 

	        }

	 





 
	
	
	
	
	
	
}
	
	
	
