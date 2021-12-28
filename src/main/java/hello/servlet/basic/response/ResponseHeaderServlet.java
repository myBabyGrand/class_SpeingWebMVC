package hello.servlet.basic.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.Encoder;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //[status-line]
        response.setStatus(HttpServletResponse.SC_OK);

        //response header
//        response.setHeader("Content-type", "text/plain;charset=utf-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("my-header", "hello");

        //header 편의 메서드
        content(response);
        cookie(response);
        redirect(response);

        PrintWriter writer = response.getWriter();
        writer.println("OK");
    }

    private void redirect(HttpServletResponse response) throws IOException {
        //Status Code 302
        //Location : /basic/hello-form.html
//        response.setStatus(HttpServletResponse.SC_FOUND);//over-write 한다
//        response.setHeader("Location", "/basic/hello-form.html");
        response.sendRedirect("/basic/hello-form.html");
    }

    private void cookie(HttpServletResponse response) {
        /**
         * Set-Cookie:myCookie=good; Max-Age=600;
         * response.setHeader("Set-Cookie", "myCookie"="good"; "Max-Age"="600");
         * */
        Cookie cookie = new Cookie("myCookie", "good");
        cookie.setMaxAge(600);//600s
        response.addCookie(cookie);

    }


    private void content(HttpServletResponse response) {
        /**
         * Content-Length: 4
         * Content-Type: text/plain;charset=utf-8
         * response.setHeader("Content-Length", 4); //생략가능, 자동생성됨
         * response.setHeader("Content-type", "text/plain;charset=utf-8");
         */
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
    }

}

