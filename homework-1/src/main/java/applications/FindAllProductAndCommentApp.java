package applications;

import dto.product_comment.ProductWithCountOfCommentDto;
import entityservice.ProductCommentEntityService;

import java.util.List;

public class FindAllProductAndCommentApp {
    public static void main(String[] args) {
        ProductCommentEntityService productCommentEntityService = new ProductCommentEntityService();


        List<ProductWithCountOfCommentDto> productsWithCountOfComment = productCommentEntityService.findAllProductListWithCommentCount();
        for (ProductWithCountOfCommentDto productWithCountOfCommentDto : productsWithCountOfComment) {
            System.out.println(productWithCountOfCommentDto);
        }

    }
}
