package basic.reflection.DI_v2.book;

import basic.reflection.DI_v2.container.Inject;

public class BookService {
    @Inject
    BookRepository bookRepository;

    public void addBook(){
        bookRepository.save();
    }
}
