package kata.clash.units;

public abstract class  Unit {
    private int DefensiveHitpoints;

    private int OffensiveHitpoints;
    private int CoveredDistance;
    private  String lastMessage;

    //CONSTRUCTOR
    public Unit(int defensiveHitpoints,int ofensiveHitpoints,int coveredDistance,String lastMessage){
        this.DefensiveHitpoints = defensiveHitpoints;
        this.OffensiveHitpoints = ofensiveHitpoints;
        this.CoveredDistance = coveredDistance;
        this.lastMessage = lastMessage;
    }

    public String ReceiveHit(int attackHitpoints)
    {
        this.DefensiveHitpoints -= attackHitpoints;
        if(this.DefensiveHitpoints <= 0)
            return lastMessage;
        return "";
    }

    public int Move(int seconds)
    {
        return this.CoveredDistance * seconds;
    }

        // GETTER & SETTERS
    public int getDefensiveHitpoints() {
        return DefensiveHitpoints;
    }
    private void setDefensiveHitpoints(int defensiveHitpoints) {
        DefensiveHitpoints = defensiveHitpoints;
    }
    public int getOffensiveHitpoints() {
        return OffensiveHitpoints;
    }
    private void setOffensiveHitpoints(int offensiveHitpoints) {
        OffensiveHitpoints = offensiveHitpoints;
    }
    public void setCoveredDistance(int coveredDistance) {
        CoveredDistance = coveredDistance;
    }


}
