package dev.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben Outram on 15/12/15.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        final ApiClient apiClient = new ApiClient();
        apiClient.setDebugging(false);

        final PetApi petApi = new PetApi(apiClient);

        final List<String> tags = new ArrayList<String>();
        tags.add("tag1");

        final List<Pet> pets = petApi.findPetsByTags(tags);
        System.out.println(pets);
    }
}
