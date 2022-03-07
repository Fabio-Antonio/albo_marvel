package com.test.albo.marvel.model.Comics;

public class Comics {
    private int id;
    private  int digitalId;
    private String title;
    private int issueNumber;
    private  String variantDescription;
    private String description;
    private  String modified;
    private String upc;
    private Creators creators;
    private Characters characters;

    public int getId() {
        return id;
    }
    public Characters getCharacters() {
        return characters;
    }
    public void setCharacters(Characters characters) {
        this.characters = characters;
    }
    public Creators getCreators() {
        return creators;
    }
    public void setCreators(Creators creators) {
        this.creators = creators;
    }
    public String getUpc() {
        return upc;
    }
    public void setUpc(String upc) {
        this.upc = upc;
    }
    public String getModified() {
        return modified;
    }
    public void setModified(String modified) {
        this.modified = modified;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getVariantDescription() {
        return variantDescription;
    }
    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }
    public int getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getDigitalId() {
        return digitalId;
    }
    public void setDigitalId(int digitalId) {
        this.digitalId = digitalId;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "id='" + id + '\'' +
                ", digitalId='" + digitalId + '\'' +
                ", title='" + title + '\'' +
				", issueNumber='" + issueNumber + '\'' +
                "variantDescription='" + variantDescription + '\'' +
                ", description='" + description + '\'' +
                ", modified='" + modified + '\'' +
				", upc='" + upc + '\'' +
                '}';
    }
    
}
