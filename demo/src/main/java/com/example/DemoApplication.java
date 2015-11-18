package com.example;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.dao.UserDetailRepository;
import com.example.dao.WorkOrderRepository;
import com.example.domain.UserDetail;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class);
        WorkOrder wo1 = new WorkOrder();
        wo1.setWorkOrderNo("WO-1234");
        wo1.setStatus("Open");
        wo1.setWorkType("Unscheduled");
        wo1.setCreatedOn(new Date());
        wo1.setCreatedBy("Mahesh");
        
        WorkOrder wo2 = new WorkOrder();
        wo2.setWorkOrderNo("WO-1235");
        wo2.setStatus("Open");
        wo2.setWorkType("Unscheduled");
        wo2.setCreatedOn(new Date());
        wo2.setCreatedBy("Mahesh");
        
        UserDetail user1 = new UserDetail();
        user1.setUserID("GOLDADMIN");
        user1.setUserName("Mahesh Dixit");
        user1.setEmployeeStatus("Active");
        user1.setEmployeeNo("MD-GOLDADMIN");
        user1.setEmailAddress("goldadmin@goldadmin.com");
        
        UserDetail user2 = new UserDetail();
        user2.setUserID("1234");
        user2.setUserName("ABC");
        user2.setEmployeeStatus("Active");
        user2.setEmployeeNo("1234");
        user2.setEmailAddress("1234@1234.com");
        
        UserDetail user3 = new UserDetail();
        user3.setUserID("5678");
        user3.setUserName("MD-JWL");
        user3.setEmployeeStatus("InActive");
        user3.setEmployeeNo("5678");
        user3.setEmailAddress("5678@5678.com");

        UserDetailRepository userRepository = ctx.getBean(UserDetailRepository.class);
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        WorkOrderRepository repository = ctx.getBean(WorkOrderRepository.class);
        repository.save(wo1);
        repository.save(wo2);
        for(WorkOrder workOrder : repository.findAll()){
        	System.out.println(workOrder.getWorkOrderNo());
        }
        
    }
}
