public class Hand {
    private double length;
    private double weight;
    public void setLength(double length)
    {
        this.length = length;
    }
    public double getLength()
    {
        return length;
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
        String s = "Длина руки = " + length + "\n" + "Вес руки = " + weight;
        return s;
    }
}
