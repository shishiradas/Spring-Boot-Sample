
package Client;



import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SpringRestClient1 {

	public static void main(String[] args) {
		
		RestTemplate rt= new RestTemplate();
		
		String credentials = new String(Base64.encodeBase64("bill:abc123".getBytes()));
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
		//headers.set("Authorization", "Basic" + credentials);
		HttpEntity he= new HttpEntity<>(headers);
		ResponseEntity<String> resp = rt.exchange("http://localhost:8181/app/find?empid=100",  HttpMethod.GET,he ,String.class);
		
		System.out.println(resp.getBody());
		
	}

}
