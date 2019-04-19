package io.anuke.arc.tiled;

import io.anuke.arc.collection.Array;
import io.anuke.arc.maps.MapObject;

public class BaseTileLayer{
    public String name;
    public Array<MapObject> objects = new Array<>();
    public TileProperties properties = new TileProperties();
}
