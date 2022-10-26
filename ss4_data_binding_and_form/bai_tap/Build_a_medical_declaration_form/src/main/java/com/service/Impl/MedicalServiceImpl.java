package com.service.Impl;

import com.models.Medical;
import com.service.MedicalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicalServiceImpl implements MedicalService {
    private static List<Medical> toKhaiYTes = new ArrayList<>();

    @Override
    public List<Medical> showList() {
        return toKhaiYTes;
    }

    @Override
    public void addNewForm(Medical toKhaiYTe) {
        toKhaiYTes.add(toKhaiYTe);
    }
}
