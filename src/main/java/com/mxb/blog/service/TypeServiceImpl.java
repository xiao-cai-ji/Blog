package com.mxb.blog.service;

import com.mxb.blog.NotFoundException;
import com.mxb.blog.dao.TypeRepository;

import com.mxb.blog.po.Type;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.awt.print.Pageable;

/**
 * @author Meng
 * @data 2022/6/16 15:44
 */
@Service
public class TypeServiceImpl implements TypeService{
    @Autowired
    private TypeRepository typeRepository;
    @Transactional
    @Override
    public Type saveType(Type type) {
        return typeRepository.save(type);
    }
    @Transactional
    @Override
    public Type getType(Long id) {
        return typeRepository.findOne(id);
    }
    @Transactional
    @Override
    public Page<Type> listType(Pageable pageable) {
        return typeRepository.findAll((org.springframework.data.domain.Pageable) pageable);
    }
    @Transactional
    @Override
    public Type updateType(Long id, Type type) {
        Type t=typeRepository.findOne(id);
        if(t==null){
            throw new NotFoundException("该类型不存在");
        }
        BeanUtils.copyProperties(type,t);

        return typeRepository.save(t);
    }
    @Transactional
    @Override
    public void deleteType(Long id) {
        typeRepository.delete(id);
    }
}
