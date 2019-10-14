package com.example.SanChain.block;

import com.example.SanChain.transaction.Transaction;
import com.example.SanChain.util.StringUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class Block {

    private String hash;
    private String previousHash;
    private Transaction transaction;
    private Long timestamp;


    public Block(String previousHash, Transaction transaction) {
        this.previousHash = previousHash;
        this.transaction = transaction;
        this.timestamp = new Date().getTime();
        this.hash = calculateHash();
    }

    private String calculateHash(){
        return StringUtil.applySha256(
                previousHash
                + Long.toString(timestamp)
                + transaction
        );
    }
}
