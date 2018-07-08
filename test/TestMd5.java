import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;

public class TestMd5 {

    @Test
    public void TestMd5() {
        Md5Hash md5Hash = new Md5Hash("123456");
        Md5Hash md5Hash1 = new Md5Hash("123456","qqqq",2);
        System.out.println(md5Hash.toString());
        System.out.println("-----------------");
        System.out.println(md5Hash1);
    }
}



