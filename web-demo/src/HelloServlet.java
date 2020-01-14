import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@WebServlet("/aaa")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        DateFormat df=DateFormat.getDateInstance();
//        DateFormat df2=DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
//        String date = df.format(new Date());
//        String time=df2.format(new Date());
//        System.out.println(date+time);
//        resp.getWriter().append(date+time);
        Date date =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateNowStr = sdf.format(date);
        System.out.println("格式化后的日期：" + dateNowStr);
        resp.getWriter().append(dateNowStr);

    }
}
