/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author admin-sala3
 */
public class film {
    private int film_id;
    private String title;
    private String description;
    private int release_year;
    private int language_id;
    private int priginal_language_id;
    private double rental_rate;
    private int length;
    private double replacemet_cost;
    private char rating;
    private String special_features;
    private String last_update;
    
    public film(){
    }

    public film(int film_id, String title, String description, int release_year, int language_id, int priginal_language_id, double rental_rate, int length, double replacemet_cost, char rating, String special_features, String last_update) {
        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.language_id = language_id;
        this.priginal_language_id = priginal_language_id;
        this.rental_rate = rental_rate;
        this.length = length;
        this.replacemet_cost = replacemet_cost;
        this.rating = rating;
        this.special_features = special_features;
        this.last_update = last_update;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
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

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public int getPriginal_language_id() {
        return priginal_language_id;
    }

    public void setPriginal_language_id(int priginal_language_id) {
        this.priginal_language_id = priginal_language_id;
    }

    public double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getReplacemet_cost() {
        return replacemet_cost;
    }

    public void setReplacemet_cost(double replacemet_cost) {
        this.replacemet_cost = replacemet_cost;
    }

    public char getRating() {
        return rating;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "film{" + "film_id=" + film_id + ", title=" + title + ", description=" + description + ", release_year=" + release_year + ", language_id=" + language_id + ", priginal_language_id=" + priginal_language_id + ", rental_rate=" + rental_rate + ", length=" + length + ", replacemet_cost=" + replacemet_cost + ", rating=" + rating + ", special_features=" + special_features + ", last_update=" + last_update + '}';
    }
    
    
    
}
