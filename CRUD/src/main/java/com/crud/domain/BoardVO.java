package com.crud.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


import java.util.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class BoardVO {
	Integer bno;
	String title;
	String content;
	String writer;
	Date regdate;
	int viewcnt;	
}
