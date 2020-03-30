package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            interFace();
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    addStudent(array);
                    break;
                case 2:
                    deleteStudent(array);
                    break;
                case 3:
                    updateStudent(array);
                    break;
                case 4:
                    findAllStudent(array);
                    break;
                case 5:
                    System.out.println("谢谢使用！");
                    System.exit(0);
                default:
                    System.out.println("输入错误请重新输入");
            }
        }
    }

    public static void interFace() {
        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("1 添加学生");
        System.out.println("2 删除学生");
        System.out.println("3 修改学生");
        System.out.println("4 查看所有学生");
        System.out.println("5 退出");
        System.out.println("请输入你的选择");

    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                System.out.println("您输入的学号已经存在请重新输入");
                return;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String ages = sc.nextLine();
        System.out.println("请输入学生地址：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAges(ages);
        s.setAddress(address);

        array.add(s);

        System.out.println("添加成功");
    }

    public static void deleteStudent(ArrayList<Student> array) {
        System.out.println("请输入要删除的学生的学号或姓名");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(id) || s.getName().equals(id)) {
                array.remove(i);
                System.out.println("删除学生成功");
                return;
            }
        }

        System.out.println("没有找到该学生");
    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("暂时还没有学生信息，请先录入学生信息");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t地址");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t" + s.getAges() + "岁\t" + s.getAddress());

        }
    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生学号");
        String sid = sc.nextLine();

        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {

                System.out.println("请输入新姓名");
                String name = sc.nextLine();
                System.out.println("请输入新年龄");
                String ages = sc.nextLine();
                System.out.println("请输入新地址");
                String address = sc.nextLine();

                Student s = new Student();
                s.setSid(sid);
                s.setName(name);
                s.setAges(ages);
                s.setAddress(address);
                array.set(i, s);
                System.out.println("修改成功");
                return;
            }
            System.out.println("查无此学号");
        }
    }
}
