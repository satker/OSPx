package web;

/**
 * Created by Artem on 14.11.2016.
 */

import hiber.HotelsEntity;
import hiber.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import servis.HotelsService;
import servis.UsersService;

import javax.validation.Valid;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;

    @Autowired
    private HotelsService hotelsService;

    @RequestMapping("/indexR")
    public String listContacts(Map<String, Object> map) {

        map.put("users", new UsersEntity());
        map.put("usersList", usersService.listContact());
        return "users";
    }

    @RequestMapping("//")
    public String home() {
        return "redirect:/indexR";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("users") UsersEntity users,
                             BindingResult result) {
        usersService.addUser(users);

        return "redirect:/indexR";
    }

    @RequestMapping("/delete/{Id}")
    public String deleteUser(@PathVariable("Id") Integer Id) {

        usersService.removeUser(Id);

        return "redirect:/indexR";
    }


    @RequestMapping(value = "/userArea", method = GET)
    public String listOfFavoriteHotels(Map<String, Object> map) {
        map.put("hotel", new HotelsEntity());
        map.put("hotelsList", hotelsService.listOfFavoriteHotels());
        return "userArea";
    }

    @RequestMapping(value = "/userArea/editProfile", method = GET)
    public String editUserAccount(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        UsersEntity user = usersService.getUserByUsername(name);
        user.setPassword("");
        model.addAttribute("user", user );
        return "editProfile";
    }


    @RequestMapping(value = "/userArea/editProfile", params = "edit", method = POST)
    public String updateUserData(@ModelAttribute("user") @Valid UsersEntity user,
                                 BindingResult result, Model model) {
        if (result.hasErrors()) {
            user.setPassword("");
            user.setMatchingPassword("");
            model.addAttribute("user", user);
            return "editProfile";
        }
        usersService.updateUserData(user);
        return "redirect:/userArea";
    }
}

