package com.projetoDIO.ProjetoCLARO.service;

import com.projetoDIO.ProjetoCLARO.models.User;

public interface IUserService {

    User findById(Long id);

    User create(User user);

}
