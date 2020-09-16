public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;
    public Head getHead()
    {
        return head;
    }
    public Leg getLeg()
    {
        return leg;
    }
    public Hand getHand()
    {
        return hand;
    }
    Human()
    {
        head = new Head();
        leg = new Leg();
        hand = new Hand();
    }
}
