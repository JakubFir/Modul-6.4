package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculation {

    private Statistics statistics;

    public StatisticsCalculation(Statistics statistics){
        this.statistics=statistics;
    }
    int userCount;
    int postCount;
    int commentsCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if(statistics.postsCount()==0 || statistics.usersNames().size()==0){
            averagePostsPerUser =0;
            averageCommentsPerPost=0;
            averageCommentsPerUser=0;
        }else {
            averagePostsPerUser = postCount / userCount;
            averageCommentsPerPost = (commentsCount / postCount);
            averageCommentsPerUser = commentsCount / userCount;
        }
    }
   public int getUserCount(){
        calculateAdvStatistics(statistics);
        return userCount;
   }
   public int getPostCount(){
       calculateAdvStatistics(statistics);
       return postCount;
   }
   public int getCommentsCount(){
        calculateAdvStatistics(statistics);
        return commentsCount;
   }
   public double getAverageCommentsPerUser(){
        calculateAdvStatistics(statistics);
        return averageCommentsPerUser;
   }
   public double getAveragePostsPerUser(){
        calculateAdvStatistics(statistics);
        return averagePostsPerUser;
   }
   public double getAverageCommentsPerPost(){
        calculateAdvStatistics(statistics);
        return averageCommentsPerPost;
   }
   public void showStatistics(){
       System.out.println(getUserCount());
       System.out.println(getPostCount());
       System.out.println(getCommentsCount());
       System.out.println(getAverageCommentsPerUser());
       System.out.println(getAveragePostsPerUser());
       System.out.println(getAverageCommentsPerPost());
   }
}
