package com.fourfree.new_efarm.intranet.dept.service.impl;

import com.fourfree.new_efarm.intranet.dept.service.DeptService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class DeptServiceImpl implements DeptService {

}
