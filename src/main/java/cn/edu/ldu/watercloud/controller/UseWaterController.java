package cn.edu.ldu.watercloud.controller;

import cn.edu.ldu.watercloud.entity.result.WaterEveryQuarter;
import cn.edu.ldu.watercloud.entity.result.WaterFormYear;
import cn.edu.ldu.watercloud.mapper.UseWaterMapper;
import cn.edu.ldu.watercloud.utils.DownloadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */

@RestController
@RequestMapping("/water")
@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders = "*", allowCredentials = "true")
public class UseWaterController {
    @Autowired
    UseWaterMapper useWaterMapper;
    @PostMapping("/selectWaterFormYear")
    public List<WaterFormYear> SelectWaterFormYear() {
        List<WaterFormYear> ret = new ArrayList();

        List<WaterEveryQuarter> waterEveryQuarters = useWaterMapper.queryByQuarter(1);

        for(WaterEveryQuarter water:waterEveryQuarters) {
            WaterFormYear t = new WaterFormYear(water.getUserName(), water.getUserId(), water.getYear());
            t.setQ1st(water.getThisQuarter());
            ret.add(t);
        }
        int siz = waterEveryQuarters.size();
        System.out.println(ret.size());
        for(int i = 2;i <= 4;i ++) {
            List<WaterEveryQuarter> tmp = useWaterMapper.queryByQuarter(i);
            int idx = 0;
            for(WaterEveryQuarter t:tmp) {
                if(i == 2) ret.get(idx).setQ2nd(t.getThisQuarter());
                else if(i == 3) ret.get(idx).setQ3rd(t.getThisQuarter());
                else if(i == 4) ret.get(idx).setQ4th(t.getThisQuarter());
                idx += 1;
            }
        }
        return ret;
    }
    @PostMapping("/export")
    public void Export(HttpServletResponse response) throws IOException {
        List<WaterFormYear> list = SelectWaterFormYear();
        DownloadUtils exp = new DownloadUtils();

        Calendar nowYearMonth = Calendar.getInstance();
        int year = nowYearMonth.get(Calendar.YEAR);
        int month = nowYearMonth.get(Calendar.MONTH) + 1;
        int day = nowYearMonth.get(Calendar.DAY_OF_MONTH);
        String name = "UseWaterQuarterly" + String.valueOf(year % 100) + String.valueOf(month) + String.valueOf(day)
                +String.valueOf(System.currentTimeMillis()) + ".xls";
        exp.export(list, name);

        //添加浏览器下载本地文件
        /*
        String path = name;
        InputStream inputStream = new FileInputStream(path);// 文件的存放路径
        response.reset();
        response.setContentType("application/force-download");
        String filename = new File(path).getName();
        response.addHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(filename, "UTF-8"));
        ServletOutputStream outputStream = response.getOutputStream();
        byte[] b = new byte[1024];
        int len;
//从输入流中读取一定数量的字节，并将其存储在缓冲区字节数组中，读到末尾返回-1
        while ((len = inputStream.read(b)) > 0) {
            outputStream.write(b, 0, len);
        }
        inputStream.close();
         */
        File file = new File(name);
//        System.out.println("->" + name);

        response.setContentType("application/force-download");
        response.addHeader("Content-disposition", "attachment;fileName=" + name);

//        response.reset();
//        response.setHeader("Accept-Ranges", "bytes");
//        //设置文件下载是以附件的形式下载
//        response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", name));
//        response.addHeader("Content-Length", String.valueOf(file.length()));
        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            OutputStream os = response.getOutputStream();
            int i = bis.read(buffer);
            while (i != -1) {
                os.write(buffer, 0, i);
                i = bis.read(buffer);
            }
        }
        //删除项目已存文件
        file.delete();
    }
    @GetMapping("/export2")
    public void Export2(HttpServletResponse response) throws IOException {
        List<WaterFormYear> list = SelectWaterFormYear();
        DownloadUtils exp = new DownloadUtils();

        Calendar nowYearMonth = Calendar.getInstance();
        int year = nowYearMonth.get(Calendar.YEAR);
        int month = nowYearMonth.get(Calendar.MONTH) + 1;
        int day = nowYearMonth.get(Calendar.DAY_OF_MONTH);
        String name = "UseWaterQuarterly" + String.valueOf(year % 100) + String.valueOf(month) + String.valueOf(day)
                +String.valueOf(System.currentTimeMillis()) + ".xls";
        exp.export(list, name);

        //添加浏览器下载本地文件
        /*
        String path = name;
        InputStream inputStream = new FileInputStream(path);// 文件的存放路径
        response.reset();
        response.setContentType("application/force-download");
        String filename = new File(path).getName();
        response.addHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(filename, "UTF-8"));
        ServletOutputStream outputStream = response.getOutputStream();
        byte[] b = new byte[1024];
        int len;
//从输入流中读取一定数量的字节，并将其存储在缓冲区字节数组中，读到末尾返回-1
        while ((len = inputStream.read(b)) > 0) {
            outputStream.write(b, 0, len);
        }
        inputStream.close();
         */
        File file = new File(name);
//        System.out.println("->" + name);

        response.setContentType("application/force-download");
        response.addHeader("Content-disposition", "attachment;fileName=" + name);

//        response.reset();
//        response.setHeader("Accept-Ranges", "bytes");
//        //设置文件下载是以附件的形式下载
//        response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", name));
//        response.addHeader("Content-Length", String.valueOf(file.length()));
        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            OutputStream os = response.getOutputStream();
            int i = bis.read(buffer);
            while (i != -1) {
                os.write(buffer, 0, i);
                i = bis.read(buffer);
            }
        }
        //删除项目已存文件
        file.delete();
    }
}
