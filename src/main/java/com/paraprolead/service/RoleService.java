package com.paraprolead.service;


import com.paraprolead.model.Role;

import java.util.List;

public interface RoleService {

    Role getAnswerById(Long rid);
    List<Role> getAllRole();
    void deleteRole(Long rid);
    Role createRole(Role role);
    Role updateRole(Role role);
}
