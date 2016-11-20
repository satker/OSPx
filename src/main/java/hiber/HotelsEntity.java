package hiber;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Artem on 13.11.2016.
 */
@Entity
@Table(name = "hotels", schema = "public", catalog = "OSP")
public class HotelsEntity {
    private int hotelidint;
    private String name;
    private String airportcode;
    private String address;
    private String city;
    private String stateprovince;
    private String country;
    private String postalcode;
    private Float lowrate;
    private Float highrate;
    private Integer marketinglevel;
    private Integer confidence;
    private Date hotelmodified;
    private String propertytype;
    private String nativecurrency;
    private Integer numberofrooms;
    private Integer numberofsuites;
    private Integer numberoffloors;
    private String checkintime;
    private String checkouttime;
    private String hasvaletparking;
    private String hascontinentalbreakfast;
    private String hasinroommovies;
    private String hassauna;
    private String haswhirlpool;
    private String hasvoicemail;
    private String has24Hoursecurity;
    private String hasparkinggarage;
    private String haselectronicroomkeys;
    private String hascoffeeteamaker;
    private String hassafe;
    private String hasvideocheckout;
    private String hasrestrictedaccess;
    private String hasinteriorroomentrance;
    private String hasexteriorroomentrance;
    private String hascombination;
    private String hasfitnessfacility;
    private String hasgameroom;
    private String hastenniscourt;
    private String hasgolfcourse;
    private String hasinhousedining;
    private String hasinhousebar;
    private String hashandicapaccessible;
    private String haschildrenallowed;
    private String haspetsallowed;
    private String hastvinroom;
    private String hasdataports;
    private String hasmeetingrooms;
    private String hasbusinesscenter;
    private String hasdrycleaning;
    private String hasindoorpool;
    private String hasoutdoorpool;
    private String hasnonsmokingrooms;
    private String hasairporttransportation;
    private String hasairconditioning;
    private String hasclothingiron;
    private String haswakeupservice;
    private String hasminibarinroom;
    private String hasroomservice;
    private String hashairdryer;
    private String hascarrentdesk;
    private String hasfamilyrooms;
    private String haskitchen;
    private String hasmap;
    private String propertydescription;
    private String destinationid;
    private String nearbyattractions;

    @Id
    @Column(name = "hotelidint", nullable = false, insertable = true, updatable = true)
    public int getHotelidint() {
        return hotelidint;
    }

    public void setHotelidint(int hotelidint) {
        this.hotelidint = hotelidint;
    }

    @Basic
    @Column(name = "name", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "airportcode", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getAirportcode() {
        return airportcode;
    }

    public void setAirportcode(String airportcode) {
        this.airportcode = airportcode;
    }

    @Basic
    @Column(name = "address", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "city", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "stateprovince", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getStateprovince() {
        return stateprovince;
    }

    public void setStateprovince(String stateprovince) {
        this.stateprovince = stateprovince;
    }

    @Basic
    @Column(name = "country", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "postalcode", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    @Basic
    @Column(name = "lowrate", nullable = true, insertable = true, updatable = true, precision = 8)
    public Float getLowrate() {
        return lowrate;
    }

    public void setLowrate(Float lowrate) {
        this.lowrate = lowrate;
    }

    @Basic
    @Column(name = "highrate", nullable = true, insertable = true, updatable = true, precision = 8)
    public Float getHighrate() {
        return highrate;
    }

    public void setHighrate(Float highrate) {
        this.highrate = highrate;
    }

    @Basic
    @Column(name = "marketinglevel", nullable = true, insertable = true, updatable = true)
    public Integer getMarketinglevel() {
        return marketinglevel;
    }

    public void setMarketinglevel(Integer marketinglevel) {
        this.marketinglevel = marketinglevel;
    }

    @Basic
    @Column(name = "confidence", nullable = true, insertable = true, updatable = true)
    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "hotelmodified", nullable = true, insertable = true, updatable = true)
    public Date getHotelmodified() {
        return hotelmodified;
    }

    public void setHotelmodified(Date hotelmodified) {
        this.hotelmodified = hotelmodified;
    }

    @Basic
    @Column(name = "propertytype", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }

    @Basic
    @Column(name = "nativecurrency", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getNativecurrency() {
        return nativecurrency;
    }

    public void setNativecurrency(String nativecurrency) {
        this.nativecurrency = nativecurrency;
    }

    @Basic
    @Column(name = "numberofrooms", nullable = true, insertable = true, updatable = true)
    public Integer getNumberofrooms() {
        return numberofrooms;
    }

    public void setNumberofrooms(Integer numberofrooms) {
        this.numberofrooms = numberofrooms;
    }

    @Basic
    @Column(name = "numberofsuites", nullable = true, insertable = true, updatable = true)
    public Integer getNumberofsuites() {
        return numberofsuites;
    }

    public void setNumberofsuites(Integer numberofsuites) {
        this.numberofsuites = numberofsuites;
    }

    @Basic
    @Column(name = "numberoffloors", nullable = true, insertable = true, updatable = true)
    public Integer getNumberoffloors() {
        return numberoffloors;
    }

    public void setNumberoffloors(Integer numberoffloors) {
        this.numberoffloors = numberoffloors;
    }

    @Basic
    @Column(name = "checkintime", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(String checkintime) {
        this.checkintime = checkintime;
    }

    @Basic
    @Column(name = "checkouttime", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(String checkouttime) {
        this.checkouttime = checkouttime;
    }

    @Basic
    @Column(name = "hasvaletparking", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasvaletparking() {
        return hasvaletparking;
    }

    public void setHasvaletparking(String hasvaletparking) {
        this.hasvaletparking = hasvaletparking;
    }

    @Basic
    @Column(name = "hascontinentalbreakfast", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHascontinentalbreakfast() {
        return hascontinentalbreakfast;
    }

    public void setHascontinentalbreakfast(String hascontinentalbreakfast) {
        this.hascontinentalbreakfast = hascontinentalbreakfast;
    }

    @Basic
    @Column(name = "hasinroommovies", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasinroommovies() {
        return hasinroommovies;
    }

    public void setHasinroommovies(String hasinroommovies) {
        this.hasinroommovies = hasinroommovies;
    }

    @Basic
    @Column(name = "hassauna", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHassauna() {
        return hassauna;
    }

    public void setHassauna(String hassauna) {
        this.hassauna = hassauna;
    }

    @Basic
    @Column(name = "haswhirlpool", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHaswhirlpool() {
        return haswhirlpool;
    }

    public void setHaswhirlpool(String haswhirlpool) {
        this.haswhirlpool = haswhirlpool;
    }

    @Basic
    @Column(name = "hasvoicemail", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasvoicemail() {
        return hasvoicemail;
    }

    public void setHasvoicemail(String hasvoicemail) {
        this.hasvoicemail = hasvoicemail;
    }

    @Basic
    @Column(name = "has24hoursecurity", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHas24Hoursecurity() {
        return has24Hoursecurity;
    }

    public void setHas24Hoursecurity(String has24Hoursecurity) {
        this.has24Hoursecurity = has24Hoursecurity;
    }

    @Basic
    @Column(name = "hasparkinggarage", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasparkinggarage() {
        return hasparkinggarage;
    }

    public void setHasparkinggarage(String hasparkinggarage) {
        this.hasparkinggarage = hasparkinggarage;
    }

    @Basic
    @Column(name = "haselectronicroomkeys", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHaselectronicroomkeys() {
        return haselectronicroomkeys;
    }

    public void setHaselectronicroomkeys(String haselectronicroomkeys) {
        this.haselectronicroomkeys = haselectronicroomkeys;
    }

    @Basic
    @Column(name = "hascoffeeteamaker", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHascoffeeteamaker() {
        return hascoffeeteamaker;
    }

    public void setHascoffeeteamaker(String hascoffeeteamaker) {
        this.hascoffeeteamaker = hascoffeeteamaker;
    }

    @Basic
    @Column(name = "hassafe", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHassafe() {
        return hassafe;
    }

    public void setHassafe(String hassafe) {
        this.hassafe = hassafe;
    }

    @Basic
    @Column(name = "hasvideocheckout", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasvideocheckout() {
        return hasvideocheckout;
    }

    public void setHasvideocheckout(String hasvideocheckout) {
        this.hasvideocheckout = hasvideocheckout;
    }

    @Basic
    @Column(name = "hasrestrictedaccess", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasrestrictedaccess() {
        return hasrestrictedaccess;
    }

    public void setHasrestrictedaccess(String hasrestrictedaccess) {
        this.hasrestrictedaccess = hasrestrictedaccess;
    }

    @Basic
    @Column(name = "hasinteriorroomentrance", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasinteriorroomentrance() {
        return hasinteriorroomentrance;
    }

    public void setHasinteriorroomentrance(String hasinteriorroomentrance) {
        this.hasinteriorroomentrance = hasinteriorroomentrance;
    }

    @Basic
    @Column(name = "hasexteriorroomentrance", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasexteriorroomentrance() {
        return hasexteriorroomentrance;
    }

    public void setHasexteriorroomentrance(String hasexteriorroomentrance) {
        this.hasexteriorroomentrance = hasexteriorroomentrance;
    }

    @Basic
    @Column(name = "hascombination", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHascombination() {
        return hascombination;
    }

    public void setHascombination(String hascombination) {
        this.hascombination = hascombination;
    }

    @Basic
    @Column(name = "hasfitnessfacility", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasfitnessfacility() {
        return hasfitnessfacility;
    }

    public void setHasfitnessfacility(String hasfitnessfacility) {
        this.hasfitnessfacility = hasfitnessfacility;
    }

    @Basic
    @Column(name = "hasgameroom", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasgameroom() {
        return hasgameroom;
    }

    public void setHasgameroom(String hasgameroom) {
        this.hasgameroom = hasgameroom;
    }

    @Basic
    @Column(name = "hastenniscourt", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHastenniscourt() {
        return hastenniscourt;
    }

    public void setHastenniscourt(String hastenniscourt) {
        this.hastenniscourt = hastenniscourt;
    }

    @Basic
    @Column(name = "hasgolfcourse", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasgolfcourse() {
        return hasgolfcourse;
    }

    public void setHasgolfcourse(String hasgolfcourse) {
        this.hasgolfcourse = hasgolfcourse;
    }

    @Basic
    @Column(name = "hasinhousedining", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasinhousedining() {
        return hasinhousedining;
    }

    public void setHasinhousedining(String hasinhousedining) {
        this.hasinhousedining = hasinhousedining;
    }

    @Basic
    @Column(name = "hasinhousebar", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasinhousebar() {
        return hasinhousebar;
    }

    public void setHasinhousebar(String hasinhousebar) {
        this.hasinhousebar = hasinhousebar;
    }

    @Basic
    @Column(name = "hashandicapaccessible", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHashandicapaccessible() {
        return hashandicapaccessible;
    }

    public void setHashandicapaccessible(String hashandicapaccessible) {
        this.hashandicapaccessible = hashandicapaccessible;
    }

    @Basic
    @Column(name = "haschildrenallowed", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHaschildrenallowed() {
        return haschildrenallowed;
    }

    public void setHaschildrenallowed(String haschildrenallowed) {
        this.haschildrenallowed = haschildrenallowed;
    }

    @Basic
    @Column(name = "haspetsallowed", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHaspetsallowed() {
        return haspetsallowed;
    }

    public void setHaspetsallowed(String haspetsallowed) {
        this.haspetsallowed = haspetsallowed;
    }

    @Basic
    @Column(name = "hastvinroom", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHastvinroom() {
        return hastvinroom;
    }

    public void setHastvinroom(String hastvinroom) {
        this.hastvinroom = hastvinroom;
    }

    @Basic
    @Column(name = "hasdataports", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasdataports() {
        return hasdataports;
    }

    public void setHasdataports(String hasdataports) {
        this.hasdataports = hasdataports;
    }

    @Basic
    @Column(name = "hasmeetingrooms", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasmeetingrooms() {
        return hasmeetingrooms;
    }

    public void setHasmeetingrooms(String hasmeetingrooms) {
        this.hasmeetingrooms = hasmeetingrooms;
    }

    @Basic
    @Column(name = "hasbusinesscenter", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasbusinesscenter() {
        return hasbusinesscenter;
    }

    public void setHasbusinesscenter(String hasbusinesscenter) {
        this.hasbusinesscenter = hasbusinesscenter;
    }

    @Basic
    @Column(name = "hasdrycleaning", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasdrycleaning() {
        return hasdrycleaning;
    }

    public void setHasdrycleaning(String hasdrycleaning) {
        this.hasdrycleaning = hasdrycleaning;
    }

    @Basic
    @Column(name = "hasindoorpool", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasindoorpool() {
        return hasindoorpool;
    }

    public void setHasindoorpool(String hasindoorpool) {
        this.hasindoorpool = hasindoorpool;
    }

    @Basic
    @Column(name = "hasoutdoorpool", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasoutdoorpool() {
        return hasoutdoorpool;
    }

    public void setHasoutdoorpool(String hasoutdoorpool) {
        this.hasoutdoorpool = hasoutdoorpool;
    }

    @Basic
    @Column(name = "hasnonsmokingrooms", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasnonsmokingrooms() {
        return hasnonsmokingrooms;
    }

    public void setHasnonsmokingrooms(String hasnonsmokingrooms) {
        this.hasnonsmokingrooms = hasnonsmokingrooms;
    }

    @Basic
    @Column(name = "hasairporttransportation", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasairporttransportation() {
        return hasairporttransportation;
    }

    public void setHasairporttransportation(String hasairporttransportation) {
        this.hasairporttransportation = hasairporttransportation;
    }

    @Basic
    @Column(name = "hasairconditioning", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasairconditioning() {
        return hasairconditioning;
    }

    public void setHasairconditioning(String hasairconditioning) {
        this.hasairconditioning = hasairconditioning;
    }

    @Basic
    @Column(name = "hasclothingiron", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasclothingiron() {
        return hasclothingiron;
    }

    public void setHasclothingiron(String hasclothingiron) {
        this.hasclothingiron = hasclothingiron;
    }

    @Basic
    @Column(name = "haswakeupservice", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHaswakeupservice() {
        return haswakeupservice;
    }

    public void setHaswakeupservice(String haswakeupservice) {
        this.haswakeupservice = haswakeupservice;
    }

    @Basic
    @Column(name = "hasminibarinroom", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasminibarinroom() {
        return hasminibarinroom;
    }

    public void setHasminibarinroom(String hasminibarinroom) {
        this.hasminibarinroom = hasminibarinroom;
    }

    @Basic
    @Column(name = "hasroomservice", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasroomservice() {
        return hasroomservice;
    }

    public void setHasroomservice(String hasroomservice) {
        this.hasroomservice = hasroomservice;
    }

    @Basic
    @Column(name = "hashairdryer", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHashairdryer() {
        return hashairdryer;
    }

    public void setHashairdryer(String hashairdryer) {
        this.hashairdryer = hashairdryer;
    }

    @Basic
    @Column(name = "hascarrentdesk", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHascarrentdesk() {
        return hascarrentdesk;
    }

    public void setHascarrentdesk(String hascarrentdesk) {
        this.hascarrentdesk = hascarrentdesk;
    }

    @Basic
    @Column(name = "hasfamilyrooms", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasfamilyrooms() {
        return hasfamilyrooms;
    }

    public void setHasfamilyrooms(String hasfamilyrooms) {
        this.hasfamilyrooms = hasfamilyrooms;
    }

    @Basic
    @Column(name = "haskitchen", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHaskitchen() {
        return haskitchen;
    }

    public void setHaskitchen(String haskitchen) {
        this.haskitchen = haskitchen;
    }

    @Basic
    @Column(name = "hasmap", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getHasmap() {
        return hasmap;
    }

    public void setHasmap(String hasmap) {
        this.hasmap = hasmap;
    }

    @Basic
    @Column(name = "propertydescription", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getPropertydescription() {
        return propertydescription;
    }

    public void setPropertydescription(String propertydescription) {
        this.propertydescription = propertydescription;
    }

    @Basic
    @Column(name = "destinationid", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getDestinationid() {
        return destinationid;
    }

    public void setDestinationid(String destinationid) {
        this.destinationid = destinationid;
    }

    @Basic
    @Column(name = "nearbyattractions", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getNearbyattractions() {
        return nearbyattractions;
    }

    public void setNearbyattractions(String nearbyattractions) {
        this.nearbyattractions = nearbyattractions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelsEntity that = (HotelsEntity) o;

        if (hotelidint != that.hotelidint) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (airportcode != null ? !airportcode.equals(that.airportcode) : that.airportcode != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (stateprovince != null ? !stateprovince.equals(that.stateprovince) : that.stateprovince != null)
            return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (postalcode != null ? !postalcode.equals(that.postalcode) : that.postalcode != null) return false;
        if (lowrate != null ? !lowrate.equals(that.lowrate) : that.lowrate != null) return false;
        if (highrate != null ? !highrate.equals(that.highrate) : that.highrate != null) return false;
        if (marketinglevel != null ? !marketinglevel.equals(that.marketinglevel) : that.marketinglevel != null)
            return false;
        if (confidence != null ? !confidence.equals(that.confidence) : that.confidence != null) return false;
        if (hotelmodified != null ? !hotelmodified.equals(that.hotelmodified) : that.hotelmodified != null)
            return false;
        if (propertytype != null ? !propertytype.equals(that.propertytype) : that.propertytype != null) return false;
        if (nativecurrency != null ? !nativecurrency.equals(that.nativecurrency) : that.nativecurrency != null)
            return false;
        if (numberofrooms != null ? !numberofrooms.equals(that.numberofrooms) : that.numberofrooms != null)
            return false;
        if (numberofsuites != null ? !numberofsuites.equals(that.numberofsuites) : that.numberofsuites != null)
            return false;
        if (numberoffloors != null ? !numberoffloors.equals(that.numberoffloors) : that.numberoffloors != null)
            return false;
        if (checkintime != null ? !checkintime.equals(that.checkintime) : that.checkintime != null) return false;
        if (checkouttime != null ? !checkouttime.equals(that.checkouttime) : that.checkouttime != null) return false;
        if (hasvaletparking != null ? !hasvaletparking.equals(that.hasvaletparking) : that.hasvaletparking != null)
            return false;
        if (hascontinentalbreakfast != null ? !hascontinentalbreakfast.equals(that.hascontinentalbreakfast) : that.hascontinentalbreakfast != null)
            return false;
        if (hasinroommovies != null ? !hasinroommovies.equals(that.hasinroommovies) : that.hasinroommovies != null)
            return false;
        if (hassauna != null ? !hassauna.equals(that.hassauna) : that.hassauna != null) return false;
        if (haswhirlpool != null ? !haswhirlpool.equals(that.haswhirlpool) : that.haswhirlpool != null) return false;
        if (hasvoicemail != null ? !hasvoicemail.equals(that.hasvoicemail) : that.hasvoicemail != null) return false;
        if (has24Hoursecurity != null ? !has24Hoursecurity.equals(that.has24Hoursecurity) : that.has24Hoursecurity != null)
            return false;
        if (hasparkinggarage != null ? !hasparkinggarage.equals(that.hasparkinggarage) : that.hasparkinggarage != null)
            return false;
        if (haselectronicroomkeys != null ? !haselectronicroomkeys.equals(that.haselectronicroomkeys) : that.haselectronicroomkeys != null)
            return false;
        if (hascoffeeteamaker != null ? !hascoffeeteamaker.equals(that.hascoffeeteamaker) : that.hascoffeeteamaker != null)
            return false;
        if (hassafe != null ? !hassafe.equals(that.hassafe) : that.hassafe != null) return false;
        if (hasvideocheckout != null ? !hasvideocheckout.equals(that.hasvideocheckout) : that.hasvideocheckout != null)
            return false;
        if (hasrestrictedaccess != null ? !hasrestrictedaccess.equals(that.hasrestrictedaccess) : that.hasrestrictedaccess != null)
            return false;
        if (hasinteriorroomentrance != null ? !hasinteriorroomentrance.equals(that.hasinteriorroomentrance) : that.hasinteriorroomentrance != null)
            return false;
        if (hasexteriorroomentrance != null ? !hasexteriorroomentrance.equals(that.hasexteriorroomentrance) : that.hasexteriorroomentrance != null)
            return false;
        if (hascombination != null ? !hascombination.equals(that.hascombination) : that.hascombination != null)
            return false;
        if (hasfitnessfacility != null ? !hasfitnessfacility.equals(that.hasfitnessfacility) : that.hasfitnessfacility != null)
            return false;
        if (hasgameroom != null ? !hasgameroom.equals(that.hasgameroom) : that.hasgameroom != null) return false;
        if (hastenniscourt != null ? !hastenniscourt.equals(that.hastenniscourt) : that.hastenniscourt != null)
            return false;
        if (hasgolfcourse != null ? !hasgolfcourse.equals(that.hasgolfcourse) : that.hasgolfcourse != null)
            return false;
        if (hasinhousedining != null ? !hasinhousedining.equals(that.hasinhousedining) : that.hasinhousedining != null)
            return false;
        if (hasinhousebar != null ? !hasinhousebar.equals(that.hasinhousebar) : that.hasinhousebar != null)
            return false;
        if (hashandicapaccessible != null ? !hashandicapaccessible.equals(that.hashandicapaccessible) : that.hashandicapaccessible != null)
            return false;
        if (haschildrenallowed != null ? !haschildrenallowed.equals(that.haschildrenallowed) : that.haschildrenallowed != null)
            return false;
        if (haspetsallowed != null ? !haspetsallowed.equals(that.haspetsallowed) : that.haspetsallowed != null)
            return false;
        if (hastvinroom != null ? !hastvinroom.equals(that.hastvinroom) : that.hastvinroom != null) return false;
        if (hasdataports != null ? !hasdataports.equals(that.hasdataports) : that.hasdataports != null) return false;
        if (hasmeetingrooms != null ? !hasmeetingrooms.equals(that.hasmeetingrooms) : that.hasmeetingrooms != null)
            return false;
        if (hasbusinesscenter != null ? !hasbusinesscenter.equals(that.hasbusinesscenter) : that.hasbusinesscenter != null)
            return false;
        if (hasdrycleaning != null ? !hasdrycleaning.equals(that.hasdrycleaning) : that.hasdrycleaning != null)
            return false;
        if (hasindoorpool != null ? !hasindoorpool.equals(that.hasindoorpool) : that.hasindoorpool != null)
            return false;
        if (hasoutdoorpool != null ? !hasoutdoorpool.equals(that.hasoutdoorpool) : that.hasoutdoorpool != null)
            return false;
        if (hasnonsmokingrooms != null ? !hasnonsmokingrooms.equals(that.hasnonsmokingrooms) : that.hasnonsmokingrooms != null)
            return false;
        if (hasairporttransportation != null ? !hasairporttransportation.equals(that.hasairporttransportation) : that.hasairporttransportation != null)
            return false;
        if (hasairconditioning != null ? !hasairconditioning.equals(that.hasairconditioning) : that.hasairconditioning != null)
            return false;
        if (hasclothingiron != null ? !hasclothingiron.equals(that.hasclothingiron) : that.hasclothingiron != null)
            return false;
        if (haswakeupservice != null ? !haswakeupservice.equals(that.haswakeupservice) : that.haswakeupservice != null)
            return false;
        if (hasminibarinroom != null ? !hasminibarinroom.equals(that.hasminibarinroom) : that.hasminibarinroom != null)
            return false;
        if (hasroomservice != null ? !hasroomservice.equals(that.hasroomservice) : that.hasroomservice != null)
            return false;
        if (hashairdryer != null ? !hashairdryer.equals(that.hashairdryer) : that.hashairdryer != null) return false;
        if (hascarrentdesk != null ? !hascarrentdesk.equals(that.hascarrentdesk) : that.hascarrentdesk != null)
            return false;
        if (hasfamilyrooms != null ? !hasfamilyrooms.equals(that.hasfamilyrooms) : that.hasfamilyrooms != null)
            return false;
        if (haskitchen != null ? !haskitchen.equals(that.haskitchen) : that.haskitchen != null) return false;
        if (hasmap != null ? !hasmap.equals(that.hasmap) : that.hasmap != null) return false;
        if (propertydescription != null ? !propertydescription.equals(that.propertydescription) : that.propertydescription != null)
            return false;
        if (destinationid != null ? !destinationid.equals(that.destinationid) : that.destinationid != null)
            return false;
        if (nearbyattractions != null ? !nearbyattractions.equals(that.nearbyattractions) : that.nearbyattractions != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hotelidint;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (airportcode != null ? airportcode.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (stateprovince != null ? stateprovince.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (postalcode != null ? postalcode.hashCode() : 0);
        result = 31 * result + (lowrate != null ? lowrate.hashCode() : 0);
        result = 31 * result + (highrate != null ? highrate.hashCode() : 0);
        result = 31 * result + (marketinglevel != null ? marketinglevel.hashCode() : 0);
        result = 31 * result + (confidence != null ? confidence.hashCode() : 0);
        result = 31 * result + (hotelmodified != null ? hotelmodified.hashCode() : 0);
        result = 31 * result + (propertytype != null ? propertytype.hashCode() : 0);
        result = 31 * result + (nativecurrency != null ? nativecurrency.hashCode() : 0);
        result = 31 * result + (numberofrooms != null ? numberofrooms.hashCode() : 0);
        result = 31 * result + (numberofsuites != null ? numberofsuites.hashCode() : 0);
        result = 31 * result + (numberoffloors != null ? numberoffloors.hashCode() : 0);
        result = 31 * result + (checkintime != null ? checkintime.hashCode() : 0);
        result = 31 * result + (checkouttime != null ? checkouttime.hashCode() : 0);
        result = 31 * result + (hasvaletparking != null ? hasvaletparking.hashCode() : 0);
        result = 31 * result + (hascontinentalbreakfast != null ? hascontinentalbreakfast.hashCode() : 0);
        result = 31 * result + (hasinroommovies != null ? hasinroommovies.hashCode() : 0);
        result = 31 * result + (hassauna != null ? hassauna.hashCode() : 0);
        result = 31 * result + (haswhirlpool != null ? haswhirlpool.hashCode() : 0);
        result = 31 * result + (hasvoicemail != null ? hasvoicemail.hashCode() : 0);
        result = 31 * result + (has24Hoursecurity != null ? has24Hoursecurity.hashCode() : 0);
        result = 31 * result + (hasparkinggarage != null ? hasparkinggarage.hashCode() : 0);
        result = 31 * result + (haselectronicroomkeys != null ? haselectronicroomkeys.hashCode() : 0);
        result = 31 * result + (hascoffeeteamaker != null ? hascoffeeteamaker.hashCode() : 0);
        result = 31 * result + (hassafe != null ? hassafe.hashCode() : 0);
        result = 31 * result + (hasvideocheckout != null ? hasvideocheckout.hashCode() : 0);
        result = 31 * result + (hasrestrictedaccess != null ? hasrestrictedaccess.hashCode() : 0);
        result = 31 * result + (hasinteriorroomentrance != null ? hasinteriorroomentrance.hashCode() : 0);
        result = 31 * result + (hasexteriorroomentrance != null ? hasexteriorroomentrance.hashCode() : 0);
        result = 31 * result + (hascombination != null ? hascombination.hashCode() : 0);
        result = 31 * result + (hasfitnessfacility != null ? hasfitnessfacility.hashCode() : 0);
        result = 31 * result + (hasgameroom != null ? hasgameroom.hashCode() : 0);
        result = 31 * result + (hastenniscourt != null ? hastenniscourt.hashCode() : 0);
        result = 31 * result + (hasgolfcourse != null ? hasgolfcourse.hashCode() : 0);
        result = 31 * result + (hasinhousedining != null ? hasinhousedining.hashCode() : 0);
        result = 31 * result + (hasinhousebar != null ? hasinhousebar.hashCode() : 0);
        result = 31 * result + (hashandicapaccessible != null ? hashandicapaccessible.hashCode() : 0);
        result = 31 * result + (haschildrenallowed != null ? haschildrenallowed.hashCode() : 0);
        result = 31 * result + (haspetsallowed != null ? haspetsallowed.hashCode() : 0);
        result = 31 * result + (hastvinroom != null ? hastvinroom.hashCode() : 0);
        result = 31 * result + (hasdataports != null ? hasdataports.hashCode() : 0);
        result = 31 * result + (hasmeetingrooms != null ? hasmeetingrooms.hashCode() : 0);
        result = 31 * result + (hasbusinesscenter != null ? hasbusinesscenter.hashCode() : 0);
        result = 31 * result + (hasdrycleaning != null ? hasdrycleaning.hashCode() : 0);
        result = 31 * result + (hasindoorpool != null ? hasindoorpool.hashCode() : 0);
        result = 31 * result + (hasoutdoorpool != null ? hasoutdoorpool.hashCode() : 0);
        result = 31 * result + (hasnonsmokingrooms != null ? hasnonsmokingrooms.hashCode() : 0);
        result = 31 * result + (hasairporttransportation != null ? hasairporttransportation.hashCode() : 0);
        result = 31 * result + (hasairconditioning != null ? hasairconditioning.hashCode() : 0);
        result = 31 * result + (hasclothingiron != null ? hasclothingiron.hashCode() : 0);
        result = 31 * result + (haswakeupservice != null ? haswakeupservice.hashCode() : 0);
        result = 31 * result + (hasminibarinroom != null ? hasminibarinroom.hashCode() : 0);
        result = 31 * result + (hasroomservice != null ? hasroomservice.hashCode() : 0);
        result = 31 * result + (hashairdryer != null ? hashairdryer.hashCode() : 0);
        result = 31 * result + (hascarrentdesk != null ? hascarrentdesk.hashCode() : 0);
        result = 31 * result + (hasfamilyrooms != null ? hasfamilyrooms.hashCode() : 0);
        result = 31 * result + (haskitchen != null ? haskitchen.hashCode() : 0);
        result = 31 * result + (hasmap != null ? hasmap.hashCode() : 0);
        result = 31 * result + (propertydescription != null ? propertydescription.hashCode() : 0);
        result = 31 * result + (destinationid != null ? destinationid.hashCode() : 0);
        result = 31 * result + (nearbyattractions != null ? nearbyattractions.hashCode() : 0);
        return result;
    }
}
