package web;

import hiber.UserHotelBookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import servis.BookService;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Artem on 10.12.2016.
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/indexbook")
    public String listBook(Map<String, Object> map) {

        map.put("book", new UserHotelBookEntity());
        map.put("BookList", bookService.listBook());
        return "book";
    }

    @RequestMapping("/r")
    public String home() {
        return "redirect:/indexbook";
    }


    @RequestMapping("/deletebook/{id}")
    public String deleteBook(@PathVariable("id") Integer id) {

        bookService.removeBook(id);

        return "redirect:/index";
    }
}
