public class  Animal {
    protected String name;
    protected int distanceRun;
    protected int distanceSwim;
    private static int animalCount;

    public Animal(){
        animalCount++;
    }

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }
    public int getDistanceRun(){
        return distanceRun;
    }
    public int getDistanceSwim(){
        return distanceSwim;
    }
    public static int getAnimalCount(){
        return animalCount;
    }
    public void setDistanceRun (int distanceRun){
        this.distanceRun = distanceRun;
    }
    public void setDistanceSwim (int distanceSwim){
        this.distanceSwim = distanceSwim;
    }
    public void run(int distance) {
        if (distance > distanceRun) {
            System.out.println(name + " пробежал " + distanceRun + " м и больше не может");
        } else {
            System.out.println(name + " пробежал " + distance + " м");
        }
    }

    public void swim (int distance){
        if (distance > distanceSwim) {
            System.out.println(name + " пропроплыл " + distanceSwim + " м и больше не может");
        } else {
            System.out.println(name + " проплыл " + distance + " м");
        }
    }
}
