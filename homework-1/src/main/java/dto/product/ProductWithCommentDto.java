package dto.product;

import java.util.Date;

public class ProductWithCommentDto {
    private String productName;
    private String productComment;
    private Date commentDate;

    // Constructors
    public ProductWithCommentDto() {
    }

    public ProductWithCommentDto(String productName, String productComment, Date commentDate) {
        this.productName = productName;
        this.productComment = productComment;
        this.commentDate = commentDate;
    }
    // Overrides


    @Override
    public String toString() {
        return "ProductWithCommentDto{" +
                "productName='" + productName + '\'' +
                ", productComment='" + productComment + '\'' +
                ", commentDate=" + commentDate +
                '}';
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductComment() {
        return productComment;
    }

    public void setProductComment(String productComment) {
        this.productComment = productComment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }
}
