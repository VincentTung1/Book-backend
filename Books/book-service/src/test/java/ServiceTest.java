import com.vincent.BookApplication;
import com.vincent.entity.Book;
import com.vincent.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import javax.annotation.Resource;

@SpringBootTest(classes = BookApplication.class)
public class ServiceTest {

    @Resource
    private BookService service;

    @Test
    public void testGetBookById(){
        Book book = service.getBookById(1);
        Assert.isTrue(book.getBid() == 1,"");
    }

    @Test
    public void testCreateBook(){
        service.createBook("aa","bb","XiaoMing","1999");
    }

    @Test
    public void testUpdateBook(){
        service.updateBook(1,"aa","bb","XiaoMing","1999");
    }

    @Test
    public void testDeleteBook(){
        service.deleteBook(1);
    }

}
