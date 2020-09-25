package com.github.perscholas.services;

import com.github.perscholas.models.ServiceCategory;
import com.github.perscholas.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCategoryService {
    private ServiceRepository serviceRepository;

    @Autowired
    public ServiceCategoryService(ServiceRepository serviceRepository) {

        this.serviceRepository = serviceRepository;
    }

    public List<ServiceCategory> index() {
        List<ServiceCategory> list = new ArrayList<>();
        serviceRepository.findAll().forEach(list::add);
        return list;
    }
    public ServiceCategory show(Integer id) {
        return serviceRepository.findById(id).get();
    }

    public ServiceCategory create(ServiceCategory serviceCategory) {
        return serviceRepository.save(serviceCategory);
    }

    public ServiceCategory update(Integer id, ServiceCategory newCategory) {
        ServiceCategory entrySC = serviceRepository.findById(id).get();
        entrySC.setCategoryName(newCategory.getCategoryName());
        return serviceRepository.save(entrySC);
    }

    public Boolean delete(Integer id) {
        serviceRepository.deleteById(id);
        return true;
    }
}