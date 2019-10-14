package com.example.SanChain.transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Transaction {

    BigDecimal amount;

}
