class ScoreBox {
    private int score;

    public ScoreBox(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative.");
        }
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative.");
        }
        this.score = score;
    }
}

public class ObjectReferenceLab {

    static void addBonus(ScoreBox box, int bonus) {
        box.setScore(box.getScore() + bonus);
    }

    static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(100);
        System.out.println("Inside replaceLocally: " + box.getScore());
    }

    static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }

    public static void main(String[] args) {

        ScoreBox box1 = new ScoreBox(50);
        ScoreBox box2 = box1;

        ScoreBox box3 = new ScoreBox(30);

        System.out.println("box1 == box2: " + (box1 == box2));
        System.out.println("box1 == box3: " + (box1 == box3));

        addBonus(box2, 20);

        System.out.println("box1 score: " + box1.getScore());
        System.out.println("box2 score: " + box2.getScore());

        replaceLocally(box1);

        System.out.println("box1 score after replaceLocally: " + box1.getScore());

        ScoreBox box4 = createScoreBox(80);

        System.out.println("box4 score: " + box4.getScore());
        System.out.println("box1 == box4: " + (box1 == box4));
        System.out.println("box3 == box4: " + (box3 == box4));
    }
}