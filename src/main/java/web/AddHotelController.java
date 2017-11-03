package web;

/**
 * Created by Artem on 28.11.2016.
 */
import java.util.Map;

import hiber.HotelsEntity;
import servis.HotelsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddHotelController {
    @Autowired
    private HotelsService hotelsService;

    @RequestMapping("/addhotel")
    public String listHotels(Map<String, Object> map) {

        map.put("addhotel", new HotelsEntity());
        map.put("addhotelList", hotelsService.listHotels());
        return "addhotel";
    }

    @RequestMapping("////")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/addhotelc", method = RequestMethod.POST)
    public String addHotel(@ModelAttribute("addhotel") HotelsEntity hotels,
                           BindingResult result) {
        hotelsService.addHotel(hotels);

        return "redirect:/index";
    }

}
