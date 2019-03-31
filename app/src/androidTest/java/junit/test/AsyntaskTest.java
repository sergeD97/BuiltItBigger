package junit.test;


import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.R;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.core.deps.guava.base.CharMatcher.isNot;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;


@RunWith(AndroidJUnit4.class)
public class AsyntaskTest{

    private static String RESULT_TXT = "Hi, Serge Pessokho, Second Funny Jokes";

    @Test
    public void recip_list_test(){
        onView(withId(R.id.btn_txt)).perform(click());

        onView(withId(R.id.jokes_textView)).check(matches(not(withText(""))));
    }

}

