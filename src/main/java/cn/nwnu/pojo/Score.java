package cn.nwnu.pojo;

/**
 * @author TurnHug
 * @date 2022/10/3 19:37
 */
public class Score {
    private int sno;
    private String name;
    private int age;
    private String sex;
    private String grade;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Score{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
