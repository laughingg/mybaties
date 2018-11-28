import dao.BookTypeDAOImpl;
import entities.BookType;
import mapping.BookTypeDAO;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class TestBookTypeDAOImpl {

    static BookTypeDAO bookTypeDao;
    @BeforeClass
    public static void beforeClass()
    {
        bookTypeDao=new BookTypeDAOImpl();
    }

    @Test
    public void testGetAllBookTypes() {
        List<BookType> booktypes=bookTypeDao.getAllBookTypes();
        for (BookType bookType : booktypes) {
            System.out.println(bookType);
        }
        assertNotNull(booktypes);
    }

}