package accesdades.ra2.ac11.accessdades_ra2_ac11.model;

public class students {
      
    private long id;
    private String nom;
    private String cognom;
    private int age;
    private String cicle;
    private int any;
    

    public students(){
        
    }

    public students(long id, String nom, String cognom, int age, String cicle, int any) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.age = age;
        this.cicle = cicle;
        this.any = any;
    }
    // Setters
    public void setId(long id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCicle(String cicle) {
        this.cicle = cicle;
    }
    public void setAny(int any) {
        this.any = any;
    }

    //getters
    public long getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getCognom() {
        return cognom;
    }
    public int getAge() {
        return age;
    }
    public String getCicle() {
        return cicle;
    }
    public int getAny() {
        return any;
    }

}
