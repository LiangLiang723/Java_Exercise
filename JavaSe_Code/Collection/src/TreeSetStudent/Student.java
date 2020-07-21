package TreeSetStudent;

public class Student {
    private String name;
    private int ChinesePerformance;
    private int MathScores;

    public Student() {
    }

    public Student(String name, int chinesePerformance, int mathScores) {
        this.name = name;
        ChinesePerformance = chinesePerformance;
        MathScores = mathScores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinesePerformance() {
        return ChinesePerformance;
    }

    public void setChinesePerformance(int chinesePerformance) {
        ChinesePerformance = chinesePerformance;
    }

    public int getMathScores() {
        return MathScores;
    }

    public void setMathScores(int mathScores) {
        MathScores = mathScores;
    }
}




