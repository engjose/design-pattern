package decorate;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 下午4:41 2018/5/25
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Person person = new XiaoMing();
        Trousers trousers = new Trousers(person);
        Hats hats = new Hats(trousers);
        hats.dress();
    }
}
