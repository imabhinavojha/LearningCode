
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONException;
import org.json.JSONObject;

public class Test01_Get {

	@Test(priority = 1)
	public void fyndAPIToGetAuthInfo() {
		RequestSpecification httpRequest = RestAssured.given().auth().preemptive().basic("amazon-smart-connect",
				"amazon-smart-connect#fynd");
		Response response = httpRequest
				.get("https://amazon-smart-connect.extensions.fyndx1.de/extension/token?company_id=2&refresh=true");
		System.out.println("Status Code " + response.statusCode());
		//System.out.println("Body " + response.getBody().asString());
		System.out.println("Status Line " + response.statusLine());
		int statusCode = response.getStatusCode();

		// Assert.assertEquals(statusCode, 200);
		JSONObject jsonObject = new JSONObject(response.getBody().asString());

		//System.out.println("tokens " + jsonObject.get("tokens"));
		String access_key_id = jsonObject.getJSONObject("tokens").getJSONObject("AWS_assume_role").getString("access_key_id");
		String accessToken = jsonObject.getJSONObject("tokens").getString("access_token");
		String tokenType = jsonObject.getJSONObject("tokens").getString("token_type");
		//System.out.println("Oauth Token with type " + tokenType + "   " + accessToken);
		//System.out.println("access_key_id " + access_key_id);
	}

	@Test
	public void test1() {

		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]", equalTo(7));

	}

}