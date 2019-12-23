package service;

import model.Staff;

import java.util.List;

public interface StaffService {
    List<Staff> findAll();

    void save(Staff stock);

    Staff findById(int idStock);

    void update(int idStock, Staff stock);

    void remove(int idStock);
}