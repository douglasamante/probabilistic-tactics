
package probabilistictacticsproject;

public class Players{
    
    private String name;
    private String position;//[GK,CB,RB,LB,CDM,CAM,RW,LW,ST
    private String nationality;
    private int age;
    private int shirtNumber;
    private double weight; //Weight each player
    private double height; //Height each player
    private double force; //Force each player
    private double breath; //Breath each player
    private double impulse; //Impulse each player
    private double leader; 
    private double overviewDribbler; //Points for dibbler [0-100]
    private double potential; //maximize pontetial of player
    private double overviewMarking; //Points for marking[0-100]
    private double overviewDisarm; //Points for disarm [0-100]
    private double overviewFinalization; //Points for finalization [0-100]
    private double overviewCrossing; //Points for crossing [0-100]
    private double overviewPass; //Points for pass [0-100]
    private double positioning; //Positioning during the math
    Statistics statistics;
    
    public void register(String Name, String Position, String Nationality,double Weight,double Leader, double OverviewDribbler, double Height,double Force, double Breath, double Impulse, int Age, double Potential, double OverviewMarking, double OverviewDisarm, double OverviewFinalization, double OverviewCrossing, double OverviewPass, double Positioning,int ShirtNumber){
        
        this.name = Name;
        this.position = Position;
        this.nationality = Nationality;
        this.weight = Weight;
        this.height = Height;
        this.force = Force;
        this.leader = Leader;
        this.overviewDribbler = OverviewDribbler;
        this.breath = Breath;
        this.impulse = Impulse;
        this.age = Age;
        this.potential = Potential;
        this.overviewMarking = OverviewMarking;
        this.overviewDisarm = OverviewDisarm;
        this.overviewFinalization = OverviewFinalization;
        this.overviewCrossing = OverviewCrossing;
        this.overviewPass = OverviewPass;
        this.positioning = Positioning;                
        this.shirtNumber = ShirtNumber;        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }

    public double getImpulse() {
        return impulse;
    }

    public void setImpulse(double impulse) {
        this.impulse = impulse;
    }

    public double getLeader() {
        return leader;
    }

    public void setLeader(double leader) {
        this.leader = leader;
    }

    public double getOverviewDribbler() {
        return overviewDribbler;
    }

    public void setOverviewDribbler(double overviewDribbler) {
        this.overviewDribbler = overviewDribbler;
    }

    public double getPotential() {
        return potential;
    }

    public void setPotential(double potential) {
        this.potential = potential;
    }

    public double getOverviewMarking() {
        return overviewMarking;
    }

    public void setOverviewMarking(double overviewMarking) {
        this.overviewMarking = overviewMarking;
    }

    public double getOverviewDisarm() {
        return overviewDisarm;
    }

    public void setOverviewDisarm(double overviewDisarm) {
        this.overviewDisarm = overviewDisarm;
    }

    public double getOverviewFinalization() {
        return overviewFinalization;
    }

    public void setOverviewFinalization(double overviewFinalization) {
        this.overviewFinalization = overviewFinalization;
    }

    public double getOverviewCrossing() {
        return overviewCrossing;
    }

    public void setOverviewCrossing(double overviewCrossing) {
        this.overviewCrossing = overviewCrossing;
    }

    public double getOverviewPass() {
        return overviewPass;
    }

    public void setOverviewPass(double overviewPass) {
        this.overviewPass = overviewPass;
    }

    public double getPositioning() {
        return positioning;
    }

    public void setPositioning(double positioning) {
        this.positioning = positioning;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }
    
    
    
    
    public void turnOff(String name, int shirtNumber){
        
    }
    
    public void edit(String name, int ShirtNumber){
        
    }
    
}