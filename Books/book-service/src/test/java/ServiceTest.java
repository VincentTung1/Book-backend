import com.vincent.BookApplication;
import com.vincent.service.BookService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = BookApplication.class)
public class ServiceTest {

    @Resource private BookService service;

    @Test
    public void testGetBookById(){
         service.getBookById(1);
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
