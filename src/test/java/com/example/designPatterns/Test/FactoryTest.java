package com.example.designPatterns.Test;

import com.example.designPatterns.service.Impl.RestaurantMenuServiceImpl;
import com.example.designPatterns.service.RestaurantService;

/**
 * 工厂模式测试
 */
public class FactoryTest {
    public static void main(String[] args) {
        RestaurantService restaurantService = RestaurantMenuServiceImpl.getMenu(RestaurantMenuServiceImpl.MENU_DUCK);
        restaurantService.cook();
        restaurantService = RestaurantMenuServiceImpl.getMenu(RestaurantMenuServiceImpl.MENU_FISH);
        restaurantService.cook();
        restaurantService = RestaurantMenuServiceImpl.getMenu(RestaurantMenuServiceImpl.MENU_MEET);
        restaurantService.cook();
    }
}
