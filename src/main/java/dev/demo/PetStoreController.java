package dev.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben Outram on 15/12/15.
 */
@Controller
public class PetStoreController {

    private static final String VIEW_PET = "pet";
    private static final String VIEW_PETS = "pets";

    @Autowired
    private PetApi petApi;

    @RequestMapping(value = "/pet" )
    String index(@RequestParam("petId") Long petId, final ModelMap model) throws Exception {

        final Pet pet = petApi.getPetById(petId);

        model.addAttribute("petId", petId);
        model.addAttribute("pet", pet);

        return VIEW_PET;
    }


    @RequestMapping(value = "/pets" )
    String petsByTag(@RequestParam("tags") List<String> tags, final ModelMap model) throws Exception {

        final List<Pet> pets = petApi.findPetsByTags(tags);

        model.addAttribute("pets", pets);

        return VIEW_PETS;
    }
}
