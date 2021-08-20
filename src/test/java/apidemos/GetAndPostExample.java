package apidemos;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class GetAndPostExample {
    @Test
    public void testGet() {
        baseURI="https://reqres.in/api";
        given().get("/users?page=2").
                then().statusCode(200).
                body("data[4].first_name",equalTo("George")).
                body("data.first_name",hasItems("George","Rachel"));

    }
    @Test
    public void testPost() {
        Map<String, Object>map =new HashMap<String, Object>();
/*	map.put("name", "Parth");
	map.put("job","QA");
	System.out.println(map);*/
        JSONObject request =new JSONObject(map);
        request.put("name", "parth");
        request.put("job", "QA");

        System.out.println(request.toJSONString());


    }
}
