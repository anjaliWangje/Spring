package org.example;


import lombok.Data;
import org.springframework.orm.hibernate5.HibernateTemplate;


import javax.transaction.Transactional;
import java.util.List;


    @Data
    public class DAO {
        private HibernateTemplate hibernateTemplate;

        @Transactional
        public void insert(SStudent s) {
            this.hibernateTemplate.save(s);
        }
        @Transactional
        public void delete(int i){
            SStudent student=this.hibernateTemplate.get(SStudent.class,i);
            this.hibernateTemplate.delete(student);
            System.out.println("Deleted");
        }
        @Transactional
        public void update(int i,String n){
            SStudent student=this.hibernateTemplate.get(SStudent.class,i);
            student.setStudent_name(n);

            this.hibernateTemplate.update(student);
            System.out.println("Updated");
        }
        @Transactional
        public void view(int i){
            SStudent student=this.hibernateTemplate.get(SStudent.class,i);
            System.out.println(student);
        }
        @Transactional
        public void viewall(){
            List<SStudent> li =this.hibernateTemplate.loadAll(SStudent.class);
            System.out.println(li);
        }

    }

//DriverManagerDataSource