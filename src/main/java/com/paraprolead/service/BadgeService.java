package com.paraprolead.service;



import com.paraprolead.model.Badge;

import java.util.List;

public interface BadgeService {
    Badge getBadgeById(Long bid);
    List<Badge> getAllBadges();
    void deleteBadge(Long bid);
    Badge createAnswer(Badge badge);
    Badge updateBadge(Badge badge);
}
