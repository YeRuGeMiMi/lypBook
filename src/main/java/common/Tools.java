package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类
 * Created by lyp on 2015/1/19 0019.
 */
public class Tools {

    /**
     * 时间字符串格式化成时间戳
     * @return
     */
    public static int dateStr2Timetamp(String temp,String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date d = null;
        int result = 0;
        try {
            d = sdf.parse(temp);
            Long l = d.getTime()/1000L;
            result = Integer.valueOf(l.toString());

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 0;
        }

        return result;
    }

    /**
     * 时间戳转换成时间字符串
     * @param tamp
     * @param pattern
     * @return
     */
    public static String timeTamp2DateStr(int tamp,String pattern){
        SimpleDateFormat dsf = new SimpleDateFormat(pattern);
        long lcc_time = Long.valueOf(tamp);
        String re_strTime = dsf.format(new Date(lcc_time*1000L));
        return re_strTime;
    }
}
