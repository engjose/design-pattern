package decorate;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 下午4:40 2018/5/25
 * @Description:
 */
public class Trousers extends Finery {

    public Trousers(Person person) {
        super(person);
    }

    @Override
    public void dress() {
        super.dress();
        System.out.println("穿裤子....");
    }
}
