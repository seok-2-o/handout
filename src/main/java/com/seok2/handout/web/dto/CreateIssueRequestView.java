package com.seok2.handout.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static com.google.common.base.Preconditions.checkArgument;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public final class CreateIssueRequestView {

    private int participants;
    private int amount;

    public void validate() {
        checkArgument(participants  >= 1 , "최소 참가 인원은 1명 입니다.");
        checkArgument(amount  >= participants * 1 , "최소 금액은 " + participants * 1 + "원 입니다.");
    }

}
