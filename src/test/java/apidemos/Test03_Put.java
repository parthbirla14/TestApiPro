package apidemos;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
public class Test03_Put {
    @Test
    public void test2() {

        JSONObject request = new JSONObject();
        request.put("name", "Parth");
        request.put("job", "QA");

        System.out.println(request);
        System.out.println(request.toString());

        given().
                body(request.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().statusCode(200);

    }
}
