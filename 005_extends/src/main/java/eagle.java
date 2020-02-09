public class eagle extends bird {
    private String name;
    private String food;

    public eagle() {
    }

    public eagle(int age, int weight, float flySpeed, String food, String name) {
        super(age, weight, flySpeed);
        this.food = food;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String prey() {
        return String.format("一只%d岁的%s，体重%dKg，这只%s生活在%s窝所以它只捕食%s。", getAge(), getName(), getWeight(), getName(), getFood(), getFood());
    }
}
