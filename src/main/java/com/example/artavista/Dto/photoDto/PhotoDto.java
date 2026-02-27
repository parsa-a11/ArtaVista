package com.example.artavista.Dto.photoDto;

import com.example.artavista.model.Photo;

import java.time.LocalDateTime;

public class PhotoDto {
    private final int id;
    private final String name;
    private final String description;
    private final int price;
    private final byte[] image;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public PhotoDto(int id, String name, String description, int price, byte[] image, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public byte[] getImage() {
        return image;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public static PhotoDto convertToDto(Photo photo) {
        return new PhotoDto(photo.getId(),
                photo.getName(),
                photo.getDescription(),
                photo.getPrice(),
                photo.getImage(),
                photo.getCreatedAt(),
                photo.getUpdatedAt());
    }
}
