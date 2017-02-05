package com.easyrest.framework.core.services.workStep.impl;

import com.easyrest.framework.configuration.GlobalParameters;
import com.easyrest.framework.core.model.HttpEntity;

import java.io.UnsupportedEncodingException;

/**
 * Created by liuhongyu.louie on 2016/12/31.
 */
public class RequestPreparedStep extends AbstractWorkStep {

    @Override
    public <T>T executeStep(T entity) {
        try {
            ((HttpEntity)entity).getRequest().setCharacterEncoding(GlobalParameters.getCharacterEncoding());
        } catch (UnsupportedEncodingException ignored) {}
        return entity;
    }

}