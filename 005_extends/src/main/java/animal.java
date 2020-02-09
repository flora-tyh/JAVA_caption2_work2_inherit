public class animal {
    private int age;
    private int weight;

    public animal() {
    }

    public animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String eat(String food) {
        return String.format("在饥肠辘辘之际捕食了一只%s，然后饱餐一顿，", food);
    }

    public String sleep() {
        return String.format("心满意足之后就睡觉了");
    }
}
