package com.yuanqinnan.spring.cloud.learn.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @des:
 * @author: yuanqinnan
 * @date 2019/9/22
 */
@Component
public class LoginFilter extends ZuulFilter {
    private static final Logger logger = LoggerFactory.getLogger(LoginFilter.class);
     /**
      * 配置过滤类型，有四种不同生命周期的过滤器类型
      * 1. pre：路由之前
      * 2. routing：路由之时
      * 3. post：路由之后
      * 4. error：发送错误调用
     */
    @Override
    public String filterType() {
        return "pre";
    }
     /**
     　* 配置过滤的顺序
     　*/
    @Override
    public int filterOrder() {
        return 0;
    }

     /**
     　* 配置是否需要过滤：true/需要，false/不需要
     　*/
    @Override
    public boolean shouldFilter() {
        return false;
    }
     /**
     　* 过滤器的具体业务代码
     　* @param
     　*/
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        logger.info("{} >>> {}", request.getMethod(), request.getRequestURL().toString());
        String token = request.getParameter("token");
        if (token == null) {
            logger.warn("Token is empty");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("Token is empty");
            } catch (IOException e) {
            }
        } else {
            logger.info("OK");
        }
        return null;
    }
}
