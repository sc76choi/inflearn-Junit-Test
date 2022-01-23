package com.sc.web.inflearnJunitTest;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudyTest {
	
	int value = 1;

	@Order(1)
	@DisplayName("순서 1")
	@Test
	void orderTest1() {
		System.out.println(1 + " " + value++);
	}
	
	@Order(2)
	@DisplayName("순서 3")
	@Test
	void orderTest3() {
		System.out.println(3 + " " + value++);
	}
	@Order(3)
	@DisplayName("순서 2")
	@Test
	void orderTest2() {
		System.out.println(2 + " " + value++);
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("beforeAll");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("afterAll");
	}
	
	
	
//	
//	@DisplayName("스터디 만들기 - @ValueSource")
//	@ParameterizedTest(name = "{index} {displayName} - {0}")
//	@ValueSource(ints = {10, 20, 40})
//	void parameterizedTest(int limit) {
//		System.out.println(limit);
//	}
	
//	@DisplayName("스터디 만들기")
//	@RepeatedTest(value = 10, name = "{displayName}, {currentRepetition}/{totalRepetitions}")
//	void repeatTest(RepetitionInfo repetitionInfo) {
//		System.out.println(
//				"test" + ": " + repetitionInfo.getCurrentRepetition() + "/" + repetitionInfo.getTotalRepetitions());
//	}

//	@DisplayName("스터디 만들기")
//	@ParameterizedTest(name = "{index} {displayName} - {0}")
//	@ValueSource(strings = {"날씨가", "많이", "춥다"})
//	@NullAndEmptySource
//	void parameterizedTest(String message) {
//		System.out.println(message);
//	}
	
//	@Test
//	@DisplayName("스터디 만들기 \uD83D\uDE31")
////	"스터디를 처음 만들면 DRAFT 상태여야 한다."
//	void create_new_study() {
//
//		assertTimeout(Duration.ofMillis(500), () -> {
//			new Study(10);
//			Thread.sleep(200);
//		});
//
////		IllegalArgumentException exceptions = assertThrows(IllegalArgumentException.class, () -> new Study(-1));
////		String message = exceptions.getMessage();
////		assertEquals(message, "limit는 0 보다 커야 한다.");
//
////		Study study = new Study(-1);
////		assertNotNull(study);
////
////		assertAll(
////				() -> assertEquals(StudyStatus.DRAFT, study.getStatus(),
////						() -> "스터디를 처음 만들면 " + StudyStatus.DRAFT + " 상태여야 한다."),
////				() -> assertTrue(study.getLimit() > 0, "스터디 참석자는 0명 이상이어야 한다."));
//	}
}
