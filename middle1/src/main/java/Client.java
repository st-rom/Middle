public class Client {
    protected String name;
    protected int age;
    protected Sex sex;
    protected String email;
    public Client(String name, int age, Sex sex, String email){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email= email;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public Sex getSex(){
        return sex;
    }

    public String getEmail(){
        return email;
    }
}
