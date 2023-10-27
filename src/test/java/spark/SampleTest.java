package spark;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleTest {
    @Test
    public void testFetchSampleString() {
        Assert.assertEquals("This is a sample string", Sample.fetchSampleString());
    }
}
