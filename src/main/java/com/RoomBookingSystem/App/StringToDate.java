package com.RoomBookingSystem.App;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
        public Date ToDate(String ddMMyyyy)throws Exception {
            String sDate1=ddMMyyyy;
            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
            return date1;
        }

        public Date ToTime(String HHmm)throws Exception {
            String sTime1=HHmm;
            Date Time1=new SimpleDateFormat("HH:mm").parse(sTime1);
            return Time1;
        }
}

