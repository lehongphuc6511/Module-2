package model;

public class Staff {
    private int idStaff;
    private String name;
    private String gender;
    private int age;
    private String address;
    private String phoneNumber;
    private String deleteBy;
    private String deleteDate;
    private String modifyBy;
    private String modifyDate;
    private String creatBy;
    private String creatDate;

    public Staff(int idStaff, String name, String gender, int age, String address, String phoneNumber, String deleteBy, String deleteDate, String modifyBy, String modifyDate, String creatBy, String creatDate) {
        this.idStaff = idStaff;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.deleteBy = deleteBy;
        this.deleteDate = deleteDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
        this.creatBy = creatBy;
        this.creatDate = creatDate;
    }

    public Staff(String name, String gender, int age, String address, String phoneNumber, String createBy) {
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(String deleteBy) {
        this.deleteBy = deleteBy;
    }

    public String getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(String creatBy) {
        this.creatBy = creatBy;
    }

    public String getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(String creatDate) {
        this.creatDate = creatDate;
    }
}
