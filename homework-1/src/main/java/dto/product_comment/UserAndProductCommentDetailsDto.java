package dto.product_comment;

import java.math.BigDecimal;
import java.util.Date;

public class UserAndProductCommentDetailsDto {

    private String productName;
    private String categoryName;
    private BigDecimal price;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userCellPhone;
    private String comment;
    private Date commentDate;

    // Constructors
    public UserAndProductCommentDetailsDto() {
    }

    public UserAndProductCommentDetailsDto(String productName, String categoryName, BigDecimal price, String userFirstName, String userLastName, String userEmail, String userCellPhone, String comment, Date commentDate) {
        this.productName = productName;
        this.categoryName = categoryName;
        this.price = price;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userCellPhone = userCellPhone;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    // Overrides

    @Override
    public String toString() {
        return "UserAndProductCommentDetailsDto{" +
                "productName='" + productName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userCellPhone='" + userCellPhone + '\'' +
                ", comment='" + comment + '\'' +
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCellPhone() {
        return userCellPhone;
    }

    public void setUserCellPhone(String userCellPhone) {
        this.userCellPhone = userCellPhone;
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
}
