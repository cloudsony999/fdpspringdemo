package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("all assertj testing")
class AsserJDemo {

	@Test
	@DisplayName("boolean checking")
	void test() {
		assertThat(10 > 9).isTrue();
	}

	@Test
	@DisplayName("null checking")
	void test_null() {
		// String t = null;
		// assertThat(t).isNull();
		assertThat(new AsserJDemo()).isNotNull();
	}

	@Test
	@DisplayName("null checking")
	void test_compare() {
		Integer ac = 10;
		Integer ex = 10;
		assertThat(ac).isEqualByComparingTo(ex);

	}

	@Test
	@DisplayName("null checking")
	void test_compare_object() {
		Object ac = new Object();
		Object ex = ac;
		assertThat(ac).isSameAs(ex);

	}

	@Test
	@DisplayName("null checking")
	void test_compare_array() {
		int ac[] = { 2, 5, 7 };
		int ex[] = { 2, 5, 7 };
		assertThat(ac).isEqualTo(ex);

	}

	@Test
	@DisplayName("null checking")
	void test_compare_list() {
		List<String> ls = new ArrayList<>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		// assertThat(ls).hasSize(3);
		assertThat(ls).containsExactly("a", "b", "c");

	}

}
