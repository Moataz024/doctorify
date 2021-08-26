package com.paraprolead.service;


import com.paraprolead.model.Badge;
import com.paraprolead.repos.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BadgeServiceImpl implements BadgeService {

    @Autowired
    BadgeRepository bRepo;



    @Override
    public Badge getBadgeById(Long bid) {
        return bRepo.getById(bid);
    }

    @Override
    public List<Badge> getAllBadges() {
        return bRepo.findAll();
    }

    @Override
    public void deleteBadge(Long bid) {
        bRepo.deleteById(bid);
    }

    @Override
    public Badge createAnswer(Badge badge) {
        return bRepo.save(badge);
    }

    @Override
    public Badge updateBadge(Badge badge) {
        return bRepo.save(badge);
    }
}
