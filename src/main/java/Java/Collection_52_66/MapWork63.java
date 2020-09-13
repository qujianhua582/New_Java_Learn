package Java.Collection_52_66;

import java.util.*;

/**
 * 将下列数据存储
 *
 * 北京市
 *      北京市
 *
 * 山东省
 *      济南市
 *      青岛市
 *      淄博市
 *      菏泽市
 *      烟台市
 *      威海市
 *
 * 浙江省
 *      杭州市
 *      宁波市
 *      温州市
 *      金华市
 *
 */
public class MapWork63 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        ArrayList<String> beijing = new ArrayList<>();
        beijing.add("北京市");

        ArrayList<String> shandong = new ArrayList<>();
        shandong.add("济南市");
        shandong.add("青岛市");
        shandong.add("淄博市");
        shandong.add("菏泽市");
        shandong.add("烟台市");
        shandong.add("威海市");

        ArrayList<String> zhejhiang = new ArrayList<>();
        zhejhiang.add("杭州市");
        zhejhiang.add("宁波市");
        zhejhiang.add("温州市");
        zhejhiang.add("金华市");

        hashMap.put("北京市",beijing);
        hashMap.put("山东省",shandong);
        hashMap.put("浙江省",zhejhiang);

        Set<Map.Entry<String,ArrayList>> entry = hashMap.entrySet();
        for (Map.Entry<String,ArrayList> e:entry){
            System.out.println(e.getKey());
            ArrayList arrayList =(ArrayList)e.getValue();
            for (Object value:arrayList){
                System.out.println("\t" + value);
            }
        }
    }
}
