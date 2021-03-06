package com.operation.management.common;

import org.springframework.data.domain.Sort;
//order by 설정
public class GetSort {
     public static final Sort getSort(String column, String order) {
          Sort sort = null; 
          if("asc".equals(order)) {
               sort = Sort.by(column).ascending();
         }else if("desc".equals(order)){
              sort = Sort.by(column).descending(); 
            }else {
                 sort = Sort.by("id").ascending();
                 } 
                 return sort;
                } 
            }

