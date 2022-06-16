package com.mxb.blog.service;

import com.mxb.blog.po.Type;
import org.springframework.data.domain.Page;


import java.awt.print.Pageable;

public interface TypeService {
    Type saveType(Type type);
    Type getType(Long id);
    Page<Type> listType(Pageable pageable);
    Type updateType(Long id,Type type);
    void deleteType(Long id);
}
