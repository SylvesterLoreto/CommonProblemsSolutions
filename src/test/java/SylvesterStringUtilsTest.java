import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SylvesterStringUtilsTest {

    @Test
    public void thatStringPotatoesIsReversed() throws Exception {
        final String original = "potatoes";
        final SylvesterStringUtils sylvesterStringUtils = new SylvesterStringUtils();
        final String stringReversed = sylvesterStringUtils.reverse(original);
        
        assertThat("seotatop", is(equalTo(stringReversed)));
    }
}