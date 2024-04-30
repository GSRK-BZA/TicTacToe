package org.example;

import java.util.List;
import java.util.ArrayList;

public class Game {
    private Board board;
    private List<Player> players;
    private int currentPlayerIndex;
    private Player winner;
    private List<Move> moves;
    private GameState state;

    public Game(Board board, List<Player> players, int currentPlayerIndex, Player winner, List<Move> moves, GameState state) {
        this.board = board;
        this.players = players;
        this.currentPlayerIndex = currentPlayerIndex;
        this.winner = winner;
        this.moves = moves;
        this.state = state;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public void setCurrentPlayerIndex(int currentPlayerIndex) {
        this.currentPlayerIndex = currentPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getState() {
        return state;
    }

    public void setState(GameState state) {
        this.state = state;
    }

}
