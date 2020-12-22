package by.training.task02.service;

import java.io.IOException;

import by.training.task02.entity.Appliance;
import by.training.task02.entity.criteria.Criteria;

public interface ApplianceService {

    Appliance find(Criteria criteria) throws IOException;

}
