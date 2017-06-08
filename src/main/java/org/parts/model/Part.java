package org.parts.model;


import java.util.Date;

public class Part {
    private String partNumber;
    private String partName;
    private String vendor;
    private Integer quantity;
    private Date shipped;
    private Date receive;

    public Part(String partName) {
        this.partName = partName;
    }

    public Part(String partNumber, String partName, String vendor) {
        this.partNumber = partNumber;
        this.partName = partName;
        this.vendor = vendor;
    }

    public Part(String partNumber,
                String partName,
                String vendor,
                Integer quantity,
                Date shipped,
                Date receive) {
        this.partNumber = partNumber;
        this.partName = partName;
        this.vendor = vendor;
        this.quantity = quantity;
        this.shipped = shipped;
        this.receive = receive;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartName() {
        return partName;
    }

    public String getVendor() {
        return vendor;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Date getShipped() {
        return shipped;
    }

    public Date getReceive() {
        return receive;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    public void setReceive(Date receive) {
        this.receive = receive;
    }
}
