package ch1.ch1_1; /**
 * @Author: Lance
 * @Date: 2018/7/12 20:37
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Test16 {

    public static String exRl(int n) {

        if (n <= 0) {
            return "";
        }

        return exRl(n - 3) + n + exRl(n - 2) + n;

    }

    public static void main(String[] args){
        Test16 test01 = new Test16();
        System.out.println(Test16.exRl(6));
    }
}
