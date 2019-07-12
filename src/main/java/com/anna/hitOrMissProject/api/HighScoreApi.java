package com.anna.hitOrMissProject.api;

import java.util.List;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anna.hitOrMissProject.entities.HighScoreEntity;
import com.anna.hitOrMissProject.controller.HighScoreController;

@RestController
@RequestMapping("/game")
public class HighScoreApi {

	@Autowired
	private HighScoreController highScoreController;

	@PostMapping
	@RequestMapping("/highScore")
	public void addHighScore(@RequestBody HighScoreEntity highScore) throws ApplicationException {
		highScoreController.addHighScore(highScore);
	}

	@GetMapping
	@RequestMapping("/allScores")
	public List<HighScoreEntity> getAllScores() {
		return highScoreController.getAllScores();
	}

	@GetMapping
	@RequestMapping("/byName/{playerName}")
	public HighScoreEntity getScoreByPlayerName(@PathVariable String playerName) throws ApplicationException {
		return highScoreController.getScoreByPlayerName(playerName);
	}

}
