package tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromFile;

public class DocFileTests {
    private final String expectedData = "How can I download some file in my test?";

    @Test
    void checkDocFile() {
        String nameDocFile = "1.doc";
        String actualData = readTextFromFile(nameDocFile);
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void checkDocxFile() {
        String nameDocxFile = "1.docx";
        String actualData = readTextFromFile(nameDocxFile);
        assertThat(actualData, containsString(expectedData));
    }
}
