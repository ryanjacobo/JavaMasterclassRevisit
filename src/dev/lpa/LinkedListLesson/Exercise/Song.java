package dev.lpa.LinkedListLesson.Exercise;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    //    @Override
//    public String toString() {
//        return String.format("%s: %.2f", title, duration);
//    }


    @Override
    public String toString() {
        return title + ": " + duration;
//        return "Song{" +
//                "title='" + title + '\'' +
//                ", duration=" + duration +
//                '}';
    }
}
