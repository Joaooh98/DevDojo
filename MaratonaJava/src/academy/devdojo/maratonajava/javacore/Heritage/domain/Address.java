package academy.devdojo.maratonajava.javacore.Heritage.domain;

public class Address {
    private String road;
    private String zipCode;
    
    /**
     * @return String return the road
     */
    public String getRoad() {
        return road;
    }

    /**
     * @param road the road to set
     */
    public void setRoad(String road) {
        this.road = road;
    }

    /**
     * @return String return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

}
