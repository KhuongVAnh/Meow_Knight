package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import gameStates.GameState;
import main.GamePanel;

public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;
    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        switch (GameState.state) {
            case MAIN_HALL:
                gamePanel.getGame().getMainHall().keyReleased(e);
                break;
            case MENU:
                gamePanel.getGame().getMenu().keyReleased(e);
                break;
            case PLAYING:
                gamePanel.getGame().getPlaying().keyReleased(e);
                break;
                case OPTIONS:
                gamePanel.getGame().getGameOption().keyReleased(e);
                break; 
            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (GameState.state) {
            case MAIN_HALL:
                gamePanel.getGame().getMainHall().keyPressed(e);
                break;
            case MENU:
                gamePanel.getGame().getMenu().keyPressed(e);
                break;
            case PLAYING:
                gamePanel.getGame().getPlaying().keyPressed(e);
                break;
            case OPTIONS:
                gamePanel.getGame().getGameOption().keyPressed(e);
            default:
                break;
        }
    }
}
