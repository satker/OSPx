package web;

/**
 * Created by Artem on 14.11.2016.
 */
import java.util.Map;

import hiber.UsersEntity;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import servis.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/index")
    public String listContacts(Map<String, Object> map) {

        map.put("user", new UsersEntity());
        map.put("usersList", usersService.listContact());

        return "user";
    }

    @RequestMapping("/")
    public String home() {

        return "redirect:/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("User") UsersEntity users,
                             BindingResult result) {

        usersService.addUser(users);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{Id}")
    public String deleteUser(@PathVariable("Id") Integer Id) {

        usersService.removeUser(Id);

        return "redirect:/index";
    }

}
