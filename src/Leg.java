public class Leg {
    private double height;
    private double weight;
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getHeight()
    {
        return height;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getWeight()
    {
        return weight;
    }
    public String toString(){
        String s = "Высота ноги = " + height + "\n" + "Вес ноги = " + weight;
        return s;
    }
}
