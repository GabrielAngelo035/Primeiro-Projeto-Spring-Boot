package ifsuldeminas.bcc.PrimeiroProjeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

@RestController
public class CalendarController {

    @GetMapping("/data")
    public String data() {
        Date data = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        return "Hoje é " + data;
    }

    @GetMapping("/datax")
    public String datax(int x) {
        Date data = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.DAY_OF_MONTH, x);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(calendar.getTime());

        return "Hoje + " + x + " dias é " + formattedDate;
    }


}
