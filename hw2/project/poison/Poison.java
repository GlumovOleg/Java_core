package hw2.project.poison;



import java.util.Random;

import cell.Cell;
import snake.Snake;
import snake_app.SnakeGame;

public class Poison extends Cell {

    private Random random;
    private Snake snake;

    public Poison(Snake snake) {
        super(-1, -1, SnakeGame.CELL_SIZE, SnakeGame.POISON_COLOR);
        random = new Random();
        this.snake = snake;
    }

    public void appear() {
        int x, y;
        do {
            x = random.nextInt(SnakeGame.CANVAS_WIDTH);
            y = random.nextInt(SnakeGame.CANVAS_HEIGHT);
        } while (snake.isInSnake(x, y));
        set(x, y);
    }

    public boolean isEatenPoison() {

        return getX() == -1;
    }

    public void eat() {
        SnakeGame.gameOver = true;

    }

    public boolean isPoison(int x, int y) {
        return (getX() == x && getY() == y);
    
    }
}
