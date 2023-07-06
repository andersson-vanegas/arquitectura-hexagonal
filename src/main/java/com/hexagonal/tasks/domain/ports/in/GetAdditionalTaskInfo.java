package com.hexagonal.tasks.domain.ports.in;

import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfo {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
