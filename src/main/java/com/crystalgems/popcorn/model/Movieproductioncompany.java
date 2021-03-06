package com.crystalgems.popcorn.model;

import javax.persistence.*;

/**
 * Created by Antoine on 03/03/2017.
 */
@Entity
@Table(name = "movieproductioncompany")
public class Movieproductioncompany {
    private int id;
    private int movieId;
    private String countryCode;
    private int productionCompanyId;
    //private String companyInfo;

    @Id
    @Column(name = "MovieProductionCompnyLinkId")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MovieId")
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    @Basic
    @Column(name = "CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "ProductionCompanyId")
    public int getProductionCompanyId() {
        return productionCompanyId;
    }

    public void setProductionCompanyId(int productionCompanyId) {
        this.productionCompanyId = productionCompanyId;
    }
/*
    @Basic
    @Column(name = "CompanyInfo")
    public String getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(String companyInfo) {
        this.companyInfo = companyInfo;
    }
*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movieproductioncompany that = (Movieproductioncompany) o;

        if (id != that.id) return false;
        if (movieId != that.movieId) return false;
        if (productionCompanyId != that.productionCompanyId) return false;
        return countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + movieId;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + productionCompanyId;
        //result = 31 * result + (companyInfo != null ? companyInfo.hashCode() : 0);
        return result;
    }
}
