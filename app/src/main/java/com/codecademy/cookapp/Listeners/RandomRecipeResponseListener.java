package com.codecademy.cookapp.Listeners;

import com.codecademy.cookapp.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response, String message);
    void didError(String message);

}
