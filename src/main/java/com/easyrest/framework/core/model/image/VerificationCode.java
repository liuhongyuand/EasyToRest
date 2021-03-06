package com.easyrest.framework.core.model.image;

import com.easyrest.framework.configuration.RequestPath;
import com.easyrest.framework.core.annotations.bean.BindService;
import com.easyrest.framework.core.annotations.method.Get;
import com.easyrest.framework.core.annotations.method.Post;
import com.easyrest.framework.core.model.request.AbstractRequestModel;
import com.easyrest.framework.core.services.verificationCode.VerificationCodeImpl;

/**
 * Created by liuhongyu.louie on 2017/1/2.
 */
@Get(RequestPath.System.VERIFICATION_CODE)
@Post(RequestPath.System.VERIFICATION_CODE)
@BindService(VerificationCodeImpl.class)
public class VerificationCode extends AbstractRequestModel{

}
