package rg.sqsf.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rg.sqsf.project.mapper.NewsMapper;
import rg.sqsf.project.model.News;
import rg.sqsf.project.service.impl.NewsServiceImpl;

import java.util.List;

@Service
public class NewsService implements NewsServiceImpl {
@Autowired
private NewsMapper newsMapper;
    @Override
    public List<News> findNews() {
        List<News> list=newsMapper.findNews();
        return list;
    }
}
