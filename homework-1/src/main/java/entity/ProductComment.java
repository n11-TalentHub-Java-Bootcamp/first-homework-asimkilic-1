package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUCT_COMMENT")
public class ProductComment {
    @SequenceGenerator(name = "product_comment_generator", sequenceName = "PRODUCT_COMMENT_ID_SEQ", allocationSize = 1)
    @Id
    @GeneratedValue(generator = "product_comment_generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "COMMENT", length = 500)
    private String comment;

    @Column(name = "COMMENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentDate;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "USER_ID")
    private Long userId;

    // Constructors
    public ProductComment() {
    }

    public ProductComment(Long id, String comment, Date commentDate, Long productId, Long userId) {
        this.id = id;
        this.comment = comment;
        this.commentDate = commentDate;
        this.productId = productId;
        this.userId = userId;
    }

    // Overrides
    @Override
    public String toString() {
        return "ProductComment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", commentDate=" + commentDate +
                ", productId=" + productId +
                ", userId=" + userId +
                '}';
    }


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
