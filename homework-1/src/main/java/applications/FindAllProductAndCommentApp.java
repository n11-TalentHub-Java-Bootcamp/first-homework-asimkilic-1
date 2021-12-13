package applications;

import dto.product_comment.ProductWithCountOfCommentDto;
import entityservice.ProductCommentEntityService;

import java.util.List;

public class FindAllProductAndCommentApp {
    public static void main(String[] args) {
        ProductCommentEntityService productCommentEntityService = new ProductCommentEntityService();


        List<ProductWithCountOfCommentDto> productsWithCountOfComment = productCommentEntityService.findAllProductListWithCommentCount();
        System.out.println("############################################################");
        String formatted=String.format("%-5s %-20s %-15s %s","ID","Ürün Adı","Fiyat","Yorum Sayısı");

        System.out.println(formatted);
        for (ProductWithCountOfCommentDto productDto : productsWithCountOfComment) {
            formatted=String.format("%-5s %-20s %-15s %s",productDto.getId(),productDto.getName(),productDto.getPrice(),productDto.getCountOfComment()==null?" ":productDto.getCountOfComment());
            System.out.println(formatted);

        }
        System.out.println("############################################################");

    }
}
