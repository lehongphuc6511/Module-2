package service;

import model.Staff;


import java.util.List;

public interface StaffService {

    List<Staff> showAll();

    void save(Staff stock);

    Staff findById(int idStaff);

    void update(int idStaff, Staff staff);

    void remove(int idStaff);
}
