package FootballTeamGenerator;


public class Player {
    private final static String EXCEPTION_MESSAGE = "%s should be between 0 and 100.";
    private final static double SKILL_COUNT = 5.0;
    private String name;
    private double endurance;
    private double dribble;
    private double passing;
    private double shooting;
    private double sprint;
    public Player(String name, double endurance, double dribble, double passing, double shooting,double sprint) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
        this.setSprint(sprint);
    }
    public String getName(){
        return this.name;
    }
    private void setSprint(double sprint){
        this.validationData(sprint,"Sprint");
        this.sprint = sprint;
    }
    private void setName(String name) {
        if(name == null || name.trim().length() == 0){
            throw new CE("A name should not be empty.");
        }
        this.name = name;
    }

    private void setEndurance(double endurance) {
        this.validationData(endurance,"Endurance");
        this.endurance = endurance;
    }

    private void setDribble(double dribble) {
        this.validationData(dribble,"Dribble");
        this.dribble = dribble;
    }

    private void setPassing(double passing) {
        this.validationData(passing,"Passing");
        this.passing = passing;
    }

    private void setShooting(double shooting) {
        this.validationData(shooting,"Shooting");
        this.shooting = shooting;
    }
    private void validationData(double data,String type){
        if(data < 0 || data > 100){
            throw new CE(String.format(EXCEPTION_MESSAGE,type));
        }
    }
    public double getSkill(){
        return (this.dribble + this.endurance + this.passing + this.shooting + this.sprint) / SKILL_COUNT;
    }
}
