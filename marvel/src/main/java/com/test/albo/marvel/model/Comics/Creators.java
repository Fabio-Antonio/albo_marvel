package com.test.albo.marvel.model.Comics;

public class Creators {
    private String collectionURI;
    private CreatorsItem[] items;

    public CreatorsItem[] getItems() {
        return items;
    }
    public String getCollectionURI() {
        return collectionURI;
    }
    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }
    public void setItems(CreatorsItem[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Creators{" +
                "collectionURI='" + collectionURI+ '\'' +
                '}';
}
}
