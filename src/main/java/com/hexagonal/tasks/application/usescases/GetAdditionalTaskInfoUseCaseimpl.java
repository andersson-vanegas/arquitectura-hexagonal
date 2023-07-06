package com.hexagonal.tasks.application.usescases;
import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;
import com.hexagonal.tasks.domain.ports.out.ExternalServicePort;
import com.hexagonal.tasks.domain.ports.in.GetAdditionalTaskInfo;

public class GetAdditionalTaskInfoUseCaseimpl implements GetAdditionalTaskInfo {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseimpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }


    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return externalServicePort.getAdditionalTaskInfo(taskId);
    }
}
