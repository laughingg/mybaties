package mapping;

import entities.BookType;

import java.util.List;

public interface BookTypeDAO {
    /*
     * 获得所有图书类型
     */
    public List<BookType> getAllBookTypes();
}
