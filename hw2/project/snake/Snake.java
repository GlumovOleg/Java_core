package hw2.project.snake;


import java.awt.Graphics2D;
import java.util.LinkedList;

import cell.Cell;
import food.Food;
import poison.Poison;
import snake_app.SnakeGame;

public class Snake {
    private LinkedList<Cell> snake;
    private int direction;
    private Food food;
    private Poison poison;

    public Snake(int x, int y, int length, int direction) {
        snake = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            snake.add(new Cell(x - i, y, SnakeGame.CELL_SIZE, SnakeGame.SNAKE_COLOR));
        }
        this.direction = direction;
    }

    public int size() {
        return snake.size();
    }

    public void setDirection(int direction) {
        if ((direction >= SnakeGame.KEY_LEFT) && (direction <= SnakeGame.KEY_DOWN)) {
            if (Math.abs(this.direction - direction) != 2) {
                this.direction = direction;
            }
        }
    }

    public void move() {
        int x = snake.getFirst().getX();
        int y = snake.getFirst().getY();
        switch (direction) {
            case SnakeGame.KEY_LEFT:
                x--;
                if (x < 0)
                    x = SnakeGame.CANVAS_WIDTH - 1;
                break;
            case SnakeGame.KEY_RIGTH:
                x++;
                if (x == SnakeGame.CANVAS_WIDTH)
                    x = 0;
                break;
            case SnakeGame.KEY_UP:
                y--;
                if (y < 0)
                    y = SnakeGame.CANVAS_HEIGHT - 1;
                break;
            case SnakeGame.KEY_DOWN:
                y++;
                if (y == SnakeGame.CANVAS_HEIGHT)
                    y = 0;
                break;
        }

        snake.addFirst(new Cell(x, y, SnakeGame.CELL_SIZE, SnakeGame.SNAKE_COLOR));
        if (food.isFood(x, y)) {
            food.eat();
        }
        else {
            snake.removeLast();
        }
        if (poison.isPoison(x, y) || poison.isPoison(x, y)) {
            SnakeGame.gameOver = true;
            System.out.println("Game Over");
            return;
        }

    }

    public void paint(Graphics2D g) {
        for (Cell cell : snake) {
            cell.paint(g);
        }
    }

    public boolean isInSnake(int x, int y) {
        for (Cell cell : snake) {
            if ((cell.getX() == x) && (cell.getY() == y)) {
                return true;
            }
        }
        return false;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Poison getPoison() {
        return poison;
    }

    public void setPoison(Poison poison) {
        this.poison = poison;
    }
}
