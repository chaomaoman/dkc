package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        String names[]=ctx.getBeanDefinitionNames();
        for (String na:names){
            System.out.println(na);

        }

    }
    @Test
    public void testServiceInsert(){
        String config="applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        StudentService studentService= (StudentService) ctx.getBean("studentService");
        Student student=new Student();
        student.setId(1013);
        student.setName("小李");
        student.setAge(56);
        student.setEmail("17893456@qq.com");
        int nums=studentService.addStudent(student);
        System.out.println(nums);

    }
    @Test
    public void testServiceSelect(){
        String config="applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        StudentService studentService= (StudentService) ctx.getBean("studentService");
        List<Student> students=studentService.selectStudents();
        for (Student stu:students){
            System.out.println(stu);


        }

    }
}
