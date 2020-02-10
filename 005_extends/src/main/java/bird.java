public abstract class Bird extends Animal {
    private float flySpeed;

    public Bird() {
    }

    public Bird(int age, int weight, float flySpeed) {
        super(age, weight);
        this.flySpeed = flySpeed;
    }

    public float getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(float flySpeed) {
        this.flySpeed = flySpeed;
    }

    public String fly() {
        return String.format("某天它先翱翔天空，");
    }
}
