package com.easyrest.framework.core.services.authentication.api;

import com.easyrest.framework.core.model.HttpEntity;

/**
 * Created by liuhongyu.louie on 2016/12/29.
 */
public interface AuthenticateService {

    boolean authenticate(HttpEntity httpEntity);

    boolean getSession(HttpEntity httpEntity);

}