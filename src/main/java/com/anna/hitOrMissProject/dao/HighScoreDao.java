package com.anna.hitOrMissProject.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.anna.hitOrMissProject.entities.HighScoreEntity;
import com.anna.hitOrMissProject.enums.ErrorType;

@Repository
public class HighScoreDao {

	@PersistenceContext(unitName = "highscore")
	private EntityManager entityManager;

	@Transactional(propagation = Propagation.REQUIRED)
	public void addHighScore(HighScoreEntity highScore) throws ApplicationException {
	
		try {
			// need to cerat a query that sorts the high scores before inserts it into DB
			entityManager.persist(highScore);
		} catch (Exception e) {
			throw new com.anna.hitOrMissProject.exception.ApplicationException(e, ErrorType.INSERTION_ERROR, "Error in HighScoreDao(), can't insert High Score");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED)
	public List<HighScoreEntity> getAllScores() {
		List<HighScoreEntity> highScoresList = new ArrayList<HighScoreEntity>();

		try {
			Query query = entityManager.createQuery("SELECT highScore FROM HighScoreEntity AS highScore");
			highScoresList = query.getResultList();
			Collections.sort(highScoresList);
		}

		catch (Exception e) {
			throw new com.anna.hitOrMissProject.exception.ApplicationException(e, ErrorType.NOT_FOUND, "Can't get Scores from DB");
		}
		return highScoresList;
		
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public HighScoreEntity getScoreByPlayerName(String playerName) throws ApplicationException {
		try {
			return entityManager.find(HighScoreEntity.class, playerName);
		} catch (Exception e) {
			throw new com.anna.hitOrMissProject.exception.ApplicationException(e, ErrorType.NOT_FOUND, "Error in getScoreByPlayerName(), Can't get highScore by name");
		}
	}
}
