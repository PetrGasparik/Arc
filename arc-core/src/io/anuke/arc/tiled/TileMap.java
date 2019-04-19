package io.anuke.arc.tiled;

import io.anuke.arc.collection.Array;

//TODO implement disposable
public class TileMap{
    public Array<TileSet> tilesets = new Array<>();
    public Array<TileLayer> layers = new Array<>();
    public TileProperties properties = new TileProperties();

}
