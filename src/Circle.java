public class Circle {
    private double radius;
    private double square;
    public void setRadius(double radius)
    {
        this.radius = radius;
        square = 3.14 * radius * radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setSquare(double square)
    {
        this.square = square;
        radius = Math.sqrt(square / 3.14);
    }
    public double getSquare()
    {
        return square;
    }
    public String toString(){
        String s = "Радиус = " + radius + "\n" + "Площадь = " + square;
        return s;
    }


}
