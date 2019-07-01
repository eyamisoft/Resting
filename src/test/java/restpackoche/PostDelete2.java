package restpackoche;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostDelete2 {

    @Test
    public void test2(){

       RequestSpecification req=RestAssured.given();

       req.header("Content-Type","application/json");

       JSONObject js = new JSONObject();

       js.put("id","3.5");
        js.put("title","lucky-server3.5");
        js.put("author","anicode3.5");

        req.body(js.toJSONString());

        Response resp=req.post("http://localhost:3000/posts/");

        int code=resp.getStatusCode();

        System.out.println("Response Code: "+code);

        Assert.assertEquals(code,201);

    }
}
