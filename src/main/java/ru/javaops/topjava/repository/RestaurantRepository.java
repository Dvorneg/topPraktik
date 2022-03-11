package ru.javaops.topjava.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import ru.javaops.topjava.model.Restaurant;

import java.util.Optional;

@Transactional(readOnly = true)
public interface RestaurantRepository extends BaseRepository<Restaurant> {

    //@Query("SELECT m FROM Meal m WHERE m.id = :id and m.user.id = :userId")
    //Optional<Meal> get(int id, int userId);
    @Query("SELECT r FROM Restaurant r WHERE r.id = :id")
    Optional<Restaurant> get(int id);

/*  Получить на дату и по номеру ресторана меню (блюдо, цена)
    SELECT MENU_ITEM.NAME,price FROM MENU_ITEM
    join MENU  M2 on MENU_ITEM.MENU_ID = M2.ID
    join RESTAURANT R on M2.RESTAURANT_ID = R.ID
    WHERE MENU_DATE = '2022-02-01 10:00:00' AND RESTAURANT_ID = 1*/


/*
  Получить меню всех ресторанов на дату
  SELECT  R.NAME ,MENU_ITEM.NAME, PRICE FROM MENU_ITEM
    INNER join MENU  M2 on MENU_ITEM.MENU_ID = M2.ID
    INNER join RESTAURANT R on M2.RESTAURANT_ID = R.ID
    WHERE MENU_DATE > '2022-02-01 00:00:00' AND MENU_DATE < '2022-02-01 23:59:59'*/

/*    @Query("SELECT  R.NAME ,MENU_ITEM.NAME, PRICE FROM MENU_ITEM
            "    INNER join MENU  M2 on MENU_ITEM.MENU_ID = M2.ID" +
            "    INNER join RESTAURANT R on M2.RESTAURANT_ID = R.ID" +
            "    WHERE MENU_DATE > '2022-02-01 00:00:00' AND MENU_DATE < '2022-02-01 23:59:59'")
    Optional<Object> getGo(int id);*/

}
