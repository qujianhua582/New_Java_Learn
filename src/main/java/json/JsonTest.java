package json;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Json
 *
 * {"name":"qujianhua",
 *  "age":18,
 *  "friend":
 *          [
 *          {"name":"weishuo","age":19},
 *          {"name":"lil zoo","age":21}
 *          ],
 *  "num":{
 *          "id":1,
 *          "things":"MacBook Pro"
 *          }
 * }
 */
public class JsonTest {
    public static void main(String[] args) {
        String json = "{\"name\":\"qujianhua\",\"age\":18,\"friend\":[{\"name\":\"weishuo\",\"age\":19},{\"name\":\"lil zoo\",\"age\":21}],\"num\":{\"id\":1,\"things\":\"MacBook Pro\"}}";
        JSONObject jsonObject = new JSONObject(json);


        //获取friend中内容
        JSONArray friend = jsonObject.getJSONArray("friend");
        for (int i = 0; i < friend.length(); i++) {
            jsonObject = new JSONObject(friend.get(i).toString());
            System.out.println(jsonObject.get("name"));
        }

        //获取num中的内容
        jsonObject = new JSONObject(jsonObject.get("num").toString());
        System.out.println(jsonObject.get("things"));
    }
}

/*
{"name":"qujianhua","age":18}

{"name":"qujianhua",
"age":18,
"girlfriend":{"name":"zhangying","age":20}
}

{"name":"qujianhua",
"age":18,
"girlfriends":[{"name":"zhangying","age":20},{"name":"weizhi","age":0}]
}

*/
