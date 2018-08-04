package iflytek;

import java.util.Map;

/**
 * @Author: Lance
 * @Date: 2018/7/21 15:18
 */
public class CompareMap {

    public static void main(String[] args) {

    }

    private void compare(Map<String, String> map1, Map<String, String> map2) {

        for (String testkey : map1.keySet()) {

            if(map1.get(testkey).equals(map2.get(testkey))){

                System.out.println("equals");

            }else{

                System.out.println("not equals");

            }
        }

    }

}
