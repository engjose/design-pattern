package decorate;

/**
 * @Author: Panyuanyuan
 * @Date: Created in 下午4:37 2018/5/25
 * @Description:
 */
public abstract class Finery implements Person {

    private Person person;

    public Finery(Person person) {
        this.person = person;
    }

    @Override
    public void dress() {
        person.dress();
    }
}
