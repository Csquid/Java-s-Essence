package ch06.a01_class;

public class Tv {
    public boolean power;
    public String  color;
    public int     channel;

    public void power()       { power = !power; }
    public void channelUp()   { channel++; }
    public void channelDown() { channel--; }
}