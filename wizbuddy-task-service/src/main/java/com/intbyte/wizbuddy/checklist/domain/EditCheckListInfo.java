package com.intbyte.wizbuddy.checklist.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EditCheckListInfo {

    private String checkListTitle;
    private Boolean checkListFlag;
    private LocalDateTime updatedAt;
}
