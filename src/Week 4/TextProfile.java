class Profile {
    private String name;
    private int age;
    private double heightMetres;

    public Profile(String name, int age, double heightMetres) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }

        if (heightMetres <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }

        this.name = name;
        this.age = age;
        this.heightMetres = heightMetres;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeightMetres() {
        return heightMetres;
    }
}

public class TextProfile {
    public static void main(String[] args) {
        String name = args[0];
        String ageText = args[1];
        String heightText = args[2];

        int age = Integer.parseInt(ageText);
        double heightMetres = Double.parseDouble(heightText);

        Profile profile = new Profile(name, age, heightMetres);

        String ageAgain = Integer.toString(profile.getAge());
        String heightAgain = Double.toString(profile.getHeightMetres());

        System.out.println("Name: " + profile.getName());
        System.out.println("Age: " + profile.getAge());
        System.out.println("Height: " + profile.getHeightMetres());

        System.out.println("Age : " + ageAgain);
    }
}