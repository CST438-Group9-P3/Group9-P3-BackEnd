package com.example.project3group9.api.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "pick")
public class Pick {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pick_id")
    private Integer pickId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Players player;

    @Column(name="selection")
    private String selection;

    @Column(name="stake")
    private Double stake;

    @Column(name="target_value")
    private Double targetValue;

    @Column(name="player_value")
    private Double playerValue;

    @Column(name="timestamp")
    private Date timestamp;

    @Column(name="status")
    private String status;

    @Column(name="result")
    private String result;

    public Pick (){};

    public Integer getPick_id() {
        return pickId;
    }
    public void setPick_id(Integer pickId) {
        this.pickId = pickId;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Players getPlayer() {
        return player;
    }
    public void setPlayer(Players player) {
        this.player = player;
    }
    public String getSelection() {
        return selection;
    }
    public void setSelection(String selection) {
        this.selection = selection;
    }
    public Double getStake() {
        return stake;
    }
    public void setStake(Double stake) {
        this.stake = stake;
    }
    public Double getTargetValue() {
        return targetValue;
    }
    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }
    public Double getPlayerValue() {
        return playerValue;
    }
    public void setPlayerValue(Double playerValue) {
        this.playerValue = playerValue;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
}
