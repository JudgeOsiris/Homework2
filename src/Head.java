public class Head {
    private String haircolor;
    private String eyescolor;
    public void setHaircolor(String haircolor) {this.haircolor = haircolor;}
    public String  getHaircolor()
    {
        return haircolor;
    }
    public void setEyescolor(String eyescolor)
    {
        this.eyescolor = eyescolor;
    }
    public String getEyescolor()
    {
        return eyescolor;
    }
    public String toString(){
        String s = "Цвет волос: " + haircolor + "\n" + "Цвет глаз: " + eyescolor;
        return s;
    }
}
