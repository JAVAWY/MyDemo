package excel;

//学生实体类
public class Stu {

  private int id;
  private String name;
  private String num;
  private String phone;
  private String acde;
  private String touch ;
  private String health;
  private String locate;
  private String other;
  
  public Stu(){
      
  }
  
  public Stu(int id,String name,String num,String phone,String acde, String touch, String health, String locate, String other){
      this.id = id;
      this.name = name;
      this.num = num;
      this.phone = phone;
      this.acde = acde;
      this.touch= touch;
      this.health= health;
      this.locate= locate;
      this.other= other;
      
  }
  
  public String toString(){
      return "Stu[id="+id+", name="+name+", num="+num+",phone="+phone+", acde="+acde+",touch="+touch+",health="+health+",locate="+locate+",other="+other+"]";
  }

  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getnum() {
      return num;
  }

  public void setnum(String num) {
      this.num = num;
  }

  public String getphone() {
      return phone;
  }

  public void setphone(String phone) {
      this.phone=phone;
  }
  public String getacde() {
      return acde;
  }

  public void setacde(String acde) {
      this.acde = acde;
  }
  public String gettouch() {
      return touch;
  }

  public void settouch(String touch) {
      this.touch = touch;
  }
  public String gethealth() {
      return health;
  }

  public void sethealth(String health) {
      this.health = health;
  }
  public String getlocate() {
      return locate;
  }

  public void setlocate(String locate) {
      this.locate = locate;
  }
  public String getother() {
      return other;
  }

  public void setother(String other) {
      this.other = other;
  }
}