## 一、实验目的
1. 掌握权限访问控制修饰符的使用。
2. 掌握继承的使用。

## 二、实验要求
1. 保持实验二的代码和readme版本不变
2. 新建代码仓库，在实验二代码的基础上完成本次实验
3. 业务过程同实验二，但在类的设计上，采用父类-子类的继承关系定义
4. 测试实体类分别存放于不同的package中，验证权限访问控制、继承后续属性及方法的可见性。

## 三、实验过程 
1. 创建父类Father，通过继承，创建子类Teacher和Student。
   将学生和老师相同的属性放入Father中，并把权限设为private。
2. 使用super关键字，用setID函数改变构造函数。创建getID函数，用于返回每个类的属性值。name,sex等同getID。
3. 把课组里的教师属性改为Teacher类的实例化对象，通过调用setTeacher函数的方式，将实例化后的教师，添加到实例化的课程中。

## 四、主要代码
1. 创建父类Father，设为private，通过set函数给属性赋值。
```java
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
```
2. 继承父类，创建子类，通过super关键字，设置构造函数，给父类和子类中各属性赋值。
```java
public class Student extends Father {
    Course[] stu_cour  = new Course[5];//储存学生选的课程

    //构造函数
    public Student(int id, String name, String sex) {
        super(id,name,sex);

    }
```
```java
public class Teacher extends Father {

    Course[] tea_cour = new Course[5];
    int i;

    public Teacher(int id,String name,String sex){
        super(id, name, sex);
    }
```
3. 将课组里的教师属性，更改为Teacher类的实例化对象。
```java
public class Course {
    //课程的属性
    private int id;
    private String name;
    private Teacher tea;  //授课教师
    private String place;  //上课地点
    private int week;  //上课周几
    private String time;  //上课时间
    private int stu_num;  //学生数量

    //构造函数
    public Course(int id,String name,String place,int week,String time,int stu_num){
        this.id = id;
        this.name = name;
        // tea = teacher;
        this.place = place;
        this.week = week;
        this.time = time;
        this.stu_num = stu_num;
    }
```
5. 通过调用setTeacher函数的方式，将实例化后的教师，添加到实例化的课程中。
```java
        Teacher t1 = new Teacher(1,"张三","男");
        Teacher t2 = new Teacher(2,"李四","男");
        Teacher t3 = new Teacher(3,"王五","男");

        c1.setTeacher(t1);
        c2.setTeacher(t2);
        c3.setTeacher(t3);
        c4.setTeacher(t2);
        c5.setTeacher(t3);
```

## 五、流程图
![](https://github.com/haaix/Java-lab3/blob/main/%E6%B5%81%E7%A8%8B%E5%9B%BE.png)

## 六、运行截图
**教师界面**
![](https://github.com/haaix/Java-lab3/blob/main/%E8%80%81%E5%B8%88%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png)
<br> **学生界面**
![](https://github.com/haaix/Java-lab3/blob/main/%E5%AD%A6%E7%94%9F%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png)

## 七、实验感想
&emsp;&emsp;继承和权限是java应用非常重要的一个部分，有时候就算你能完整的运行一个程序也不见得这个程序是很好的，
所以我们要养成一个好的习惯将程序模块化，这就用到继承了，以前没学习之前我就觉得代码怎么短怎么舒服就怎么写最好，
但是并不是，我们用java编程不仅仅局限于实现更重要的是拓展，这样才会有更好的进补。
