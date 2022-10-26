package com.service;

import com.models.Medical;

import java.util.List;

public interface MedicalService {
    public List<Medical> showList();
    void addNewForm(Medical toKhaiYTe);
}
