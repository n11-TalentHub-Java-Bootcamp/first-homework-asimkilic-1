package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @SequenceGenerator(name = "product_generator", sequenceName = "PRODUCT_ID_SEQ", allocationSize = 1)
    @Id
    @GeneratedValue(generator = "product_generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "PRICE", precision = 19, scale = 2)
    private BigDecimal price;

    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "CATEGORY_ID")
    private Long categoryId;

    // Constructors
    public Product() {
    }

    public Product(Long id, String name, BigDecimal price, Date createdDate, Long categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createdDate = createdDate;
        this.categoryId = categoryId;
    }

    // Overrides
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createdDate=" + createdDate +
                ", categoryId=" + categoryId +
                '}';
    }


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return name;
    }

    public void setProductName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
