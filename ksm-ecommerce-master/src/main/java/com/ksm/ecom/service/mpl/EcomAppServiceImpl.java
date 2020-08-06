package com.ksm.ecom.service.mpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksm.ecom.dao.EcomAppDao;
import com.ksm.ecom.entity.App;
import com.ksm.ecom.modal.AppVO;
import com.ksm.ecom.service.EcomAppService;
@Service("EcomAppServiceImpl")
@Transactional
public class EcomAppServiceImpl implements EcomAppService {
   
	//ObjectMapper <App,AppVO> appMapper=new ObjectMapper<App,AppVO>();
	@Autowired
	private EcomAppDao ecomAppDao;
	
	@Override
	public List<AppVO> getAppData() {
		List<App> appList=ecomAppDao.getAppData();
		List<AppVO> appVOs=new ArrayList<>();
		appList.forEach(app->prepareAppVO(app,appVOs));
		return appVOs;
	}

	private void prepareAppVO(App app, List<AppVO> appVOs) {
		AppVO appVO=new AppVO();
		appVO.setId(app.getId());
		appVO.setAppText(app.getAppText());
		appVO.setAppTextConst(app.getAppTextConst());
		appVO.setStatus(app.getStatus());
		appVOs.add(appVO);
	}

}
