package com.cg.billing.daoservices;

import java.util.List;

import com.cg.billing.beans.Plan;

public interface PlanDAO {
	public List<Plan> findAll();
}
