package gui;

import game.collection.GameCenter;
import game.controller.GameController;
import gui.domain.abstractObjects.Board;
import game.collection.Game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Odin on 2/14/2017.
 */
class DomainView extends JPanel {

    private final GameCenter games = new GameCenter();
    private Game currentGame;
    private Board board;

    DomainView() {
        setBorder(BorderFactory.createTitledBorder("Domain"));
        setLayout(new BorderLayout());
    }

    public void setGame(String game) {
        try{
            remove(board);
        }catch (NullPointerException ignored){}
        currentGame = games.getGame(game);
        GameController.initGame(currentGame);
        board = currentGame.openGame();
        add(board);
        revalidate();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (board != null)return;
        try {
            Image gamePlaceholder = ImageIO.read(new File("res/GamePlaceholder.png"));
            g.drawImage(gamePlaceholder, getX(),getY(),getWidth(),getHeight(),null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
