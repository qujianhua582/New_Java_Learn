package Java.Object_8_20;

public class WorkTest19 {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Girl girl = new Girl("zy",19);
        Girl girl1 = new Girl("zy",20);
        boy.marry(girl);
        girl.marry(boy);
        girl.compare(girl1);
    }
}


class Boy{
    private String name;
    private int age;

    public Boy() {
        name = "qjh";
        age = 18;
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Girl girl){

        System.out.println(this.name+"一定要娶"+girl.getName());
    }

    public void shout(){

    }
}

class Girl{
    private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy){
        System.out.println(this.name+"一定要嫁"+boy.getName());
    }

    /**
     * 比较两个对象的大小
     * @param girl
     */
    public void compare(Girl girl){
        if(this.name.equals(girl.getName())){
            System.out.println("相同");
        }
    }
}