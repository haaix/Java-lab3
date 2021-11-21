package xuankeSystem;

public class Father {
    private String name;
    private int id;
    private String sex;

    public Father(int id, String name, String sex){
        setId(id);
        setName(name);
        setSex(sex);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

}