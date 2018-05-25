package decorate;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 下午4:39 2018/5/25
 * @Description:
 */
public class Hats extends Finery {

    public Hats(Person person) {
        super(person);
    }

    @Override
    public void dress() {
        super.dress();
        System.out.println("戴帽子");
    }
}
