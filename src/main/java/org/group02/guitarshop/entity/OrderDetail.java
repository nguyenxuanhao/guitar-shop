package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @EmbeddedId
    private PrimaryKey pk;

    @Embeddable
    public static class PrimaryKey implements Serializable {
        @Column(name = "product_id", nullable = false)
        private Integer productId;

        public Integer getProductId() {
            return productId;
        }

        public void setProductId(Integer productId) {
            this.productId = productId;
        }

        public Integer getOrderId() {
            return orderId;
        }

        public void setOrderId(Integer orderId) {
            this.orderId = orderId;
        }

        public PrimaryKey(Integer productId, Integer orderId) {
            this.productId = productId;
            this.orderId = orderId;
        }

        @Column(name = "order_id", nullable = false)
        private Integer orderId;

        public PrimaryKey() {
        }
    }
}
