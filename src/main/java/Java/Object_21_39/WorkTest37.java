package Java.Object_21_39;

public class WorkTest37 {
    public static void main(String[] args) {

        Students students = new Students("qujianhua",18);
        Students students1 = new Students("qujianhua",20);
        System.out.println(students.compareTo(students1));
    }
}

class Students implements Comparable{
    private String name;
    private int age;

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

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Students)){
            return 0;
        }
        //强转
        Students students = (Students) o;
        if(this.age > students.age){
            return 1;
        }else if(this.age < students.age){
            return -1;
        }else
        return 0;
    }
}
