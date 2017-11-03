package web;

/**
 * Created by Artem on 26.11.2016.
 */

import hiber.HotelsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import servis.HotelsService;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class HotelsController {
    @Autowired
    private HotelsService hotelsService;

    @RequestMapping(value = "/index", method = GET)
    public String listHotels(Map<String, Object> map,
                            @ModelAttribute("booked") final HotelsEntity bookedHotel,
                            @ModelAttribute("added") final HotelsEntity addedHotel) {

        map.put("hotel", new HotelsEntity());
        map.put("booked", bookedHotel);
        map.put("added", addedHotel);
        map.put("hotelsList", hotelsService.listHotels());
        return "hotels";
    }

    @RequestMapping(value = "/", method = GET)
    public String home() {
        return "redirect:/index";
    }


    @RequestMapping(value = "/deleteH/{hotelidint}", method = GET)
    public String deleteUser(@PathVariable("hotelidint") Integer hotelidint) {

        hotelsService.removeHotel(hotelidint);

        return "redirect:/index";
    }

    @RequestMapping(params = "favorite", method = POST)
    public String addHotelToFavorite(@ModelAttribute("hotel") HotelsEntity hotel,
                                     final RedirectAttributes redirectAttributes) {

        if (!hotelsService.existsInFavoriteList(hotel)) {
            hotelsService.addToFavorite(hotel);
        } else {
            redirectAttributes.addFlashAttribute("added", hotel);
        }
        return "redirect:/index";
    }

    @RequestMapping(params = "book", method = POST)
    public String bookRoom(@ModelAttribute("hotel") HotelsEntity hotel,
                           final RedirectAttributes redirectAttributes) {

        if (!hotelsService.existsInBookList(hotel)) {
            hotelsService.bookRoom(hotel);
        } else {
        redirectAttributes.addFlashAttribute("booked", hotel);
    }
        return "redirect:/index";
    }
}
