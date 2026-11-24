import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// JUnit 4.13.2
public class GradeCalculatorTest {
    private GradeCalculator calc;

    @Before
    public void setUp() {
        calc = new GradeCalculator();
    }

    // R1: คะแนนกลางช่วง (TC01-TC08)
    @Test
    public void middleOfEachGrade() {
        assertEquals("A", calc.gradeOf(90));
        assertEquals("B+", calc.gradeOf(77));
        assertEquals("B", calc.gradeOf(72));
        assertEquals("C+", calc.gradeOf(67));
        assertEquals("C", calc.gradeOf(62));
        assertEquals("D+", calc.gradeOf(57));
        assertEquals("D", calc.gradeOf(52));
        assertEquals("F", calc.gradeOf(25));
    }

    // R2: ขอบล่างของแต่ละช่วง (TC09, 11, 13, 15, 17, 19, 21, 24)
    @Test
    public void lowerBoundOfEachGrade() {
        assertEquals("A", calc.gradeOf(80));
        assertEquals("B+", calc.gradeOf(75));
        assertEquals("B", calc.gradeOf(70));
        assertEquals("C+", calc.gradeOf(65));
        assertEquals("C", calc.gradeOf(60));
        assertEquals("D+", calc.gradeOf(55));
        assertEquals("D", calc.gradeOf(50));
        assertEquals("F", calc.gradeOf(0));
    }

    // R2: ขอบบนของแต่ละช่วง (TC10, 12, 14, 16, 18, 20, 22, 23)
    @Test
    public void upperBoundOfEachGrade() {
        assertEquals("A", calc.gradeOf(100));
        assertEquals("B+", calc.gradeOf(79));
        assertEquals("B", calc.gradeOf(74));
        assertEquals("C+", calc.gradeOf(69));
        assertEquals("C", calc.gradeOf(64));
        assertEquals("D+", calc.gradeOf(59));
        assertEquals("D", calc.gradeOf(54));
        assertEquals("F", calc.gradeOf(49));
    }

    // R3: คะแนนไม่ถูกต้อง (TC25-TC28)
    @Test(expected = IllegalArgumentException.class)
    public void scoreBelowZeroThrows() {
        calc.gradeOf(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void scoreAboveHundredThrows() {
        calc.gradeOf(101);
    }

    @Test
    public void farOutOfRangeThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.gradeOf(-50));
        assertThrows(IllegalArgumentException.class, () -> calc.gradeOf(500));
    }

    // R4: ทุกคะแนน 0-100 ได้เกรดเดียว ไม่มีช่องว่าง (TC29)
    @Test
    public void everyScoreGetsExactlyOneGrade() {
        String valid = "A B+ B C+ C D+ D F";
        for (int score = 0; score <= 100; score++) {
            String grade = calc.gradeOf(score);
            assertNotNull("score " + score, grade);
            assertTrue("score " + score, (" " + valid + " ").contains(" " + grade + " "));
        }
    }

    // NFR: เรียกซ้ำด้วยคะแนนเดิมได้ผลเหมือนเดิม (TC30)
    @Testt
    public void sameInputGivesSameResult() {
        assertEquals(calc.gradeOf(80), calc.gradeOf(80));
    }
}
