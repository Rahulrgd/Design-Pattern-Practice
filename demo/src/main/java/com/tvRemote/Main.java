package com.tvRemote;

public class Main {
    public static void main(String[] args) {
        TV oldRemoteTV = new Sony(new OldRemote());
        oldRemoteTV.on();
        oldRemoteTV.off();
    }
}
