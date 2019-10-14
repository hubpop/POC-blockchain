package com.example.SanChain;

import com.example.SanChain.block.Block;
import com.example.SanChain.transaction.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class SanChainApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanChainApplication.class, args);

		Transaction transaction = new Transaction(BigDecimal.TEN);
		Block genesisBlock = new Block("0",transaction);
		System.out.println(genesisBlock + "\n");

		Transaction transaction2 = new Transaction(BigDecimal.TEN);
		Block secondBlock = new Block(genesisBlock.getHash(),transaction2);
		System.out.println(secondBlock + "\n");

		Transaction transaction3 = new Transaction(BigDecimal.TEN);
		Block thirdBlock = new Block(secondBlock.getHash(),transaction3);
		System.out.println(thirdBlock + "\n");


	}

}
