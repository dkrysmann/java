
public class CreateAccount {
    private String name;
    private int age;
    private String gender;
    private int Id;

    public CreateAccount(String name,int age,String gender,int Id){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.Id = Id;
    }

    private String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private String getGender() {
        return this.gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    private int getId() {
        return this.Id;
    }

    private void setId(int id) {
        this.Id = id;
    }
    public void changeId(int id){
        this.setId(id);
    }
    public String printInformation(){
        return String.format("Name - %s%nAge - %s%nGender - %s%nId - %s"
                ,this.getName(),this.getAge(),this.getGender(),this.getId());
    }
}
