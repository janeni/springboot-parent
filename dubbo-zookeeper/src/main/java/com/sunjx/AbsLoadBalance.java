package com.sunjx;

import java.util.List;

/**
 * Auther: jx
 * Date: 2018/9/4
 * Time: 19:07
 */
public abstract class AbsLoadBalance implements LoadBalance {
    @Override
    public String selectHost(List<String> serviceRepos) {
        if(serviceRepos==null || serviceRepos.size()==0){
            return null;
        }
        if(serviceRepos.size()==1){
            return serviceRepos.get(0);
        }
        return doSelect(serviceRepos);

    }

    protected abstract  String doSelect(List<String> serviceRepos) ;
}
