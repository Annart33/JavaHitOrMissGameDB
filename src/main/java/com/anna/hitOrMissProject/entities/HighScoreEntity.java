package com.anna.hitOrMissProject.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "allHighScores")
public class HighScoreEntity implements Comparable {
	
	public HighScoreEntity() {};
	
	public HighScoreEntity(int highScore, String playerName, String date) {
		this.highScore = highScore;
		this.playerName = playerName;
		this.date = date;
	}
	
	public HighScoreEntity(int scoreId, int highScore, String playerName, String date) {
		this.scoreId = scoreId;
		this.highScore = highScore;
		this.playerName = playerName;
		this.date = date;
	}
	

	@GeneratedValue
	@Id
	@Column(name="ScoreId", nullable=false)
	private int scoreId;

	@Column(name = "HighScore", nullable = false)
	private int highScore;

	@Column(name = "PlayerName", nullable = false)
	private String playerName;
	
	@Column(name = "Date", nullable = false)
	private String date;

	public int getScoreId() {
		return scoreId;
	}

	public void setScoreId(int scoreId) {
		this.scoreId = scoreId;
	}

	public int getHighScore() {
		return highScore;
	}

	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "HighScoreEntity [scoreId=" + scoreId + ", highScore=" + highScore + ", playerName=" + playerName
				+ ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + highScore;
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + scoreId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HighScoreEntity other = (HighScoreEntity) obj;
		if (highScore != other.highScore) {
			return false;
		}
		return true;
	}

	public int compareTo(Object o) {
		HighScoreEntity hs = (HighScoreEntity) o;
		if ( hs.getHighScore() > this.highScore) {
			return 1;
		}
		if (hs.getHighScore() < this.highScore) {
			return -1;
		}
		return 0;
	}
}
