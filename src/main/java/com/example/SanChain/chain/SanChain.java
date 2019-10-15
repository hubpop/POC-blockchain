package com.example.SanChain.chain;

import com.example.SanChain.block.Block;

import java.util.ArrayList;

public class SanChain {

    public static ArrayList<Block> blockchain = new ArrayList<>();

    public static Boolean isChainValid(){
        Block currentBlock;
        Block previousBlock;

        for (int i = 1; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);

            if(!currentBlock.getPreviousHash().equals(previousBlock.getHash())){
                return false;
            }
        }
        return true;
    }


}
