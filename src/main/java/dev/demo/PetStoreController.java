package dev.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben Outram on 15/12/15.
 */
@Controller
public class PetStoreController {

    @RequestMapping("/")
    String index(final ModelMap model) throws Exception {

        final ApiClient apiClient = new ApiClient();
        apiClient.setDebugging(false);

        final PetApi petApi = new PetApi(apiClient);

        final List<String> tags = new ArrayList<String>();
        tags.add("tag1");

        final List<Pet> pets = petApi.findPetsByTags(tags);

        model.addAttribute("pets", pets);

        return "index";
    }

}
