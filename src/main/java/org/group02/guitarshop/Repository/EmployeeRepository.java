package org.group02.guitarshop.Repository;

import org.group02.guitarshop.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<ProductInfo, Long> {

}