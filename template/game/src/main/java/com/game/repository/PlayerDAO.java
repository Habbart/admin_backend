package com.game.repository;

import com.game.entity.Player;

import java.util.List;
import java.util.Map;

public interface PlayerDAO {

    List<Player> getAllPlayers();

    Player createPlayer(Player player);

    Player getPlayerById(long id);

    void deletePlayer(long id);


}