package basic.reflection.DI_v2.container;

import basic.reflection.DI_v2.book.BookService;

public class DI_Test {
    public static void main(String[] args) {

        BookService service = ContainerService.getObject(BookService.class);
        service.addBook();
    }

    /*
        Autowried는 이해했고,
        그럼 @Component

     */
}
