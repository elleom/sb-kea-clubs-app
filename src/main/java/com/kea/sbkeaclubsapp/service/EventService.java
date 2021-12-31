package com.kea.sbkeaclubsapp.service;

import com.kea.sbkeaclubsapp.model.Event;

import java.util.List;

/**
 * @author el_le
 * @since 31/12/2021 18:39
 */
public interface EventService {

    List<Event> getEvents();

    Event findById(Long l) throws Exception;

//    RecipeCommand findCommandById(Long l);
//    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);

    void deleteById(Long idToDelete);

    Event editById(Long l);

}
