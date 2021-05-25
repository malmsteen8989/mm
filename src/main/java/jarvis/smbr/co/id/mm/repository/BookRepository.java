package jarvis.smbr.co.id.mm.repository;

import org.springframework.data.repository.CrudRepository;

import jarvis.smbr.co.id.mm.entity.Book;
import jarvis.smbr.co.id.mm.entity.ids.BookId;

public interface BookRepository extends CrudRepository<Book, BookId>{
    
}
