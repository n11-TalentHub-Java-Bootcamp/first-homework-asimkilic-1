package dto.user;

import dto.product.ProductWithCommentDto;

import java.util.ArrayList;
import java.util.List;

public class UserWithCommentListDto {
    private Long userId;
    private String userFirstName;
    private List<ProductWithCommentDto> productWithCommentList = new ArrayList<ProductWithCommentDto>();

    // Constructors
    public UserWithCommentListDto() {
    }

    public UserWithCommentListDto(Long userId, String userFirstName, List<ProductWithCommentDto> productWithCommentList) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.productWithCommentList = productWithCommentList;
    }

    // Overrides
    @Override
    public String toString() {
        return "UserWithCommentListDto{" +
                "userId=" + userId +
                ", userFirstName='" + userFirstName + '\'' +
                ", productWithCommentList=" + productWithCommentList +
                '}';
    }

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public List<ProductWithCommentDto> getProductWithCommentList() {
        return productWithCommentList;
    }

    public void setProductWithCommentList(List<ProductWithCommentDto> productWithCommentList) {
        this.productWithCommentList = productWithCommentList;
    }
}
