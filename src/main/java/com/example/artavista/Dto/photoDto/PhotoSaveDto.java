package com.example.artavista.Dto.photoDto;

import com.example.artavista.model.Photo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PhotoSaveDto {
    private final String name;
    private final String description;
    private final int price;
    private final byte[] image;

    public PhotoSaveDto(String name, String description, int price, byte[] image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    @NotNull(message = "photo.save.dto.name.null")
    public String getName() {
        return name;
    }

    @NotNull(message = "photo.save.dto.description.null")
    public String getDescription() {
        return description;
    }

    @NotNull(message = "photo.save.dto.price.null")
    public int getPrice() {
        return price;
    }

    @NotNull(message = "photo.save.dto.image.null")
    public byte[] getImage() {
        return image;
    }

    public Photo convertToPhoto() {
        Photo photo = new Photo();
        photo.setName(name);
        photo.setDescription(description);
        photo.setPrice(price);
        photo.setImage(image);
        return photo;
    }
}
