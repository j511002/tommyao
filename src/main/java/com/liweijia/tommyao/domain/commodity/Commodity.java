package com.liweijia.tommyao.domain.commodity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Commodity {
    public Commodity(Shelf shelf) {
        this.shelf = shelf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(String deleteAt) {
        this.deleteAt = deleteAt;
    }

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, name = "cate_id", columnDefinition = "int")
    private int cateId;

    @Column(nullable = false, name = "brand_id", columnDefinition = "int")
    private int brandId;

    @Column(nullable = false, name = "name", length = 32, columnDefinition = "varchar")
    private String name;

    @Column(nullable = false, name = "title", length = 80, columnDefinition = "varchar")
    private String title;

    @Column(nullable = false, name = "model", length = 32, columnDefinition = "varchar")
    private String model;

    @Column(nullable = false, name = "cover", columnDefinition = "varchar")
    private String cover;

    @Column(name = "cover", columnDefinition = "text")
    private String description;

    @Column(nullable = false, columnDefinition = "tinyint")
    private Shelf shelf;

    @Column(nullable = false, columnDefinition = "datetime")
    private String createAt;

    @Column(nullable = false, columnDefinition = "datetime")
    private String updateAt;

    @Column(nullable = true, columnDefinition = "datetime")
    private String deleteAt;
}
