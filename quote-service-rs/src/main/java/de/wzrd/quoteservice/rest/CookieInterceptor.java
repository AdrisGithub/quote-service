//package de.wzrd.quoteservice.rest;
//
//import jakarta.servlet.http.Cookie;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import java.util.Random;
//import java.util.UUID;
//
//@Configuration
//@EnableWebMvc
//@Slf4j
//public class CookieInterceptor implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new CookieHandlerInterceptor());
//    }
//
//    static class CookieHandlerInterceptor implements HandlerInterceptor {
//        @Override
//        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//            if (request.getCookies() != null) {
//                for (Cookie cookie : request.getCookies()) {
//                    log.info("{} {}", cookie.getMaxAge(), cookie.getName());
//                }
//            }
//            final Cookie cookie = new Cookie("SESSION_ID", UUID.randomUUID().toString());
//            //cookie.setMaxAge(60 * 60 * 3);
//            cookie.setHttpOnly(true);
//            cookie.setPath("/");
//            response.addCookie(cookie);
//            return true;
//        }
//    }
//}
