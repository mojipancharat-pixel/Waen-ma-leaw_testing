# GradeCalculator Testing

## Test Cases
[ตาราง Test Cases (Google Sheets)](https://docs.google.com/spreadsheets/d/1f5KxAeTa7YMZmrZM53eqUujeoJYQ2w_fVDi4CfW8iFY/edit?usp=sharing)

| TC ID | Technique | score | Expected return | เป้าหมาย | Actual | Status |
|:-:|:-:|:-:|:-:|---|:-:|:-:|
| TC01 | Equivalence Partitioning | 90 | A | คะแนนกลางช่วง A | | Not run |
| TC02 | Equivalence Partitioning | 77 | B+ | คะแนนกลางช่วง B+ | | Not run |
| TC03 | Equivalence Partitioning | 72 | B | คะแนนกลางช่วง B | | Not run |
| TC04 | Equivalence Partitioning | 67 | C+ | คะแนนกลางช่วง C+ | | Not run |
| TC05 | Equivalence Partitioning | 62 | C | คะแนนกลางช่วง C | | Not run |
| TC06 | Equivalence Partitioning | 57 | D+ | คะแนนกลางช่วง D+ | | Not run |
| TC07 | Equivalence Partitioning | 52 | D | คะแนนกลางช่วง D | | Not run |
| TC08 | Equivalence Partitioning | 25 | F | คะแนนกลางช่วง F | | Not run |
| TC09 | Boundary Value Analysis | 80 | A | ขอบล่างของช่วง A | | Not run |
| TC10 | Boundary Value Analysis | 100 | A | ขอบบนสุดของช่วง A | | Not run |
| TC11 | Boundary Value Analysis | 75 | B+ | ขอบล่างของช่วง B+ | | Not run |
| TC12 | Boundary Value Analysis | 79 | B+ | ขอบบนของช่วง B+ (ติดกับ A) → ต้องไม่ใช่ A | | Not run |
| TC13 | Boundary Value Analysis | 70 | B | ขอบล่างของช่วง B | | Not run |
| TC14 | Boundary Value Analysis | 74 | B | ขอบบนของช่วง B (ติดกับ B+) → ต้องไม่ใช่ B+ | | Not run |
| TC15 | Boundary Value Analysis | 65 | C+ | ขอบล่างของช่วง C+ | | Not run |
| TC16 | Boundary Value Analysis | 69 | C+ | ขอบบนของช่วง C+ (ติดกับ B) → ต้องไม่ใช่ B | | Not run |
| TC17 | Boundary Value Analysis | 60 | C | ขอบล่างของช่วง C | | Not run |
| TC18 | Boundary Value Analysis | 64 | C | ขอบบนของช่วง C (ติดกับ C+) → ต้องไม่ใช่ C+ | | Not run |
| TC19 | Boundary Value Analysis | 55 | D+ | ขอบล่างของช่วง D+ | | Not run |
| TC20 | Boundary Value Analysis | 59 | D+ | ขอบบนของช่วง D+ (ติดกับ C) → ต้องไม่ใช่ C | | Not run |
| TC21 | Boundary Value Analysis | 50 | D | ขอบล่างของช่วง D | | Not run |
| TC22 | Boundary Value Analysis | 54 | D | ขอบบนของช่วง D (ติดกับ D+) → ต้องไม่ใช่ D+ | | Not run |
| TC23 | Boundary Value Analysis | 49 | F | ขอบบนของช่วง F (ติดกับ D) → ต้องไม่ใช่ D | | Not run |
| TC24 | Boundary Value Analysis | 0 | F | ขอบล่างสุดของช่วง F | | Not run |
| TC25 | Boundary Value Analysis | -1 | IllegalArgumentException | คะแนนต่ำกว่าขอบล่างสุด 1 หน่วย | | Not run |
| TC26 | Boundary Value Analysis | 101 | IllegalArgumentException | คะแนนสูงกว่าขอบบนสุด 1 หน่วย | | Not run |
| TC27 | Equivalence Partitioning | -50 | IllegalArgumentException | คะแนนติดลบมาก | | Not run |
| TC28 | Equivalence Partitioning | 500 | IllegalArgumentException | คะแนนเกิน 100 มาก | | Not run |
| TC29 | Exhaustive Testing | 0–100 | A/B+/B/C+/C/D+/D/F | ทุกคะแนน 0–100 ได้เกรดเดียว ไม่มี null ไม่โยน exception (101 ค่า) | | Not run |
| TC30 | Error Guessing | 80 (เรียก 2 ครั้ง) | A | เรียกซ้ำด้วยคะแนนเดิมได้ผลเหมือนเดิม | | Not run |

## Requirements from the exercise

| Req ID | Requirement | Test Case |
|:-:|---|:-:|
| R1 | แปลงคะแนนค่ากลางช่วงเป็นเกรดถูกต้อง (80–100 = A, 75–79 = B+, 70–74 = B, 65–69 = C+, 60–64 = C, 55–59 = D+, 50–54 = D, 0–49 = F) | TC01–TC08 |
| R2 | แปลงคะแนนค่าขอบของแต่ละช่วงถูกต้อง | TC09–TC24 |
| R3 | คะแนน < 0 หรือ > 100 ต้องโยน IllegalArgumentException | TC25–TC28 |
| R4 | ทุกคะแนน 0–100 ได้เกรดเดียว ไม่มีช่องว่างระหว่างช่วง | TC29 |
| NFR | เรียกซ้ำด้วยคะแนนเดิมต้องได้ผลเหมือนเดิม | TC30 |
