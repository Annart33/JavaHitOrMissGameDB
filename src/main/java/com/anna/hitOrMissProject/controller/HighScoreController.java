package com.anna.hitOrMissProject.controller;

import java.util.List;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.anna.hitOrMissProject.entities.HighScoreEntity;
import com.anna.hitOrMissProject.dao.HighScoreDao;

@Controller
public class HighScoreController {

	@Autowired
	private HighScoreDao highScoreDao;

	public void addHighScore(HighScoreEntity highScore) throws ApplicationException {
		highScoreDao.addHighScore(highScore);
	}

	public List<HighScoreEntity> getAllScores() {
		return highScoreDao.getAllScores();

	}

	public HighScoreEntity getScoreByPlayerName(String playerName) throws ApplicationException {
		return highScoreDao.getScoreByPlayerName(playerName);
	}

}
