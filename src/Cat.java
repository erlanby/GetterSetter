public class Cat {
 private String name;
    private  int age;
    private double weight;
    private String color;

    void sleep(){ //
        System.out.println("Im sleeping every day");
    }
    void dontLike(){ // Жакпайт
        System.out.println("Elnura hates me ;( because im cat ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
