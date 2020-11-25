package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestaurantMenuServiceImpl {

    public static final int MENU_DUCK = 1;
    public static final int MENU_FISH = 2;
    public static final int MENU_MEET = 3;

    public static RestaurantService getMenu(int menuType) {
        switch (menuType) {
            case MENU_DUCK:
                return new RestaurantDuckServiceImpl();
            case MENU_FISH:
                return new RestaurantFishServiceImpl();
            case MENU_MEET:
                return new RestaurantMeetServiceImpl();
            default:
                return null;
        }
    }
}
