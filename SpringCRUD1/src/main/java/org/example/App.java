package org.example;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

    public class App {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("cfg.xml");
            DAO dao = context.getBean("dao", DAO.class);

            SStudent student = new SStudent();
            // student.setStudent_id(3);
            student.setStudent_name("ABC");
            // dao.insert(student);
//dao.delete();
            //   dao.update(2,"DEF");
            //dao.view(2);
            dao.viewall();
        }
    }
