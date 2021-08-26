package com.paraprolead.service;


import com.paraprolead.model.Role;
import com.paraprolead.repos.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository rRepo;

    @Override
    public Role getAnswerById(Long rid) {
        return rRepo.getById(rid);
    }

    @Override
    public List<Role> getAllRole() {
        return rRepo.findAll();
    }

    @Override
    public void deleteRole(Long rid) {
            rRepo.deleteById(rid);
    }

    @Override
    public Role createRole(Role role) {
        return rRepo.save(role);
    }

    @Override
    public Role updateRole(Role role) {
        return rRepo.save(role);
    }
}
