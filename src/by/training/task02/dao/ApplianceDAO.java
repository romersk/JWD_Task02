package by.training.task02.dao;

import java.io.IOException;

import by.training.task02.entity.Appliance;
import by.training.task02.entity.criteria.Criteria;

public interface ApplianceDAO {
	Appliance find(Criteria criteria) throws IOException;
}
