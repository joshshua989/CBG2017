package ellen.joshua.craftbeerguru;

/**
 * Created by Josh on 3/7/2017.
 */
public class BreweryDataObject {

    private int id, rating;
    private String year_established, name, image_link, city, state, website, phone, featured;

    public BreweryDataObject(String name) {
        this.name = name;
    }

    public BreweryDataObject(int id, int rating, String name, String image_link, String city, String state, String phone, String website, String year_established, String featured) {

        this.id = id;
        this.rating = rating;
        this.name = name;
        this.image_link = image_link;
        this.city = city;
        this.state = state;
        this.website = website;
        this.phone = phone;
        this.year_established = year_established;
        this.featured = featured;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getYear_established() {
        return year_established;
    }

    public void setYear_established(String year_established) {
        this.year_established = year_established;
    }

    public String getFeatured() {
        return featured;
    }

    public void setFeatured(String featured) {
        this.featured = featured;
    }
}
