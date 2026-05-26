package com.project.informationbook;

public class ModelClass {
    private String imageName;
    private String categoryName;

    public String getImageName() {
        return imageName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public ModelClass(String categoryName, String imageName) {
        this.categoryName = categoryName;
        this.imageName = imageName;


    }
}
