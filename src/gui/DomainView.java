package gui;

import game.GameController;
import gui.domain.abstractObjects.Board;
import game.Game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Odin on 2/14/2017.
 */
class DomainView extends JPanel {

    DomainView() {

        setBorder(BorderFactory.createTitledBorder("Domain"));
        setLayout(new BorderLayout());
    }

    public void setGame(Game game) {
        GameController.initGame(game);
        Board board = game.startGame();
        board.generatePieces();
        add(board);
        revalidate();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Image gamePlaceholder = ImageIO.read(new File("res/GamePlaceholder.png"));
            g.drawImage(gamePlaceholder, getX(),getY(),getWidth(),getHeight(),null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
