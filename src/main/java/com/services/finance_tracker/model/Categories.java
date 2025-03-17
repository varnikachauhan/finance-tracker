package com.services.finance_tracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

@Entity
@Table(schema = "public", name = "categories")
public class Categories {
    private Long categoryId;
    private Long userId;
    private Long categoryName;
    private String categoryType;
    private Timestamp createdAt;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "category_name")
    public Long getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Long categoryName) {
        this.categoryName = categoryName;
    }

    @Column(name = "category_type")
    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}