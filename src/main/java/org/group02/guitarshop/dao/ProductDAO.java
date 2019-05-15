package org.group02.guitarshop.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.group02.guitarshop.entity.Product;
import org.group02.guitarshop.exception.ProductTransactionException;
import org.group02.guitarshop.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public ProductDAO() {
    }

    public Product findById(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(Product.class, id);
    }

    public List<ProductInfo> listProductInfo() {
        String sql = "Select new " + ProductInfo.class.getName() //
                + "(e.id,e.fullName,e.balance) " //
                + " from " + Product.class.getName() + " e ";
        Session session = this.sessionFactory.getCurrentSession();
        Query<ProductInfo> query = session.createQuery(sql, ProductInfo.class);
        return query.getResultList();
    }

//    // MANDATORY: Giao dịch bắt buộc phải được tạo sẵn trước đó.
//    @Transactional(propagation = Propagation.MANDATORY)
//    public void addAmount(Long id, double amount) throws ProductTransactionException {
//        Product product = this.findById(id);
//        if (product == null) {
//            throw new ProductTransactionException("Account not found " + id);
//        }
//        double newBalance = product.getBalance() + amount;
//        if (product.getBalance() + amount < 0) {
//            throw new ProductTransactionException(
//                    "The money in the account '" + id + "' is not enough (" + product.getBalance() + ")");
//        }
//        product.setBalance(newBalance);
//    }
//
//    // Không được bắt ProductTransactionException trong phương thức này.
//    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = ProductTransactionException.class)
//    public void sendMoney(Long fromAccountId, Long toAccountId, double amount) throws ProductTransactionException {
//
//        addAmount(toAccountId, amount);
//        addAmount(fromAccountId, -amount);
//    }

}