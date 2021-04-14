package data_structures_and_algorithms.Exam;

public class Student {
    private String name;
    private String class_;
    private String code;
    private double mediumScore;

    public Student() {
    }

    public Student(String name, String class_, String code, double mediumScore) {
        this.name = name;
        this.class_ = class_;
        this.code = code;
        this.mediumScore = mediumScore;
    }

    public String getName() {
        return name;
    }

    public String getClass_() {
        return class_;
    }

    public String getCode() {
        return code;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    @Override
    public String toString() {
        return name+" "+class_+" "+code+" "+mediumScore;
    }
}
