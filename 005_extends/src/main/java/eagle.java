public class Eagle extends Bird {
    private String food;

    public Eagle() {
    }

    public Eagle(int age, int weight, float flySpeed, String food) {
        super(age, weight, flySpeed);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String prey() {
        return String.format("一只%d岁的%s，体重%dKg，这只%s生活在%s窝所以它只捕食%s。", getAge(), "老鹰", getWeight(), "老鹰", getFood(), getFood());
    }

    public String eat() {
        return String.format("在饥肠辘辘之际捕食了一只%s，然后饱餐一顿，", food);
    }
}
