/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.player.Player;
import com.example.player.PlayerService;

@RestController
public class PlayerController {

    PlayerService playerService = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId) {
        return playerService.getPlayerById(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@RequestBody Player player, @PathVariable("playerId") int playerId) {
        return playerService.updatePlayer(playerId, player);
    }
    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId ) {
        playerService.deletePlayer(playerId);
    }
}
