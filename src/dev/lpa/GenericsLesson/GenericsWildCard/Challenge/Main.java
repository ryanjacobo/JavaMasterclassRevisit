package dev.lpa.GenericsLesson.GenericsWildCard.Challenge;

import dev.lpa.GenericsLesson.GenericsWildCard.Challenge.model.LPAStudent;
import dev.lpa.GenericsLesson.GenericsWildCard.Challenge.model.LPAStudentComparator;
import dev.lpa.GenericsLesson.GenericsWildCard.Challenge.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueryList<LPAStudent> queryList = new QueryList<>();
        for(int i = 0; i < 25; i++){
            queryList.add(new LPAStudent());
        }

        // sorted by using List.sort with the Comparator.naturalOrder() comparator
        System.out.println("Ordered");
        queryList.sort(Comparator.naturalOrder());
        printList(queryList);

        // sort by student id as well as the others ways you selected
        System.out.println("Matches");
        var matches = queryList.getMatches("PercentComplete", "50")
                .getMatches("Course", "Python");
        printList(matches);

        System.out.println("Sorted by percentComplete");
        matches.sort(new LPAStudentComparator());
        printList(matches);

        System.out.println("Sorted by percentComplete then student ID");
        matches.sort(null);
        printList(matches);

    }

    public static void printList(List<?> students){
        for(var student : students){
            System.out.println(student);
        }
        System.out.println();
    }
}
