package snippet;




import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FJsoup {

	
	/*
	
	public void Feth2(String resource){

		
		 URL url;
		    InputStream is = null;
		    BufferedReader br;
		    String line;
		    String result=" ";
		    try {
		        url = new URL("https://www.quora.com/In-Manhattan-where-besides-a-post-office-can-I-buy-postage-stamps");
		        is = url.openStream();  // throws an IOException
		        br = new BufferedReader(new InputStreamReader(is));

		        
		        while ((line = br.readLine()) != null) {
		            System.out.println(line);
		        }
		    } catch (MalformedURLException mue) {
		         mue.printStackTrace();
		    } catch (IOException ioe) {
		         ioe.printStackTrace();
		    } finally {
		        try {
		            if (is != null) is.close();
		        } catch (IOException ioe) {
		            // nothing to see here
		        }
		    }
	}
	
	public String fetchHTMLasReadableString(String resource)
	{
		String html="";
		String temp="";
		URL url;
	    InputStream is = null;
	    BufferedReader br;
	    

	    try {
	        url = new URL(resource);
	        is = url.openStream();  // throws an IOException
	        br = new BufferedReader(new InputStreamReader(is));

	        while ((temp = br.readLine()) != null) {
	        	html+=temp;
	        	//if you remove "new line" it will be faster so decide what to do with respect to the results
	        	html+="\n";
	        }
	    } catch (MalformedURLException mue) {
	         mue.printStackTrace();
	    } catch (IOException ioe) {
	         ioe.printStackTrace();
	    } finally {
	        try {
	            if (is != null) is.close();
	        } catch (IOException ioe) {
	            // nothing to see here
	        }
	    }
	    return html;
	}
	
*/
	public static void main(String[] args) throws IOException {

		String html = Jsoup.connect("https://www.quora.com/In-Manhattan-where-besides-a-post-office-can-I-buy-postage-stamps").get().html();
	
		PrintWriter out = new PrintWriter("TESTINGCRAWLING.html");
		
		out.println(html);

		out.close();
		
		
		 Document document = Jsoup.parse( new File( "TESTINGCRAWLING.html" ) , "utf-8" );
		 Elements links = document.getElementsByClass("ExpandedAnswer");
		 for (Element link : links) {
			  String linkHref = link.attr("href");
			  String linkText = link.text();
			  String linkdata = link.data();
			  String stringgg = link.toString();
		//	  String linke= link.
			  int x = 1;
			}
		 
		 
		 
		
//		FJsoup obj = new FJsoup ();
	//	String X = obj.fetchHTMLasReadableString("https://www.quora.com/In-Manhattan-where-besides-a-post-office-can-I-buy-postage-stamps");
		
	
		
		
		
		
		//System.out.println(X);
		String Y="";
		/*
		File input = new File("test.html");
		Document doc = Jsoup.parse(input, "UTF-8", "https://www.quora.com/In-Manhattan-where-besides-a-post-office-can-I-buy-postage-stamps");
		Document doc2 =Jsoup.parse(
		//Document doc = Jsoup.connect("https://www.quora.com/In-Manhattan-where-besides-a-post-office-can-I-buy-postage-stamps").get();
		Element content = doc.getElementById("content");
		Elements links = content.getElementsByClass("answer_count");
		System.out.println(links.text());
		
		
		Document document = Jsoup.connect("http://howtodoinjava.com").get();
	    System.out.println(document.title());
	    Elements links=document.getElementsByClass("answer_count");
	    for (Element link : links) {
	    
	    	  String linkText = link.text();
	    	}
	    	*/
		
		
		
		
	}
	

}
