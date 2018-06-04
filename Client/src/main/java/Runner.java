
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Runner {

    public static void main(String[] args) {

        InputStream is = null;
        OutputStream os = null;
        HttpURLConnection conn = null;

        try {
            URL wsUrl = new URL("http://localhost:8080/ws");

            conn = (HttpURLConnection) wsUrl.openConnection();

            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");

            os = conn.getOutputStream();

            //请求体
            String soap = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"\n" +
                    "                  xmlns:gs=\"http://example.com/webservices/service\">\n" +
                    "    <soapenv:Header/>\n" +
                    "    <soapenv:Body>\n" +
                    "        <gs:getCourseRequest>\n" +
                    "            <gs:name>数据结构与基础</gs:name>\n" +
                    "        </gs:getCourseRequest>\n" +
                    "    </soapenv:Body>\n" +
                    "</soapenv:Envelope>";

            os.write(soap.getBytes());

            is = conn.getInputStream();

            byte[] b = new byte[1024];
            int len = 0;
            String s = "";
            while((len = is.read(b)) != -1){
                String ss = new String(b,0,len,"UTF-8");
                s += ss;
            }
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(conn != null){
                conn.disconnect();
            }
        }
    }
}
