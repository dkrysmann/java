package Enumertations;


public enum Season {
    SPRING(28),SUMMER(44),AUTUMN(22),WINTER(4);
    private int max;
    Season(int maxTemp){
        this.max = maxTemp;
    }
    public int getMaxTemp(){
        return this.max;
    }
}
