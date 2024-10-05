package io.github.brunogabriel.creational.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class SingletonTest {
    @BeforeEach
    public void setUp() {
        Singleton.resetInstance();
    }

    @Test
    public void shouldBeTheSame() {
        final Singleton fooSingleton = Singleton.getInstance("foo");
        final Singleton barSingleton = Singleton.getInstance("bar");

        assertThat(barSingleton, is(equalTo(fooSingleton)));
        assertThat(barSingleton.value, is(equalTo(fooSingleton.value)));
    }

    @Test
    public void shouldBeTheSameWhenConcurrently() throws InterruptedException {
        final Singleton[] instances = new Singleton[2];

        final Thread fooThread = new Thread(() -> instances[0] = Singleton.getInstance("foo"));
        final Thread barThread = new Thread(() -> instances[1] = Singleton.getInstance("bar"));
        fooThread.start();
        barThread.start();
        fooThread.join();
        barThread.join();

        assertThat(instances[0], is(equalTo(instances[1])));
        assertThat(instances[0].value, is(equalTo(instances[1].value)));
    }
}