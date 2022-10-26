package com.service.Impl;

import com.models.Mail;
import com.service.MailService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MailServiceImpl implements MailService {
    private static List<Mail> mailList = new ArrayList<>();

    static {
        mailList.add(new Mail("Chinese", "15", "Enable spams fillter", "Trường đẹp trai vô địch thanh lịch khắp vũ trụ"));
    }

    @Override
    public List<Mail> showList() {
        return mailList;
    }

    @Override
    public void addNewForm(Mail mail) {
        mailList.add(mail);
    }
}
