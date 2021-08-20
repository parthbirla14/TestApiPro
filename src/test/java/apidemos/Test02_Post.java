package apidemos;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test02_Post {
    @Test
    public void test2() {

        JSONObject request = new JSONObject();
        request.put("name", "parth");
        request.put("job", "Engineer");

        System.out.println(request);
        System.out.println(request.toString());

        given().
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().statusCode(201 );

    }
}
