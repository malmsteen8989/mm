package jarvis.smbr.co.id.mm.service;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jarvis.smbr.co.id.mm.entity.Book;
import jarvis.smbr.co.id.mm.repository.BookRepository;


@Service
public class MMService {
    @Autowired
    BookRepository bookRepository;

    ObjectMapper om = new ObjectMapper();

    @Transactional
    public String bookHandler(String payload) {
        Book bookArr[];
        try {
            bookArr = om.readValue(payload, Book[].class);
            List<Book> bookList = Arrays.asList(bookArr);
            System.err.println("jumlah data = " + bookList.size());
            bookRepository.saveAll(bookList);
            return "Book Save Succeded";
        } catch (JsonProcessingException je) {
            return "Json Processing Error " + je;
        } catch (HibernateException he) {
            return "Hibernate Exception " + he;
        } catch (Exception e) {
            return "Something going wrong " + e;
        }
        
    }

    
}