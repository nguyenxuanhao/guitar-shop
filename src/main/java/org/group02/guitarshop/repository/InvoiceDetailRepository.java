package org.group02.guitarshop.repository;

import org.group02.guitarshop.entity.InvoiceDetail;
import org.group02.guitarshop.entity.InvoiceDetailIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceDetailRepository extends JpaRepository<InvoiceDetail, InvoiceDetailIdentity> {
}
