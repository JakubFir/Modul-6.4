package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class StatisticsCalculationTestSuite {
    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNUserNames(int quantity) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            result.add("name" + i);
        }
        return result;
    }

    @Test
    void averagePostPerUserWithCondition0Posts() {
        //Given
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);
        int postCounts = 0;
        List<String> users = generateListOfNUserNames(5);
        when(statisticsMock.postsCount()).thenReturn(postCounts);
        when(statisticsMock.usersNames()).thenReturn(users);
        //when
        double result = statisticsCalculation.getAveragePostsPerUser();
        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void averagePostPerUserWithCondition1000Posts() {
        //Given
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);
        int postsCount = 1000;
        List<String> users = generateListOfNUserNames(5);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        //when
        double result = statisticsCalculation.getAveragePostsPerUser();
        //then
        Assertions.assertEquals(200, result);
    }

    @Test
    void averageCommentsPerUserWithCodition0Comments() {
        //Given
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);
        int postsCount = 100;
        List<String> users = generateListOfNUserNames(5);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        //when
        double result = statisticsCalculation.getAverageCommentsPerUser();
        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void averageCommentsPerUserWithConditionMorePosts() {
        //Given
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);
        int postsCount = 100;
        int commentsCount = 10;
        List<String> users = generateListOfNUserNames(5);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        //when
        double result = statisticsCalculation.getAverageCommentsPerUser();
        //then
        Assertions.assertEquals(2, result);

    }

    @Test
    void averageCommentsPerUserWithConditionMoreComments() {
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);
        int postsCount = 10;
        int commentsCount = 100;
        List<String> users = generateListOfNUserNames(5);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        //when
        double result = statisticsCalculation.getAverageCommentsPerUser();
        //then
        Assertions.assertEquals(20, result);
    }

    @Test
    void averageCommentPerPostWithConditionUsers0() {
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);
        int postsCount = 10;
        int commentsCount = 0;
        List<String> users = generateListOfNUserNames(0);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        //when
        double result = statisticsCalculation.getAverageCommentsPerPost();
        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void averageCommentsPerPostWithConditionUsers100() {
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);
        int postsCount = 1;
        int commentsCount = 100;
        List<String> users = generateListOfNUserNames(100);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        //when
        double result = (statisticsCalculation.getAverageCommentsPerPost());
        //then
        Assertions.assertEquals(100, result);
    }

    @Test
    void averagePostsPerUserWithConditionUsers100() {
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);
        int postsCount = 1000;
        List<String> users = generateListOfNUserNames(100);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        //when
        double result = (statisticsCalculation.getAveragePostsPerUser());
        //then
        Assertions.assertEquals(10, result);
    }

    @Test
    void averageCommentsPerUserWithConditionUsers100() {
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);
        int commentCount = 100;
        List<String> users = generateListOfNUserNames(100);
        when(statisticsMock.postsCount()).thenReturn(commentCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        //when
        double result = (statisticsCalculation.getAveragePostsPerUser());
        //then
        Assertions.assertEquals(1, result);
    }
}

