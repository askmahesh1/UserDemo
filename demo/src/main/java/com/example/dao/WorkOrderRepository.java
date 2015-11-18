package com.example.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.example.WorkOrder;


@Repository
public interface WorkOrderRepository extends CrudRepository <WorkOrder, String> {

}
