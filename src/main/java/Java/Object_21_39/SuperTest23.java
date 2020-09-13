package Java.Object_21_39;

/**
 * Super() 当子类没有与父类重名的方法或属性时,在子类中可以不适用super关键字进行直接调用
 * 调用父类的属性和方法,构造器时,父类的属性和方法,构造器必须在子类中是可见的
 * private 不可以 如果需要跨包 protected也不行
 *
 * 结论:
 * ① 如果变量的前面没有this,也没有super,先从局部变量开始找(就近原则),如果没有局部变量,会从本类的属性列表中开始找,最后从父类的属性列表中查找
 * ② 如果变量的前面有this,会直接从本类的属性列表中开始找,最后从父类的属性列表中查找
 * ③ 如果变量的前面有super,会直接从父类的属性列表中查找
 *
 * super() 调用父类的无参构造 ---必须在子类的构造器中使用,要求父类必须有无参构造
 * super(形参列表) 调用父类的有参构造 ---必须在子类的构造器中使用,要求父类必须有有参构造
 */
public class SuperTest23 {
    public static void main(String[] args) {
        Son son = new Son();
        son.test("父亲姓名2");
    }
}

class Father{
    protected String name = "父亲姓名";

    public Father() {
    }

    public Father(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(String name){
        System.out.println("父类①" + name + "null"); //就近原则 调用形参
        System.out.println("父类②" + this.name); //本类的属性
    }
}

class Son extends Father{
    private String nameSon = "儿子姓名";

    public Son() {
        super(); //调用父类的无参构造
    }

    public Son(String nameSon) {
        this.nameSon = nameSon;
    }

    public String getNameSon() {
        return nameSon;
    }

    public void setNameSon(String nameSon) {
        this.nameSon = nameSon;
    }

    @Override
    public void test(String name){
        super.test("---调用父类的方法---"); //赋值给了父类的test()
        System.out.println("儿子姓名③" + name); //形参
        System.out.println("儿子姓名④" + this.name); //本类的属性
        System.out.println("父亲姓名⑤" + super.name); //父类的属性
    }
}