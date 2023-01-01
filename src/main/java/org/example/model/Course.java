package org.example.model;

public class Course {
    private int courseId;
    private String title;
    private String description;
    private int limit;

    public Course(int courseId, String title, String description, int limit) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.limit = limit;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_id=" + courseId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", limit=" + limit +
                '}';
    }
}
