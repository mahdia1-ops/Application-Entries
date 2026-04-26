public class gameplayer {
    private String name;
    private int score;
    public int HP;
    public int dragondamage;
    public int dragonhealth;
    public int knifedamage;
    public int legendarysworddamage;
    public int fireballDamage;
    public int iceSpikDamage;
    public int goblinkinghealth;
    public int goblinkingdamage;
    public String certificateofWest;
    public String certificateofNorth;
    public String certificateofEast;
    public String certificateofSouth;
    public String restart;

    public gameplayer(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }
    // Getters and setters for score and HP
    public int getScore() {
        return score;
    }

    public void increaseScore(int points) {
        this.score += points;
    }

    public void decreaseScore(int points) {
        this.score -= points;
    }
    // Getters and setters for HP
    public int getHp(int health) {
        return HP;
    }
    public void increaseHP(int health){
        this.HP += health;
        this.goblinkinghealth += health;
        this.dragonhealth += health;
    }
    public void decreaseHP(int health){
        this.HP -= health;
        this.dragonhealth -= health;
        this.goblinkinghealth -= health;
    }
    public int getDamage(int damage) {
        return damage;}
    public void increaseDamage(int damage){
        this.dragondamage += damage;
        this.fireballDamage += damage;
        this.legendarysworddamage += damage;
        this.knifedamage += damage;
        this.goblinkingdamage += damage;
        this.iceSpikDamage  += damage;
    }
    public String certificateofWest(String certificatesofWest) {
        return certificatesofWest;
    }
    public String certificateofEast(String certificatesofEast) {
        return certificatesofEast;
    }
    public String certificateofNorth(String certificatesofNorth) {
        return certificatesofNorth;
    }
    public String certificateofSouth(String certificatesofSouth) {
        return certificatesofSouth;
    }
    public void getCertificateofWest() {
        this.certificateofWest += certificateofWest;
    }
    public void getCertificateofEast() {
        this.certificateofEast += certificateofEast;
    }
    public void getCertificateofNorth() {
        this.certificateofNorth += certificateofNorth;
    }
    public void getCertificateofSouth() {
        this.certificateofSouth += certificateofSouth;
    }
    public void increaseCertificateofWest(String certificatesofWest) {
        this.certificateofWest += certificatesofWest;
    }
    public void increaseCertificateofEast(String certificatesofEast) {
        this.certificateofEast += certificatesofEast;
    }
    public void increaseCertificateofNorth(String certificatesofNorth) {
        this.certificateofNorth += certificatesofNorth;
    }
    public String restart(String restart) {
        return restart;
    }
    public void increaserestart(){
        this.restart += restart;
    }

}
