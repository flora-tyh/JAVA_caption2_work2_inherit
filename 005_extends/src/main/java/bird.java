public class bird extends animal{
    private float flySpeed;

    public bird() {
    }

    public bird(int age, int weight, float flySpeed) {
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
