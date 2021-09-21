import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by Hubert - Hung Tran
 */

class Enemy {
    int x;
    int y;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Enemy() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean match(int x, int y) {
        return this.x == x && this.y == y;
    }
}

class Map {
    String [][] data;

    public Map() {
        data = new String[][] {
                {"-", "W", "-", "-", "-"},
                {"-", "K", "-", "-", "-"},
                {"-", "W", "-", "-", "-"},
                {"-", "W", "W", "W", "-"},
                {"-", "-", "-", "-", "-"},
                {"-", "-", "-", "-", "E"}
        };
    }

    public int height() {
        return data.length;
    }

    public int width() {
        return data[0].length;
    }

    public boolean isValid(int x, int y) {
//        if (x < 0 || x >= width()) return false;
//        if (y < 0 || y >= height()) return false;
//        return true;
        return x >= 0 && x < width()
                && y >= 0 && y < height();
    }

    public String cellAt(int x, int y) {
        if (!isValid(x, y)) return null;
        return data[y][x];
    }

    public void setCellAt(int x, int y, String value) {
        if (!isValid(x, y)) return;
        data[y][x] = value;
    }

    public int count(String value) {

        int result = 0;

        for (String[] row : data) {
            for (String cell : row) {
                if (cell.equalsIgnoreCase(value)) {
                    result++;
                }
            }
        }

        return result;
    }

    public void print() {
        for(String[] row : data) {
            for(String cell : row) {
                System.out.print(cell);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Map testMap = new Map();

        testMap.setCellAt(2, 1, "y");
        testMap.print();
    }
}

class Player {
    int x;
    int y;

    public Player() {
        this.x = 0;
        this.y = 0;
    }

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter & Setter

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean match(int x, int y ) {
        return this.x == x && this.y == y;
    }

    public static void main(String[] args) {
        Player playerTest = new Player(6, 7);

        playerTest.setX(2);

        playerTest.setY(4);
        System.out.println(playerTest.getX() + " " + playerTest.getY());
    }
}


class DungeonMaster {
    Map map;
    Player player;
    boolean gameEnd = false;
    boolean winning = false;
    ArrayList<Enemy> enemies;

    public DungeonMaster() {
        map = new Map();
        player = new Player();
        enemies = new ArrayList<>();

        //Test
//        enemies.add(new Enemy(2, 1));
//        enemies.add(new Enemy(3, 4));
        spawnEnemies();
    }

    class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void spawnEnemies() {
        // List all candidate position
        ArrayList<Point> candidatePosition = new ArrayList<>();
        Random random = new Random();

        for (int y = 0; y < map.height(); y++) {
            for (int x = 0; x < map.width(); x++) {
                if (!player.match(x, y) &&
                        map.cellAt(x, y).equalsIgnoreCase("-")) {
                    Point candidate = new Point(x, y);
                    candidatePosition.add(candidate);
                }
            }
        }
        // Random enemy position
        for (int i = 0; i < 2; i++) {
            if (candidatePosition.size() == 0) break;
            int index= random.nextInt(candidatePosition.size());
            Point p = candidatePosition.get(index);
            candidatePosition.remove(index);
            enemies.add(new Enemy(p.x, p.y));
        }

    }


    public void runCommand(String cmd) {
        int dx = 0;
        int dy = 0;

        if (cmd.equalsIgnoreCase("w")) dy = -1;
        else if (cmd.equalsIgnoreCase("s")) dy = 1;
        else if (cmd.equalsIgnoreCase("a")) dx = -1;
        else if (cmd.equalsIgnoreCase("d")) dx = 1;

        int nextX = player.getX() + dx;
        int nextY = player.getY() + dy;


        //Outside map
        if (!map.isValid(nextX, nextY)) return;

        String cellAtNextPosition = map.cellAt(nextX, nextY);

        // Hit a wall

        if (cellAtNextPosition.equalsIgnoreCase("w")) return;

        if (cellAtNextPosition.equalsIgnoreCase("k")) {
            System.out.println("You got the key");
            map.setCellAt(nextX, nextY, "-");
        }

        if(cellAtNextPosition.equalsIgnoreCase("e")) {
            if (map.count("k") == 0) {
                System.out.println("You won!");
                gameEnd = true;
                winning = true;
            } else {
                System.out.println("Get the key, dude");
            }
        }

        // Valid Move
        player.setX(nextX);
        player.setY(nextY);


    }

    public void print() {
        for(int y = 0; y < map.height() ;y++) {
            for (int x = 0; x < map.width(); x++) {
                if (!printPlayer(x, y)) {
                    if (!printEnemies(x, y)) {
                        System.out.print(map.cellAt(x, y));
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public boolean printPlayer(int x ,int y) {
        if (player.match(x, y)) {
            System.out.print("P ");
            return true;
        } else {
            return false;
        }
    }

    public boolean printEnemies(int x,int y) {
        for (Enemy enemy : enemies) {
            if (enemy.match(x, y)) {
                System.out.print("M ");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DungeonEscape master= new DungeonEscape();
    }
}

public class DungeonEscape implements StupidTextGame {
	public String getName() {
		return "DungeonEscape";
	}

	@Override
	public void play(Scanner console) {
		DungeonMaster dungeonMaster = new DungeonMaster();
        Scanner keyboardScanner = new Scanner(System.in);
        
        System.out.println("You command?");
        while(!dungeonMaster.gameEnd) {
            dungeonMaster.print();

            System.out.println("You command?");
            String command = keyboardScanner.nextLine();
            dungeonMaster.runCommand(command);
        }
		
	}
}
