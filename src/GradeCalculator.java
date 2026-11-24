// GradeCalculator: แปลงคะแนนเป็นเกรด (เวอร์ชันหลัง refactor ผ่านทุกเทสต์)
// 80-100 -> "A"     75-79 -> "B+"
// 70-74  -> "B"     65-69 -> "C+"
// 60-64  -> "C"     55-59 -> "D+"
// 50-54  -> "D"     0-49  -> "F"
// score < 0 หรือ > 100 -> IllegalArgumentException
public class GradeCalculator {
    private static final int[] MIN = {80, 75, 70, 65, 60, 55, 50};
    private static final String[] GRADE = {"A", "B+", "B", "C+", "C", "D+", "D"};

    public String gradeOf(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("score must be 0-100");
        }
        for (int i = 0; i < MIN.length; i++) {
            if (score >= MIN[i]) return GRADE[i];
        }
        return "F";
    }
}