import java.beans.Transient;

public class mainTest {
    
    @Test
    public void test01(){
        main obj = new main();
        assertEqualas(expected: 7, obj.formulaTwo(x: 2, y : 3));
    }

}
