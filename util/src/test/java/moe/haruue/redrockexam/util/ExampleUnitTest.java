package moe.haruue.redrockexam.util;

import android.app.Activity;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Map<String, String> map = new HashMap<>();
        map.put("abc", "abc");
        map.put("name", "春上冰月");
        System.out.println(EncryptUtils.gainCompleteUrl("http://haruue.moe/api.php", map));
        new SharedPreferencesUtils(new Activity(), "haruue").putData("test", true);
    }
}