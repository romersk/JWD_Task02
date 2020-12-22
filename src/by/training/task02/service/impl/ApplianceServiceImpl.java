package by.training.task02.service.impl;

import java.io.IOException;

import by.training.task02.dao.ApplianceDAO;
import by.training.task02.dao.DAOFactory;
import by.training.task02.entity.Appliance;
import by.training.task02.entity.criteria.Criteria;
import by.training.task02.service.ApplianceService;
import by.training.task02.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public Appliance find(Criteria criteria) throws IOException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}
}
